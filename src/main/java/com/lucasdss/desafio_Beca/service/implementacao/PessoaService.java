package com.lucasdss.desafio_Beca.service.implementacao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lucasdss.desafio_Beca.modelo.Conta;
import com.lucasdss.desafio_Beca.modelo.Pessoa;
import com.lucasdss.desafio_Beca.modelo.Transacao;
import com.lucasdss.desafio_Beca.repository.PessoaRepository;
import com.lucasdss.desafio_Beca.service.InterService;


@Service
public class PessoaService implements InterService<Pessoa>{
	
	@Autowired
	private PessoaRepository pessoaRepository;
	
	
	public Pessoa salvar(Pessoa pessoa) {
		return ((PessoaRepository) pessoaRepository).salvar(pessoa);
	}
	
	public List<Pessoa> listar() {
		return pessoaRepository();
	}

	private List<Pessoa> pessoaRepository() {
		return null;
	}

	@Override
	public Pessoa criar(Pessoa conta) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deletar(Long id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Pessoa atualizar(Pessoa objeto, Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Pessoa obter(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Conta criar(Conta conta) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Conta atualizar(Conta conta, Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Transacao criar(Transacao transacao) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Conta verificarConta(Long id) {
		// TODO Auto-generated method stub
		return null;
	}


}
