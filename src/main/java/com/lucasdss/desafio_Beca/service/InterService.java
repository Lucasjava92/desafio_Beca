package com.lucasdss.desafio_Beca.service;

import java.util.List;
import org.springframework.stereotype.Service;

@Service
public interface InterService<T> {
	
	T criar (T objeto);
	T  atualizar (T objeto, Long id);
	List<T> listarTodos();
	T listarPorId(Long id);
	T excluir(Long id);

}
