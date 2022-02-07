package com.lucasdss.desafio_Beca.mapper;

import org.mapstruct.Mapper;

import com.lucasdss.desafio_Beca.dtos.response.TransacaoResponse;
import com.lucasdss.desafio_Beca.modelo.Transacao;

@Mapper
public interface MapperTransacaoToTransacaoResponse {
	
	public TransacaoResponse toResponse(Transacao transacao);

}
