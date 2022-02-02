package com.lucasdss.desafio_Beca.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.DeleteMapping;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.lucasdss.desafio_Beca.modelo.Conta;
import org.springframework.web.bind.annotation.ResponseStatus;
import com.lucasdss.desafio_Beca.service.InterService;

@RestController
@RequestMapping("/contas")

public class ContaController {
	

	@PostMapping
	public ResponseEntity<ContaController>salvar(@RequestBody ContaController conta){
		
		return  new  ResponseEntity<>(conta, HttpStatus.OK );
	}

	@PatchMapping("/{id}")
	 public ResponseEntity<Conta> atualizar(@RequestBody Conta conta,@PathVariable Long id) {
		conta.setIdConta(id);
		return ResponseEntity.ok(conta);
	}
	
	@DeleteMapping("/{id}")
	 public ResponseEntity<?> deletar (@PathVariable Long id){
		contaService.deletar(id);
		return ResponseEntity.noContent().build();
	}
	
	@GetMapping
	  public ResponseEntity<Conta> listar(){
		return ResponseEntity.ok().body(null);  
	}
	
	@GetMapping("/{id}")
	 public ResponseEntity<Conta> obter(@PathVariable Long id){
		return ResponseEntity.ok().body(null);
		
	}

}
