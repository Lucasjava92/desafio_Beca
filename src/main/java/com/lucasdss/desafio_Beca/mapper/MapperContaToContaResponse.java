package com.lucasdss.desafio_Beca.mapper;

import org.mapstruct.Mapper;
import com.lucasdss.desafio_Beca.dtos.response.ContaResponse;
import com.lucasdss.desafio_Beca.modelo.Conta;

@Mapper
public interface MapperContaToContaResponse {
	
	public ContaResponse toResponse(Conta conta);
	


}
