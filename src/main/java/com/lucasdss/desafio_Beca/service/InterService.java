package com.lucasdss.desafio_Beca.service;

import java.util.List;
import org.springframework.stereotype.Service;

@Service
public interface InterService<T> {
	
	T criar (T conta);
	void deletar(Long id);
	T atualizar(T objeto, Long id);
	T obter(Long id);
	List<T> listar();

}
