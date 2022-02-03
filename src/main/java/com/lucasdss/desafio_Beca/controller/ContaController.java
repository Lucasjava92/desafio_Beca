package com.lucasdss.desafio_Beca.controller;



import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lucasdss.desafio_Beca.modelo.Conta;

@Controller
@RestController
@RequestMapping("/contas")

public class ContaController {


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
		Conta conta1 = new Conta();
		conta1.setIdConta(1L);
		Conta.getSaldo();
		conta1.getLimiteSaqueDiario();
		conta1.getFlagAtivo();
		
		return ResponseEntity.ok().body(null);  

	}
	
	@GetMapping("/{id}")
	 public ResponseEntity<Conta> obter(@PathVariable Long id){
		return ResponseEntity.ok().body(null);
		
	}
	
}

