package com.lucasdss.desafio_Beca.service.implementacao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lucasdss.desafio_Beca.modelo.Conta;
import com.lucasdss.desafio_Beca.modelo.Pessoa;
import com.lucasdss.desafio_Beca.modelo.Transacao;
import com.lucasdss.desafio_Beca.repository.ContaRepository;
import com.lucasdss.desafio_Beca.service.InterService;

@Service
public class ContaService implements InterService<Conta> {
	
	
	@Autowired
	private  ContaRepository contaRepository;
	
	@Autowired
	private TransacaoService transService;
	
	public Conta salvar(Conta conta) {
		return ((ContaService) contaRepository).salvar(conta);
	}
	
	public void deposita(double quantidade, Long id) {
		contaRepository.setFixedSaldoFor(quantidade, id);
	}
	
	public void sacar(double quantidade, Long id) {
		contaRepository.setFixedSaldo(quantidade, id);
	}
	
	public Conta buscarSado(Long id) {
		return contaRepository.findByIdConta(id);
	}
	
	public Conta verificarConta(Long id) {
		return contaRepository.findByIdConta(id);
	}
	
	public List<Transacao> extratoConta(Long id) {
		Conta conta = verificarConta(id);
		return transService.buscarContas(conta);
		
    }

	@Override
	public Conta criar(Conta objeto) {
		return null;
	}

	@Override
	public Conta atualizar(Conta objeto, Long id) {
		return null;
	}

	@Override
	public List<Conta> listarTodos() {
		return null;
	}

	@Override
	public Conta listarPorId(Long id) {
		return null;
	}

	@Override
	public Conta excluir(Long id) {
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
	public Transacao criar(Transacao transacao) {
		return null;
	}

}
