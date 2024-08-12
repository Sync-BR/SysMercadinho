package com.mercado.mercado.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import java.text.SimpleDateFormat;
import java.util.Date;

@Entity(name = "ContatoModels")
@Table(name = "contato", schema = "sysmercado")
public class ContatoModel  {
	public static void main(String[] args) throws Exception {
		ContatoModel contato = new ContatoModel();
		System.out.println(contato.getData());

	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column(name = "email", nullable = false)
	private String email;
	@Column(name = "mensagem", nullable = false)
	private String mensagem;
	@Column(name = "date", nullable = false )
	private String data;


	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getMensagem() {
		return mensagem;
	}

	public void setMensagem(String mensagem) {
		this.mensagem = mensagem;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		SimpleDateFormat formataData = new SimpleDateFormat("dd/MM/YYYY");
		Date dataAtual = new Date();
		this.data = formataData.format(dataAtual);
	}


}
