package com.prueba.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class PruebaRest {

	
	@GetMapping("/")
	public String respuesta() {
		return "Hello from rest controller!";
	}
}
