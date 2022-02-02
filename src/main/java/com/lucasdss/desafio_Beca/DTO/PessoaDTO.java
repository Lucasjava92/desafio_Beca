package com.lucasdss.desafio_Beca.DTO;

import java.io.Serializable;
import com.lucasdss.desafio_Beca.modelo.Pessoa;

public class PessoaDTO  {
	
	private static final Long serialVersionUID = 1L;
	
	private Long Id;
	private String nome;
	private String cpf;
	private String dataNascimento;
	
	public void pessoaDTO() {
		
	}
	public void pessoaDTO(Pessoa obj) {
		
		Id = obj.getId();
		nome = obj.getNome();
		cpf = obj.getCpf();
		//dataNascimento = obj.getDataNascimento();
		
		
	}
	
}
