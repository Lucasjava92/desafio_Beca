package com.lucasdss.desafio_Beca.modelo;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;


import lombok.Data;

@Data
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
	
	@Column
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
	
	@Override
	public int hashCode () {
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
		Conta other = (Conta) obj;
		if (idConta ==  null) {
			if (other.idConta!= null)
				return false;
		} else  if (!idConta.equals(other.idConta))
			return false;
		return true;
	}


}

