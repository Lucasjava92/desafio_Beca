package com.lucasdss.desafio_Beca.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;

import com.lucasdss.desafio_Beca.dtos.request.PessoaRequest;
import com.lucasdss.desafio_Beca.modelo.Pessoa;

@Mapper
public interface MapperPessoaAtualizacao {
	public void atualizar(PessoaRequest pessoaRequest, @MappingTarget Pessoa pessoa);

}
