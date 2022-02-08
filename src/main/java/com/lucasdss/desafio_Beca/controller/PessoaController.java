
package com.lucasdss.desafio_Beca.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lucasdss.desafio_Beca.dtos.request.PessoaRequest;
import com.lucasdss.desafio_Beca.dtos.response.PessoaResponse;
import com.lucasdss.desafio_Beca.service.implement.PessoaService;

import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
@RequestMapping ("/pessoa")

public class PessoaController {
	
	private final PessoaService pessoaService;
	
	@PostMapping
	 public ResponseEntity<PessoaResponse>criar(@RequestBody @Valid PessoaRequest pessoaRequest){
		PessoaResponse pessoaResponse = pessoaService.criar(pessoaRequest);
		return ResponseEntity.created(null).body(pessoaResponse);
	
	}
	
	@PatchMapping("/{id}")
	 public ResponseEntity<PessoaResponse> atualizar(@RequestBody PessoaRequest pessoaRequest,@PathVariable Long id) {
		PessoaResponse pessoaResponse = pessoaService.atualizar(pessoaRequest, id);
		
		return ResponseEntity.ok(pessoaResponse);
	}
	
	@DeleteMapping("/{id}")
	 public ResponseEntity<Void> deletar (@PathVariable Long id){
		pessoaService.deletar(id);
		return ResponseEntity.noContent().build();
	}
	
	@GetMapping
	 public ResponseEntity <List<PessoaResponse>> listar() {
	    List<PessoaResponse> listaPessoas = pessoaService.listar();
		
		return ResponseEntity.ok(listaPessoas);
	}
	
	@GetMapping("/{id}")
	 public ResponseEntity<PessoaResponse> obter(@PathVariable Long id){
	    PessoaResponse pessoaResponse = pessoaService.obter(id);
		
		return ResponseEntity.ok(pessoaResponse);
	}

}