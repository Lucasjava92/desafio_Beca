package com.lucasdss.desafio_Beca.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import com.lucasdss.desafio_Beca.dtos.request.TransacaoRequest;
import com.lucasdss.desafio_Beca.modelo.Transacao;

@Mapper
public interface MapperTransacaoRequestToTransacao {
	
	@Mapping(target = "valor", source = "transacao")
	 public Transacao toModel(TransacaoRequest transacaoRequest);
}
