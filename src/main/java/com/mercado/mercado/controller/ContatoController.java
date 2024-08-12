package com.mercado.mercado.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.mercado.mercado.model.ContatoModel;
import com.mercado.mercado.repository.ContatoRepository;

@RestController
@RequestMapping("/contato")
public class ContatoController{

	@Autowired()
	private ContatoRepository contatoRepository;
	
	@PostMapping("/enviar")
	@ResponseStatus(HttpStatus.CREATED)
	public ResponseEntity<ContatoModel> enviarFormulario(@RequestBody ContatoModel contatos){
		contatoRepository.save(contatos);
		return new ResponseEntity<ContatoModel>(HttpStatus.OK);
	}
	
	@GetMapping("/{name}")
	@ResponseStatus(HttpStatus.OK)
	public String teste(@PathVariable String name) {
	
		return name;
	}
	
}
