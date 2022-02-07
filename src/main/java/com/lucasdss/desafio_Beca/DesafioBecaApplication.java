package com.lucasdss.desafio_Beca;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"DesafioBecaApplication"})
public class DesafioBecaApplication {

	public static void main(String[] args) {
		SpringApplication.run(DesafioBecaApplication.class, args);
	}

}
