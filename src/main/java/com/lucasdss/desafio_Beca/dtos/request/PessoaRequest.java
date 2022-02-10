package com.lucasdss.desafio_Beca.dtos.request;

import java.sql.Date;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import lombok.Data;

@Data
public class PessoaRequest {
	
	private Long id;
	
	@NotBlank(message = "Este campo deve ser preenchido")
    @Size(min = 12, message = "Descrição do CPF não pode ser acima de 12 caracteres")
	private String cpf;
	
    private Date dataNascimento;
    private String nome;
    
    

    

}
