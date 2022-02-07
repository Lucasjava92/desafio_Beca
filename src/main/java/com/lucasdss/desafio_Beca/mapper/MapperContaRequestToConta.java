package com.lucasdss.desafio_Beca.mapper;

import org.mapstruct.Mapper;


import com.lucasdss.desafio_Beca.dtos.request.ContaRequest;
import com.lucasdss.desafio_Beca.modelo.Conta;

@Mapper
public interface MapperContaRequestToConta {
	
	
	public Conta toModel(ContaRequest contaRequest);


}
