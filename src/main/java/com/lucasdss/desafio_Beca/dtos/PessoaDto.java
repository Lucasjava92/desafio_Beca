package com.lucasdss.desafio_Beca.dtos;

import com.lucasdss.desafio_Beca.modelo.Pessoa;

public class PessoaDto {

	private Long Id;
	private String nome;
	private String cpf;
	private String dataNascimento;

	public PessoaDto() {

	}

	public PessoaDto(PessoaDto obj) {

		Id = obj.getId();
		nome = obj.getNome();
		cpf = obj.getCpf();
		dataNascimento = obj.getDataNascimento();

	}

	public Long getId() {
		return Id;
	}

	public void setId(Long id) {
		Id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public void pessoaDTO() {

	}

	public void pessoaDTO(Pessoa obj) {

	}

}
