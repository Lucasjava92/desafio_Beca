package com.lucasdss.desafio_Beca.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;

import com.lucasdss.desafio_Beca.dtos.request.TransacaoRequest;
import com.lucasdss.desafio_Beca.modelo.Transacao;

@Mapper
public interface MapperTransacaoAtualizacao {
	
		public void atualizar(TransacaoRequest TransacaoRequest, @MappingTarget Transacao transacao);

}
