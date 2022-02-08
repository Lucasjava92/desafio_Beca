package com.lucasdss.desafio_Beca.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import  com.lucasdss.desafio_Beca.modelo.Pessoa;


@Repository
public interface PessoaRepository extends JpaRepository <Pessoa, Long> {



}
