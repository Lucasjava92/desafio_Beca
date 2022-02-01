package com.lucasdss.desafio_Beca.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.transaction.annotation.Transactional;

import com.lucasdss.desafio_Beca.modelo.Conta;

@Transactional(readOnly = false)
public interface ContaRepository extends JpaRepository<Conta, Long> {
	
	@Modifying
	@Query("update Conta c set c.saldo = c.saldo + ? 1 onde c.idConta = ?2 ")
	void setFixedSaldoFor(double quantidade, Long id);
	
	Conta findByIdConta (Long id);
	
	@Modifying
	@Query(" update Conta c set c.saldo = c.saldo - ? 1 onde c.idConta = ?2 ")
	void  setFixedSaldo (double quant, Long id);
	
	

}