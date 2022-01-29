package com.lucasdss.desafio_Beca.modelo;

import java.io.Serializable;
import java.util.Date;


public class Transacao implements Serializable {

	private static final long serialVersionUID = 1L;

	private Long idTransacao;
	
	private Conta conta;
	
	private double valor;
	
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

	public int hashCode() {
		final int linha = 31;
		int resultado = 1;
		resultado = linha * resultado + ((idTransacao == null ) ? 0 : idTransacao.hashCode());
		return resultado;
	}

	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj ==  null )
			return false;
		if (getClass() != obj . getClass())
			return false;
		Transacao outro = (Transacao) obj;
		if (idTransacao ==  null ) {
			if (outro.idTransacao != null)
				return false;
		} else  if (!idTransacao.equals(outro.idTransacao))
			return false;
		return true;
	}
	

}
