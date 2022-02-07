package com.lucasdss.desafio_Beca.modelo;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Transacao {
    
	@Id
	@GeneratedValue (strategy = GenerationType.AUTO)
	private Long idTransacao;
	
	@OneToOne()
	private Conta conta;
	
	@Column
	private double valor;
	
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
	public void setConta(Conta  conta ) {
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
	
	@Override
	public int hashCode () {
		final int linha = 31;
		int resultado = 1;
		resultado = linha * resultado + ((idTransacao == null) ? 0 : idTransacao.hashCode());
		return resultado;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Transacao other = (Transacao) obj;
		if (idTransacao ==  null) {
			if (other.idTransacao!= null)
				return false;
		} else  if (!idTransacao.equals(other.idTransacao))
			return false;
		return true;
	}
	
}