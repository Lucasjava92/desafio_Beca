package com.lucasdss.desafio_Beca.service;

import java.util.List;
import org.springframework.stereotype.Service;

import com.lucasdss.desafio_Beca.modelo.Conta;
import com.lucasdss.desafio_Beca.modelo.Pessoa;
import com.lucasdss.desafio_Beca.modelo.Transacao;

@Service
public interface InterService<T> {
	
	 T criar (T objeto);
	 T  atualizar (T objeto, Long id);
	 List<T> listarTodos();
	 T listarPorId(Long id);
	 T excluir(Long id);
	 Pessoa criar(Pessoa pessoa);
	 Pessoa atualizar(Pessoa pessoa, Long id);
	 Conta criar(Conta conta);
	 Conta atualizar(Conta conta, Long id);
	 Transacao criar(Transacao transacao);
	
	

}
