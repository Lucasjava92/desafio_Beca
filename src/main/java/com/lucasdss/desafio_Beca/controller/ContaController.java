package com.lucasdss.desafio_Beca.controller;

<<<<<<< Updated upstream

import java.util.List;
=======
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
>>>>>>> Stashed changes

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
<<<<<<< Updated upstream
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.lucasdss.desafio_Beca.modelo.Conta;
import com.lucasdss.desafio_Beca.service.InterService;
=======
import org.springframework.web.bind.annotation.RestController;

import com.lucasdss.desafio_Beca.modelo.Conta;
import com.lucasdss.desafio_Beca.modelo.Pessoa;

>>>>>>> Stashed changes



@Controller
@RestController
@RequestMapping("/contas")

public class ContaController {

    @Autowired
    private InterService<Conta> contaService;
    
    @ResponseStatus(HttpStatus.CREATED)
	@PostMapping
<<<<<<< Updated upstream
	public ResponseEntity<Conta> criar (@RequestBody Conta conta) {
		//Conta conta = contaService.criar(conta);
	  return new ResponseEntity<>(conta, HttpStatus.OK);
=======
	public ResponseEntity<ContaController> criar (@RequestBody ContaController conta){
		return ResponseEntity.ok().body(null);
>>>>>>> Stashed changes
	}
	
	@PutMapping
	@RequestMapping(method = RequestMethod.PUT, path = "depositar/{quantidade}/{id}") 
	public ResponseEntity<?> depositar(@PathVariable double quantidade, @PathVariable Long id) {
		return  new  ResponseEntity<> (HttpStatus.OK);
	}
	
	@PutMapping
	@RequestMapping(method = RequestMethod.PUT, path = "sacar/{quantidade}/{id}")
	public @ResponseBody void sacar(@PathVariable double quantidade , @PathVariable Long id ) 
			throws Exception {   
		if (quantidade <=  0 ) {
			throw new Exception("valor incorreto");
		}
	}
	
	@GetMapping
	@RequestMapping(method = RequestMethod.GET, path = "listar")
	public  ResponseEntity<?> listar() {
		List<Conta> contas = contaService.listar();
		return new ResponseEntity<> (contas, HttpStatus.OK);   
	}
	
<<<<<<< Updated upstream
	@GetMapping
	@RequestMapping(method = RequestMethod.GET, path= "saldo/{id}")
	public ResponseEntity<?> saldo(@PathVariable Long id ){
	return new ResponseEntity<> (Conta.getSaldo(), HttpStatus.OK);
	}
	
	@GetMapping
	@RequestMapping (method = RequestMethod.GET, path = "extratoConta/{id}" )
	public ResponseEntity<Conta> extratoConta(@PathVariable Long id ){
		return new ResponseEntity<Conta>(HttpStatus.OK); 
	
=======
	@DeleteMapping("/{id}")
	 public ResponseEntity<Conta> deletar (@PathVariable Long id){
		return ResponseEntity.noContent().build();
	}
	
	@GetMapping
	  public ResponseEntity<Conta> listar(){
		Conta conta1 = new Conta();
		conta1.setIdConta(1L);
		Conta.getSaldo();
		conta1.getLimiteSaqueDiario();
		conta1.getFlagAtivo();
		
		return ResponseEntity.ok().body(null);  
>>>>>>> Stashed changes
	}
	
	@GetMapping 
	@RequestMapping (method = RequestMethod.GET, path = "buscarConta/{id}" )
	public @ResponseBody ResponseEntity<?> controleContaAtiva(@PathVariable Long id) { 
		Conta conta = contaService.verificarConta(id);
		
		if (conta.getFlagAtivo() == false) {
			
			return new ResponseEntity<>(HttpStatus.NO_CONTENT);
		}
		return null;
	}


}

