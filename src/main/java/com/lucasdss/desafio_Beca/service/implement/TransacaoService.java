package com.lucasdss.desafio_Beca.service.implement;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import com.lucasdss.desafio_Beca.modelo.Conta;
import com.lucasdss.desafio_Beca.modelo.Transacao;

@Service
public class TransacaoService {


	@PostMapping
	public ResponseEntity<Transacao> depositar(@RequestBody Transacao transacao) {
		transacao.setIdTransacao(3L);
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
