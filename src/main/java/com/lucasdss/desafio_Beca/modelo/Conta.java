package com.lucasdss.desafio_Beca.modelo;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

public class Conta implements Serializable {
	
	private static final long serialVersionUID = 1L;

	private Long idConta;
	
	private Pessoa pessoa;

	private List<Transacao> transacoes;
	
	private static double saldo;
	
	private double limiteSaqueDiario;
	
	private boolean flagAtivo;
	
	private String tipo;
	
	private Date dataCriacao;
	

	public Long getIdConta() {
		return idConta;
	}

	public void setIdConta(Long idConta) {
		this.idConta = idConta;
	}

	public Pessoa getPessoa() {
		return pessoa;
	}

	public void setPessoa(Pessoa pessoa) {
		this.pessoa = pessoa;
	}

	public List<Transacao> getTransacoes() {
		return transacoes;
	}

	public void setTransacoes(List<Transacao> transacoes) {
		this.transacoes = transacoes;
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

	public void setFlagAtivo(boolean flagAtivo) {
		this.flagAtivo = flagAtivo;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public Date getDataCriacao() {
		return dataCriacao;
	}

	public void setDataCriacao(Date dataCriacao) {
		this.dataCriacao = dataCriacao;
	}


	public int hashCode() {
		final int linha = 31;
		int resultado = 1;
		resultado = linha * resultado + ((idConta == null) ? 0 : idConta.hashCode());
		return resultado;
	}


	public boolean equals(Object obj) {
		if (this == obj)
			return true;  
		if (obj == null)
			return false; 
		if (getClass() != obj.getClass())
			return false; 
		Conta outro = (Conta) obj;
		if (idConta ==  null) {
			if (outro.idConta!= null)
				return false; 
		} else  if (!idConta.equals(outro.idConta))
			return false; 
		return true; 
	}


}
