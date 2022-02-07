package com.lucasdss.desafio_Beca.dtos.request;

import lombok.Data;

@Data
public class ContaRequest {
	
	private PessoaRequest pessoa;
	private Double saldo;
	private Double limiteSaqueDiario;
	private Boolean flagAtivo;
	private String tipo;

}
