package com.lucasdss.desafio_Beca.service.implement;

import java.util.List;


import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.lucasdss.desafio_Beca.modelo.Pessoa;


@Service
public class PessoaService {


	@PostMapping
	 public ResponseEntity<Pessoa>criar(@RequestBody Pessoa pessoa){
		System.out.println(pessoa);
		
	return ResponseEntity.created(null).body(pessoa);
	
	}
	
	@PatchMapping("/{id}")
	 public ResponseEntity<Pessoa> atualizar(@RequestBody Pessoa pessoa,@PathVariable Long id) {
		pessoa.setId(id);
		return ResponseEntity.ok(pessoa);
	}
	
	@DeleteMapping("/{id}")
	 public ResponseEntity<?> deletar (@PathVariable Long id){
		return ResponseEntity.noContent().build();
	}
	
	@GetMapping
	 public ResponseEntity<List<Pessoa>> listar() {
		Pessoa pessoa1 = new Pessoa();
		pessoa1.setId(1L);
		pessoa1.setNome("lucas da silva");
		pessoa1.setCpf("12345678910");
		
		
		Pessoa pessoa2 = new Pessoa();
		pessoa2.setId(1L);
		pessoa2.setNome("joao de deus");
		pessoa2.setCpf("98765432110");
		
		return ResponseEntity.ok(List.of (pessoa1, pessoa2));
	}
	
	@GetMapping("/{id}")
	 public ResponseEntity<List<Pessoa>> obter(@PathVariable Long id){
		Pessoa pessoa1 = new Pessoa();
		pessoa1.setId(1L);
		pessoa1.setNome("lucas da silva");
		pessoa1.setCpf("12345678910");
		
		
		Pessoa pessoa2 = new Pessoa();
		pessoa2.setId(1L);
		pessoa2.setNome("joao de deus");
		pessoa2.setCpf("98765432110");
		
		return ResponseEntity.ok().body(null);
	}


}