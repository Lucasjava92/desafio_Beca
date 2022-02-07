package com.lucasdss.desafio_Beca.service.implement;


import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.lucasdss.desafio_Beca.dtos.request.ContaRequest;
import com.lucasdss.desafio_Beca.dtos.response.ContaResponse;
import com.lucasdss.desafio_Beca.mapper.MapperContaAtualizacao;
import com.lucasdss.desafio_Beca.mapper.MapperContaRequestToConta;
import com.lucasdss.desafio_Beca.mapper.MapperContaToContaResponse;
import com.lucasdss.desafio_Beca.modelo.Conta;
import com.lucasdss.desafio_Beca.repository.ContaRepository;


import lombok.RequiredArgsConstructor;


@RequiredArgsConstructor
@Service
public class ContaService {
	
	private final ContaRepository contaRepository;
	private final MapperContaRequestToConta mapperContaRequestToConta;
	private final MapperContaToContaResponse mapperContaToContaResponse;
	private final MapperContaAtualizacao mapperContaAtualizacao;

    
    @PostMapping
	public ContaResponse criar(ContaRequest contaRequest){
    	Conta conta = mapperContaRequestToConta.toModel(contaRequest);
    	
    	contaRepository.save(conta);
    	
    	ContaResponse contaResponse = mapperContaToContaResponse.toResponse(conta);
    	
		return contaResponse;
	}
    
    @DeleteMapping("/{id}")
	 public void deletar (Long id) {
		contaRepository.deleteById(id);
	}

	
    @PatchMapping("/{id}")
	 public ContaResponse atualizar(ContaRequest contaRequest, Long id) {
		Conta conta = contaRepository.findById(id).get();
		
		mapperContaAtualizacao.atualizar(contaRequest, conta);
		
		contaRepository.save(conta);
		
		return mapperContaToContaResponse.toResponse(conta);
	}
	
	
	@GetMapping
	  public List<ContaResponse> listar(){
		List<Conta> listConta = contaRepository.findAll();
		return listConta
				    .stream()
				    .map(mapperContaToContaResponse::toResponse)
				    .collect(Collectors.toList());
			
	}
	
	
	@GetMapping("/{id}")
	 public ContaResponse obter(@PathVariable Long id){
		Conta conta = contaRepository.findById(id).get();
		
		
		
		return mapperContaToContaResponse.toResponse(conta);
	}
	
}