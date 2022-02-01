package com.lucasdss.desafio_Beca.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.lucasdss.desafio_Beca.modelo.Conta;
import com.lucasdss.desafio_Beca.modelo.Transacao;

@Repository
@Transactional(readOnly = false)

public interface TransacaoRepository extends JpaRepository<Transacao, Long> {
	List<Transacao> findByContaIn (Conta conta);

	
	

}
