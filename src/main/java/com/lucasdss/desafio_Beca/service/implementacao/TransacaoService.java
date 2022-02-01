package com.lucasdss.desafio_Beca.service.implementacao;

import  java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lucasdss.desafio_Beca.modelo.Conta;
import com.lucasdss.desafio_Beca.modelo.Pessoa;
import com.lucasdss.desafio_Beca.modelo.Transacao;
import com.lucasdss.desafio_Beca.repository.TransacaoRepository;
import com.lucasdss.desafio_Beca.service.InterService;

@Service
public class TransacaoService implements InterService<Transacao> {
	
	@Autowired
	private TransacaoRepository transacaoRepository;
	
	public Transacao salvar(Transacao transacao) {
		return ((TransacaoService) transacaoRepository).salvar(transacao);
	}
	
	public void delete (Long id) {
		transacaoRepository.deleteById(id);
	}
	
	public void buscarPeloId(Long id) {
		transacaoRepository.findById(id);
	}
	
	public List<Transacao> buscarContas(Conta conta) {
		return transacaoRepository.findByContaIn(conta);
	}

	@Override
	public Transacao criar(Transacao objeto) {
		return null;
	}

	@Override
	public Transacao atualizar(Transacao objeto, Long id) {
		return null;
	}

	@Override
	public List<Transacao> listarTodos() {
		return null;
	}

	@Override
	public Transacao listarPorId(Long id) {
		return null;
	}

	@Override
	public Transacao excluir(Long id) {
		return null;
	}

	@Override
	public Pessoa criar(Pessoa pessoa) {
		return null;
	}

	@Override
	public Pessoa atualizar(Pessoa pessoa, Long id) {
		return null;
	}

	@Override
	public Conta criar(Conta conta) {
		return null;
	}

	@Override
	public Conta atualizar(Conta conta, Long id) {
		return null;
	}

}

