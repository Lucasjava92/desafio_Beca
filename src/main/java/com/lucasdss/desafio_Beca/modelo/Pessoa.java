package com.lucasdss.desafio_Beca.modelo;

import java.util.Date;
import java.util.List;
import lombok.Data;

public class Pessoa {
	
	private Long Id;
	
	private String nome;
	
	private Data dataNascimento;
	
	private List<Conta> contas;

	private String cpf;
	
	
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
	public Data getDataNascimento() {
		return dataNascimento;
	}
	public void setDataNascimento (Date dataNascimento) {
		this.dataNascimento = (Data) dataNascimento;
	}
	public List<Conta> getContas() {
		return contas;
	}
	public void setContas (List <Conta> contas) {
		this.contas = contas;
	}

}
