package com.lucasdss.desafio_Beca.service.implement;


import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.lucasdss.desafio_Beca.controller.ContaController;
import com.lucasdss.desafio_Beca.modelo.Conta;


@Service
public class ContaService {

    
    @PostMapping
	public ResponseEntity<ContaController> criar (@RequestBody ContaController conta){
		return ResponseEntity.ok().body(null);
	}

	
    @PatchMapping("/{id}")
	 public ResponseEntity<Conta> atualizar(@RequestBody Conta conta,@PathVariable Long id) {
		conta.setIdConta(id);
		return ResponseEntity.ok(conta);
	}
	

	@DeleteMapping("/{id}")
	 public ResponseEntity<Conta> deletar (@PathVariable Long id){
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