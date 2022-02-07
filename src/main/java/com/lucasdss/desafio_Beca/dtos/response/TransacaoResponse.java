package com.lucasdss.desafio_Beca.dtos.response;

import lombok.Data;

@Data
public class TransacaoResponse {

	private Long id;
	private Double valor;
	private String conta;
	private String dataTransacao;
	

}
