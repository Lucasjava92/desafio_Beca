package com.lucasdss.desafio_Beca.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import com.lucasdss.desafio_Beca.dtos.request.PessoaRequest;
import com.lucasdss.desafio_Beca.modelo.Pessoa;

@Mapper
public interface MapperPessoaRequestToPessoa {
	
	 @Mapping(target = "cpf", source = "pessoa")
	 public Pessoa toModel(PessoaRequest pessoaRequest);

}
