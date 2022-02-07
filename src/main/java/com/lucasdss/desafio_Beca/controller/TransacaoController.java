package com.lucasdss.desafio_Beca.controller;

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

import com.lucasdss.desafio_Beca.dtos.request.TransacaoRequest;
import com.lucasdss.desafio_Beca.dtos.response.TransacaoResponse;
import com.lucasdss.desafio_Beca.service.implement.TransacaoService;

import lombok.RequiredArgsConstructor;


@RequiredArgsConstructor
@RestController
@RequestMapping("/transacao")
public class TransacaoController {

private final TransacaoService transacaoService;
	
	@PostMapping
	 public ResponseEntity<TransacaoResponse>criar(@RequestBody TransacaoRequest transacaoRequest){
		TransacaoResponse transacaoResponse = transacaoService.criar(transacaoRequest);
		return ResponseEntity.created(null).body(transacaoResponse);
	
	}
	
	@PatchMapping("/{id}")
	 public ResponseEntity<TransacaoResponse> atualizar(@RequestBody TransacaoRequest transacaoRequest,@PathVariable Long id) {
		TransacaoResponse transacaoResponse = transacaoService.atualizar(transacaoRequest, id);
		
		return ResponseEntity.ok(transacaoResponse);
	}
	
	@DeleteMapping("/{id}")
	 public ResponseEntity<Void> deletar (@PathVariable Long id){
		transacaoService.deletar(id);
		return ResponseEntity.noContent().build();
	}
	
	@GetMapping
	 public ResponseEntity <List<TransacaoResponse>> listar() {
	    List<TransacaoResponse> listaTransacao = transacaoService.listar();
		
		return ResponseEntity.ok(listaTransacao);
	}
	
	@GetMapping("/{id}")
	 public ResponseEntity<TransacaoResponse> obter(@PathVariable Long id){
	    TransacaoResponse transacaoResponse = transacaoService.obter(id);
		
		return ResponseEntity.ok(transacaoResponse);
	}

}
