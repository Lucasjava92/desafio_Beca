package com.lucasdss.desafio_Beca.exception.handle;

import java.time.LocalDateTime;

public class DefaultException {
	
	private Integer Status;
	private String Mensagem;
	private LocalDateTime DataHora;
	
	public Integer getStatus() {
		return Status;
	}
	public void setStatus(Integer status) {
		Status = status;
	}
	public String getMensagem() {
		return Mensagem;
	}
	public void setMensagem(String mensagem) {
		Mensagem = mensagem;
	}
	public LocalDateTime getDataHora() {
		return DataHora;
	}
	public void setDataHora(LocalDateTime dataHora) {
		DataHora = dataHora;
	}
	

}
