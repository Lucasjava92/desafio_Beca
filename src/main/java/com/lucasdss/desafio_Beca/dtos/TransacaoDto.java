package com.lucasdss.desafio_Beca.dtos;

public class TransacaoDto {

	private Double valor;
	private String conta;
	private String dataTransacao;
	private Long id;

	public TransacaoDto(Long id, String conta, String dataTransacao, double valor) {
		this.id = id;
		this.conta = conta;
		this.dataTransacao = dataTransacao;
		this.valor = valor;
	}

	public Double getValor() {
		return valor;
	}

	public void setValor(Double valor) {
		this.valor = valor;
	}

	public String getConta() {
		return conta;
	}

	public void setConta(String conta) {
		this.conta = conta;
	}

	public String getDataTransacao() {
		return dataTransacao;
	}

	public void setDataTransacao(String dataTransacao) {
		this.dataTransacao = dataTransacao;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

}
