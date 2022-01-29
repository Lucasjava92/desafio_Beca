package com.lucasdss.desafio_Beca.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.lucasdss.desafio_Beca.modelo.Conta;
import com.lucasdss.desafio_Beca.modelo.Transacao;

@Service
public class ContaService {
	
	
	@Autowired
	private TransacaoService transService;
	
	public List<Transacao> extratoConta(Long id) {
		Conta conta = verificarConta(id);
		return transService.buscarContas(conta);
		
    }

}
