package com.lucasdss.desafio_Beca.mapper;

import org.mapstruct.Mapper;

import com.lucasdss.desafio_Beca.dtos.response.PessoaResponse;
import com.lucasdss.desafio_Beca.modelo.Pessoa;

@Mapper
public interface MapperPessoaToPessoaResponse {
	
	public PessoaResponse toResponse(Pessoa pessoa);

}
