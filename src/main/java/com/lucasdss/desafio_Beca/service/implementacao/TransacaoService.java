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
	
	public Transacao criar (Transacao transacao) {
		return ((TransacaoService) transacaoRepository).criar(transacao);
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
	public void deletar(Long id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Transacao atualizar(Transacao objeto, Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Transacao obter(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Transacao> listar() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Pessoa criar(Pessoa pessoa) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Pessoa atualizar(Pessoa pessoa, Long id) {
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
	public Conta verificarConta(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

}

