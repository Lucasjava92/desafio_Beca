package com.lucasdss.desafio_Beca.controller;
	
import  java.util.List ;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

<<<<<<< Updated upstream
import com.lucasdss.desafio_Beca.modelo.Transacao;
import com.lucasdss.desafio_Beca.service.implementacao.TransacaoService;
	
    @Controller
	@RestController
	@RequestMapping("/transacao")
	public class TransacaoController {

		@Autowired
		private TransacaoService transacaoService;

		@PostMapping
		public ResponseEntity<Transacao> depositar (@RequestBody Transacao transacao){
			transacao.setIdTransacao(2L);
			return ResponseEntity.created(null).body(transacao);
		}
		

		@DeleteMapping("/{id}")
		@RequestMapping(method = RequestMethod.DELETE, path = "deletar/{id}" )
		public  ResponseEntity<?> saldo ( @PathVariable  Long  id ){
			this.transacaoService.delete(id);
			
			return  new  ResponseEntity<> ( HttpStatus . OK );
		}

		@GetMapping
		public ResponseEntity<List<Transacao>> listar(){

			return new ResponseEntity<List<Transacao>>(HttpStatus.OK);
		}
		
		
		@GetMapping("/{id}")
		public ResponseEntity<Transacao> lisbuscarPorId(@PathVariable Long id){
			
			return new ResponseEntity<> (HttpStatus.OK);
		}

}
=======
	@PostMapping
	public ResponseEntity<Transacao> depositar(@RequestBody Transacao transacao) {
		transacao.setIdTransacao(2L);
		return ResponseEntity.created(null).body(transacao);
	}

	@PatchMapping("/{id}")
	public ResponseEntity<Conta> atualizar(@RequestBody Conta conta, @PathVariable Long id) {
		conta.setIdConta(id);
		return ResponseEntity.ok(conta);
	}

	@DeleteMapping("/{id}")
	public ResponseEntity<?> saldo(@PathVariable Long id) {
		return ResponseEntity.noContent().build();

	}

	@GetMapping
	public ResponseEntity<List<Transacao>> listar() {
     return new ResponseEntity<List<Transacao>>(HttpStatus.OK);
	}

	@GetMapping("/{id}")
	public ResponseEntity<Transacao> lisbuscarPorId(@PathVariable Long id) {
       return new ResponseEntity<>(HttpStatus.OK);
	}

}
>>>>>>> Stashed changes
