package com.lucasdss.desafio_Beca.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.lucasdss.desafio_Beca.modelo.Transacao ;


@Repository
public interface TransacaoRepository extends JpaRepository<Transacao, Long> {



	 

}