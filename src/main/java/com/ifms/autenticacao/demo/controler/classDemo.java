package com.ifms.autenticacao.demo.controler;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class classDemo{
	
	@GetMapping(value="/mensagem")
	public String mensagem() {
		
		return "Olá";
	}

}
