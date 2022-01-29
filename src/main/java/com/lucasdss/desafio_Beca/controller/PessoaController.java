
package com.lucasdss.desafio_Beca.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lucasdss.desafio_Beca.modelo.Pessoa;

@RestController
@RequestMapping ("/pessoa")

public class PessoaController {
	
	@PostMapping
	 public ResponseEntity<Pessoa>salvar(@RequestBody Pessoa pessoa){
		System.out.println(pessoa);
		
	return ResponseEntity.created(null).body(pessoa);
	
	}
	
	@GetMapping
	 public ResponseEntity<List<Pessoa>> listar() {
		Pessoa pessoa1 = new Pessoa();
		pessoa1.setId(1L);
		pessoa1.setNome("Joao Ciclano Fulano");
		pessoa1.setCpf("12345678900");
		
		
		return ResponseEntity.ok(List.of (pessoa1));
	}

}