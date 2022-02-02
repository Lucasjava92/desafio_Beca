package com.lucasdss.desafio_Beca.service;

import java.util.List;
import org.springframework.stereotype.Service;
import com.lucasdss.desafio_Beca.modelo.Conta;
import com.lucasdss.desafio_Beca.modelo.Pessoa;
import com.lucasdss.desafio_Beca.modelo.Transacao;

@Service
public interface InterService<T> {
	
	T criar (T conta);
	void deletar(Long id);
	T atualizar(T objeto, Long id);
	T obter(Long id);
	List<T> listar();
	
     Pessoa criar(Pessoa pessoa);
	 Pessoa atualizar(Pessoa pessoa, Long id);
	 Conta criar(Conta conta);
	 Conta atualizar(Conta conta, Long id);
	 Transacao criar(Transacao transacao);
	 Conta verificarConta(Long id);

	
	
	

}
