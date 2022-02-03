package com.lucasdss.desafio_Beca.repository;

<<<<<<< Updated upstream
import java.util.List;
=======
import  java.util.List ;
>>>>>>> Stashed changes

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.lucasdss.desafio_Beca.modelo.Conta;
<<<<<<< Updated upstream
import com.lucasdss.desafio_Beca.modelo.Transacao;

@Repository
@Transactional(readOnly = false)

public interface TransacaoRepository extends JpaRepository<Transacao, Long> {
	List<Transacao> findByContaIn (Conta conta);

	
	

=======
import com.lucasdss.desafio_Beca.modelo.Transacao ;

@Repository
@Transactional(readOnly = false)
public class TransacaoRepository {

		 public interface TransacaoService extends JpaRepository<Transacao, Long> {
			List<Transacao> findByContaIn (Conta conta);

		}
>>>>>>> Stashed changes
}
