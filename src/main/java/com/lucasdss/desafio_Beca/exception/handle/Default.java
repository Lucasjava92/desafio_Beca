package com.lucasdss.desafio_Beca.exception.handle;

import java.time.LocalDateTime;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;


@ControllerAdvice
public class Default {
	   
	@ExceptionHandler(Error.class)
	public ResponseEntity<DefaultException> handle(Error e ) {
		DefaultException defaultException = new DefaultException();
		
		defaultException.setMensagem( e.getMessage() );
		defaultException.setDataHora( LocalDateTime.now() );
		defaultException.setStatus(HttpStatus.NOT_ACCEPTABLE.value() );
		
		return ResponseEntity.status(defaultException.getStatus()).body(defaultException);
		//return ResponseEntity.unprocessableEntity().body(e.getMessage());
	}
	


}
