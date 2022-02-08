package com.lucasdss.desafio_Beca.service.implement;

import java.util.List;
import java.util.stream.Collectors;


import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.lucasdss.desafio_Beca.dtos.request.PessoaRequest;
import com.lucasdss.desafio_Beca.dtos.response.PessoaResponse;
import com.lucasdss.desafio_Beca.mapper.MapperPessoaAtualizacao;
import com.lucasdss.desafio_Beca.mapper.MapperPessoaRequestToPessoa;
import com.lucasdss.desafio_Beca.mapper.MapperPessoaToPessoaResponse;
import com.lucasdss.desafio_Beca.modelo.Pessoa;
import com.lucasdss.desafio_Beca.repository.PessoaRepository;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Service
public class PessoaService { 
	

	private final PessoaRepository pessoaRepository;
	private final MapperPessoaRequestToPessoa mapperPessoaRequestToPessoa;
	private final MapperPessoaToPessoaResponse mapperPessoaToPessoaResponse;
    private final MapperPessoaAtualizacao mapperPessoaAtualizacao;

	@PostMapping
	 public PessoaResponse criar(PessoaRequest pessoaRequest){
		if(pessoaRequest.getCpf().length() <= 11) {
			throw new Error("CPF não pode ter menos de 11 caracteres");
		}
		
		Pessoa pessoa = mapperPessoaRequestToPessoa.toModel(pessoaRequest);
		
		pessoaRepository.save(pessoa);
		
		PessoaResponse pessoaResponse = mapperPessoaToPessoaResponse.toResponse(pessoa);
		
	return pessoaResponse;
	
	}
	
	@DeleteMapping("/{id}")
	 public void deletar(Long id) {
		pessoaRepository.deleteById(id);
	
	}
	
	
	@PatchMapping("/{id}")
	public PessoaResponse atualizar(PessoaRequest pessoaRequest, Long id){
		Pessoa pessoa = pessoaRepository.findById(id).get();
		
		mapperPessoaAtualizacao.atualizar(pessoaRequest, pessoa);
		
		pessoaRepository.save(pessoa);
		
		return mapperPessoaToPessoaResponse.toResponse(pessoa);
	}
	
	
	@GetMapping
	 public List<PessoaResponse> listar() {
		List<Pessoa> listaPessoas = pessoaRepository.findAll();
		
		return listaPessoas
		       .stream()
		       .map(mapperPessoaToPessoaResponse::toResponse)
		       .collect(Collectors.toList());

		
		
	}
	
	@GetMapping("/{id}")
	 public PessoaResponse obter(@PathVariable Long id){
		Pessoa pessoa = pessoaRepository.findById(id).get();
		
		if(pessoa == null) {
			throw new RuntimeException("Pessoa com esse Id NÃO ENCONTRADO!");
		}
		
		
		return mapperPessoaToPessoaResponse.toResponse(pessoa);
	}


}