package com.lucasdss.desafio_Beca.repository;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.lucasdss.desafio_Beca.modelo.Conta;
import com.lucasdss.desafio_Beca.modelo.Transacao ;


@Repository
public class TransacaoRepository {

	 public interface TransacaoService extends JpaRepository<Transacao, Long> {
		
			List<Transacao> findByContaIn (Conta conta);

	 }

}
