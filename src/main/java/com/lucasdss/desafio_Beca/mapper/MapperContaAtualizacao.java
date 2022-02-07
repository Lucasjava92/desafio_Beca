package com.lucasdss.desafio_Beca.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;

import com.lucasdss.desafio_Beca.dtos.request.ContaRequest;
import com.lucasdss.desafio_Beca.modelo.Conta;

@Mapper
public interface MapperContaAtualizacao {
	
	public void atualizar(ContaRequest contaRequest, @MappingTarget Conta conta);

}
