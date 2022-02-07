package com.lucasdss.desafio_Beca.controller;

import lombok.RequiredArgsConstructor;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lucasdss.desafio_Beca.dtos.request.ContaRequest;
import com.lucasdss.desafio_Beca.dtos.response.ContaResponse;
import com.lucasdss.desafio_Beca.service.implement.ContaService;


@RestController
@RequestMapping("/contas")
@RequiredArgsConstructor
public class ContaController {
	
	private final ContaService contaService;


    @PostMapping
	public ResponseEntity<ContaResponse> criar(@RequestBody ContaRequest contaRequest){
    	ContaResponse contaResponse = contaService.criar(contaRequest);
    	     return ResponseEntity.created(null).body(contaResponse);
	}
    

	@DeleteMapping("/{id}")
	public ResponseEntity<Void> deletar(@PathVariable Long id){
		contaService.deletar(id);
		return ResponseEntity.noContent().build();
	}

	
    @PatchMapping("/{id}")
	 public ResponseEntity<ContaResponse> atualizar(@RequestBody ContaRequest contaRequest,@PathVariable Long id) {
		ContaResponse contaResponse = contaService.atualizar(contaRequest, id);
		return ResponseEntity.ok(contaResponse);
	}

	
	@GetMapping("/{id}")
	 public ResponseEntity<ContaResponse> obter(@PathVariable Long id){
		ContaResponse contaResponse = contaService.obter(id);
		return ResponseEntity.ok(contaResponse);
		
	}
	
	@GetMapping
	  public ResponseEntity<List<ContaResponse>> listar(){
		List<ContaResponse> listaContas = contaService.listar();
		
		return ResponseEntity.ok(listaContas);  

	}
	
}

