package com.lucasdss.desafio_Beca.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.lucasdss.desafio_Beca.modelo.Conta;
import com.lucasdss.desafio_Beca.service.implementacao.ContaService;

@Controller
@RestController
@RequestMapping("/contas")

public class ContaController {
	
	@Autowired
	private ContaService contaService;


	@PostMapping
	public ResponseEntity<Conta>salvar(@RequestBody Conta conta){
		return  new  ResponseEntity<>(conta, HttpStatus.OK );
	}
	
	
	@RequestMapping(method = RequestMethod.PUT, path = "depositar/{quantidade}/{id}")
	public  ResponseEntity<?>  depositar ( @PathVariable double quantidade, @PathVariable Long id){
		
		return  new  ResponseEntity<> (HttpStatus.OK);
	}

	@RequestMapping(method = RequestMethod.GET, path= "saldo/{id}")
	public ResponseEntity<?> saldo(@PathVariable Long id ){
	
		return new ResponseEntity<> (Conta.getSaldo(), HttpStatus.OK);
	}
	
	@RequestMapping(method = RequestMethod.PUT, path = "sacar/{quantidade}/{id}")
	public  ResponseEntity<?> sacar( @PathVariable double quantidade , @PathVariable Long id ) throws Exception {   
		if (quantidade <=  0 ) {
			throw new Exception("valor incorreto");
		}
		
		return new ResponseEntity<> ( HttpStatus . OK);
	}

	@GetMapping
	  public ResponseEntity<Conta> listar (){
		
		return  new  ResponseEntity<Conta>(HttpStatus.OK);   
	}
	
	@RequestMapping (method = RequestMethod.GET, path = "extraçãoConta/{id}" )
	public  ResponseEntity<Conta>  extratoConta (@PathVariable Long id ){
		
		return  new  ResponseEntity<Conta>(HttpStatus.OK);   
	}
	
	@RequestMapping (method = RequestMethod.GET, path = "buscarConta/{id}" )
	public  ResponseEntity<Conta> controleContaAtiva(@PathVariable Long id) {  
		
		Conta conta = contaService.verificarConta(id);
		if (conta.getFlagAtivo() == false) {
			return new ResponseEntity<> (HttpStatus .NO_CONTENT);  
		}
	
		return null;
		
		 
	}

}

