package com.lucasdss.desafio_Beca.modelo;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Transacao {
    
	@Id
	@GeneratedValue (strategy = GenerationType.AUTO)
	private Long idTransacao;
	
	@OneToOne()
	private Conta conta;
	
	@Column
	private double valor;
	
	@Temporal (TemporalType.TIMESTAMP)
	@Column
	private Date dataTransacao;
	
	
	public Long getIdTransacao() {
		return idTransacao;
	}
	public void setIdTransacao(Long idTransacao) {
		this.idTransacao = idTransacao;
	}
	public Conta getConta() {
		return conta;
	}
	public void setConta( Conta  conta ) {
		this.conta = conta;
	}
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}
	public Date getDataTransacao() {
		return dataTransacao;
	}
	public void setDataTransacao (Date dataTransacao) {
		this.dataTransacao = dataTransacao;
	}


}