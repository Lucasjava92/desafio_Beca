package com.lucasdss.desafio_Beca.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import com.lucasdss.desafio_Beca.dtos.request.ContaRequest;
import com.lucasdss.desafio_Beca.modelo.Conta;

@Mapper
public interface MapperContaRequestToConta {
	
	@Mapping(target = "tipo", source = "conta")
	public Conta toModel(ContaRequest contaRequest);


}
