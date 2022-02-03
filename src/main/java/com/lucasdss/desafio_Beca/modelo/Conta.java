package com.lucasdss.desafio_Beca.modelo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;


@Entity
public class Conta {
	
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private Long idConta;
	
	@OneToOne
	private Pessoa pessoa;
	
	@Column (nullable = false)
	private static double saldo;
	
	@Column
	private double limiteSaqueDiario;
	
	@Column(name = "flag_ativo")
	private boolean flagAtivo;
	
	@Column
	private String tipo;
	

	public Long getIdConta() {
		return idConta;
	}

	public void setIdConta(Long idConta) {
		this.idConta = idConta;
	}

	public static double getSaldo() {
		return saldo;
	}

	public void setSaldo(Double saldo) {
		Conta.saldo = saldo;
	}

	public Double getLimiteSaqueDiario() {
		return limiteSaqueDiario;
	}

	public void setLimiteSaqueDiario(Double limiteSaqueDiario) {
		this.limiteSaqueDiario = limiteSaqueDiario;
	}

	public boolean getFlagAtivo() {
		return flagAtivo;
	}

	public void setFlagAtivo(Boolean flagAtivo) {
		this.flagAtivo = flagAtivo;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public static Object findById(Long id) {
		return null;
	}


}

