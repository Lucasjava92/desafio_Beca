
package com.lucasdss.desafio_Beca.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lucasdss.desafio_Beca.modelo.Pessoa;
import com.lucasdss.desafio_Beca.service.implementacao.PessoaService;

@RestController
@RequestMapping ("/pessoa")

public class PessoaController {
	
	@Autowired
	private PessoaService pessoaService;
	
	@PostMapping
	 public ResponseEntity<Pessoa>criar(@RequestBody Pessoa pessoa){
		System.out.println(pessoa);
		
	return ResponseEntity.created(null).body(pessoa);
	
	}
	
	@GetMapping
	 public ResponseEntity<List<Object>> listar() {
		List< Pessoa > pessoas = pessoaService.listar();

		return ResponseEntity.ok(List.of (pessoas, HttpStatus.OK));
	}

}