package com.lucasdss.desafio_Beca.dtos.response;

import lombok.Data;

@Data
public class ContaResponse {
	
	private Long id;
	private PessoaResponse pessoa;
	private Double saldo;
	private Double limiteSaqueDiario;
	private Boolean flagAtivo;
	private String tipo;
	

}
