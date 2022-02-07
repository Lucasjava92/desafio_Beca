package com.lucasdss.desafio_Beca.dtos.request;

import lombok.Data;

@Data
public class PessoaRequest {
	
	private Long id;
	private String nome;
	private String cpf;
    private String dataNascimento;
	

}
