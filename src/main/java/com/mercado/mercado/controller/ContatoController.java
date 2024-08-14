package com.mercado.mercado.controller;

import org.springframework.http.ResponseEntity;

import java.util.List;
import java.util.Optional;

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
	public ResponseEntity<ContatoModel> enviarFormulario(@RequestBody  ContatoModel contatos){
		contatoRepository.save(contatos);
		return new ResponseEntity<ContatoModel>(HttpStatus.OK);
	}
	
	@GetMapping("/{id}")
	@ResponseStatus(HttpStatus.OK)
	public ResponseEntity<ContatoModel> consultarContato(@PathVariable int id){
		Optional<ContatoModel> contato = contatoRepository.findById((long) id);
		if(contato.isPresent()) {
			return new ResponseEntity<>(contato.get(), HttpStatus.OK);
		} else {
			return new ResponseEntity<ContatoModel>(HttpStatus.NOT_FOUND);
		}
		
	}
	
	@GetMapping("/consulta/allContatos")
	@ResponseStatus(HttpStatus.OK)
	public ResponseEntity<List<ContatoModel>>consultaContatos(){
		List<ContatoModel> contatos = contatoRepository.findAll();
		return new ResponseEntity<>(contatos, HttpStatus.OK);
	}
	
}
