package com.lucasdss.desafio_Beca.modelo;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.ser.std.DateSerializer;


@Entity
@Table(name = "pessoa")
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
	
	@JsonIgnore
	@OneToMany (mappedBy = "pessoa", fetch = FetchType.EAGER)
	private List<Conta> conta;
    
	
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


