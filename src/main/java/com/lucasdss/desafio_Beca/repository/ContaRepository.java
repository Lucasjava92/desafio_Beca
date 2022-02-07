package com.lucasdss.desafio_Beca.repository;

import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.data.jpa.repository.Modifying;
//import org.springframework.data.jpa.repository.Query;

import org.springframework.stereotype.Repository;

import com.lucasdss.desafio_Beca.modelo.Conta;


@Repository
public interface ContaRepository extends JpaRepository<Conta, Long> {

//	    @Modifying
//		@Query("Conta c set c.saldo = c.saldo + ?1 onde c.idConta = ?2 ")
//		void setSaldoFor(double quantidade, Long id);
//		
//		
//		Conta findByIdConta (Long id);
//		
//		@Modifying
//		@Query("Conta c set c.saldo = c.saldo - ?1 onde c.idConta = ?2 ")
//		void setSaldo(double quantidade, Long id);
				
	
}
		 
	



