package com.lucasdss.desafio_Beca.modelo;

<<<<<<< Updated upstream
import java.util.Date;
=======
>>>>>>> Stashed changes

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
<<<<<<< Updated upstream
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.ManyToOne;
//import javax.persistence.OneToOne;
//import com.fasterxml.jackson.annotation.JsonIgnore;
=======
import javax.persistence.OneToOne;
>>>>>>> Stashed changes

@Entity
public class Conta {
	
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private Long idConta;
	
	@ManyToOne 
	private Pessoa pessoa;
	
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

	
	
	
	
	
	
	
//	 @Override
//	public int hashCode() {
//		final int linha = 31;
//		int resultado = 1;
//		resultado = linha * resultado + ((idConta == null) ? 0 : idConta.hashCode());
//		return resultado;
//	}
//
//	@Override
//	public boolean equals(Object obj) {
//		if (this == obj)
//			return true;  
//		if (obj == null)
//			return false; 
//		if (getClass() != obj.getClass())
//			return false; 
//		Conta outro = (Conta) obj;
//		if (idConta ==  null) {
//			if (outro.idConta!= null)
//				return false; 
//		} else  if (!idConta.equals(outro.idConta))
//			return false; 
//		return true; 
//	}


}

