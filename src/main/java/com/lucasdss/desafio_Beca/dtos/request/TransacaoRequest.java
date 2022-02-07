package com.lucasdss.desafio_Beca.dtos.request;

import lombok.Data;

@Data
public class TransacaoRequest  {
	
	private Long id;
	private Double valor;
	private String conta;
	private String dataTransacao;
	
}
