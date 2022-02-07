package com.lucasdss.desafio_Beca.service.implement;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;


import com.lucasdss.desafio_Beca.dtos.request.TransacaoRequest;
import com.lucasdss.desafio_Beca.dtos.response.TransacaoResponse;
import com.lucasdss.desafio_Beca.mapper.MapperTransacaoAtualizacao;
import com.lucasdss.desafio_Beca.mapper.MapperTransacaoRequestToTransacao;
import com.lucasdss.desafio_Beca.mapper.MapperTransacaoToTransacaoResponse;
import com.lucasdss.desafio_Beca.modelo.Transacao;
import com.lucasdss.desafio_Beca.repository.TransacaoRepository;


import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Service
public class TransacaoService {
	
	private final TransacaoRepository transacaoRepository;
	private final MapperTransacaoRequestToTransacao mapperTransacaoRequestToTransacao;
	private final MapperTransacaoToTransacaoResponse mapperTransacaoToTransacaoResponse;
    private final MapperTransacaoAtualizacao mapperTransacaoAtualizacao;

	@PostMapping
	 public TransacaoResponse criar(TransacaoRequest transacaoRequest){
		if(transacaoRequest.getValor() != null) {
			throw new RuntimeException("O valor da Transação");
		}
		
		Transacao transacao = mapperTransacaoRequestToTransacao.toModel(transacaoRequest);
		
		transacaoRepository.save(transacao);
		
		TransacaoResponse transacaoResponse = mapperTransacaoToTransacaoResponse.toResponse(transacao);
		
	return transacaoResponse;
	
	}
	
	@DeleteMapping("/{id}")
	 public void deletar(Long id) {
		transacaoRepository.deleteById(id);
	
	}
	
	
	@PatchMapping("/{id}")
	public TransacaoResponse atualizar(TransacaoRequest transacaoRequest, Long id){
		Transacao transacao = transacaoRepository.findById(id).get();
		
		mapperTransacaoAtualizacao.atualizar(transacaoRequest, transacao);
		
		transacaoRepository.save(transacao);
		
		return mapperTransacaoToTransacaoResponse.toResponse(transacao);
	}
	
	
	@GetMapping
	 public List<TransacaoResponse> listar() {
		List<Transacao> listaTransacao = transacaoRepository.findAll();
		
		return listaTransacao
		       .stream()
		       .map(mapperTransacaoToTransacaoResponse::toResponse)
		       .collect(Collectors.toList());

		
		
	}
	
	@GetMapping("/{id}")
	 public TransacaoResponse obter(@PathVariable Long id){
		Transacao transacao = transacaoRepository.findById(id).get();
		
		if(transacao == null) {
			throw new RuntimeException("Transacao com esse Id NÃO ENCONTRADO!");
		}
		
		
		return mapperTransacaoToTransacaoResponse.toResponse(transacao);
	}
}
