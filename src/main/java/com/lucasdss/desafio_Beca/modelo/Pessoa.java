package com.lucasdss.desafio_Beca.modelo;

import java.util.Date;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Size;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.ser.std.DateSerializer;

@Entity
@Table
public class Pessoa {
	
	@Id
	private Long Id;
	
	@GeneratedValue (strategy = GenerationType.AUTO)
	private String nome;
	
	@Size (min = 11, max = 11)
	@Column (unique = true)
	private String cpf;
	
	@JsonSerialize (using = DateSerializer.class)
	@Column
	private Date dataNascimento;
	
	public Long getId() {
		return Id;
	}
	public void setId (Long id) {
		this.Id = id;
	}
	public String getNome () {
		return nome;
	}
	public void setNome (String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf (String cpf) {
		this.cpf = cpf;
	}
	public Date getDataNascimento() {
		return dataNascimento;
	}
	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	
}
