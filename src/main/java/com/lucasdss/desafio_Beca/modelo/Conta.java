package com.lucasdss.desafio_Beca.modelo;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import com.fasterxml.jackson.annotation.JsonIgnore;


@Entity
public class Conta implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue (strategy = GenerationType.AUTO)
	private Long idConta;
	
	@ManyToOne (fetch = FetchType.LAZY)
	private Pessoa pessoa;
    
	@JsonIgnore
	@OneToOne (mappedBy = "conta")
	private List<Transacao> transacao;
	
	@Column (nullable = false)
	private static double saldo;
	
	@Column
	private double limiteSaqueDiario;
	
	@Column(name = "flag_ativo")
	private boolean flagAtivo;
	
	@Column
	private String tipo;
	
	@Temporal (TemporalType.TIMESTAMP)
	@Column
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

	public List<Transacao> getTransacao() {
		return transacao;
	}

    public void setTransacoes(List<Transacao> transacao) {
		this.transacao = transacao;
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

	public Date getDataCriacao() {
		return dataCriacao;
	}

	public void setDataCriacao(Date dataCriacao) {
		this.dataCriacao = dataCriacao;
	}

	 @Override
	public int hashCode() {
		final int linha = 31;
		int resultado = 1;
		resultado = linha * resultado + ((idConta == null) ? 0 : idConta.hashCode());
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
		Conta outro = (Conta) obj;
		if (idConta ==  null) {
			if (outro.idConta!= null)
				return false; 
		} else  if (!idConta.equals(outro.idConta))
			return false; 
		return true; 
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public static void setSaldo(double saldo) {
		Conta.saldo = saldo;
	}

	public void setLimiteSaqueDiario(double limiteSaqueDiario) {
		this.limiteSaqueDiario = limiteSaqueDiario;
	}

	public void setFlagAtivo(boolean flagAtivo) {
		this.flagAtivo = flagAtivo;
	}
	
	


}

