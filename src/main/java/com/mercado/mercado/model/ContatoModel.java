package com.mercado.mercado.model;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import org.springframework.format.datetime.DateFormatter;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "contato", schema = "sysmercado")
public class ContatoModel {
	public static void main(String[] args) {
		ContatoModel contato = new ContatoModel();
		SimpleDateFormat sdf = new SimpleDateFormat("24/04/1998");
		contato.setEmail("Eduardofreitasfr@gmail.com");
		contato.setMensagem("Bem vindo");
		Calendar cal = Calendar.getInstance();
		cal.getTime();
		contato.setData(cal.getTime());
		System.out.println("Email: " +contato.getEmail());
		System.out.println("Mensagem: " +contato.getMensagem());
		System.out.println("Date: " +contato.getData());
		
	}

	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Id
	private Long id;
	@Column(name = "email", nullable = false)
	private String email;
	@Column(name = "mensagem", nullable = false)
	private String mensagem;
	@Column(name = "data", nullable = false)
	private Date data;
	private DateFormatter dataFormata;

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

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	public DateFormatter getDataFormata() {
		return dataFormata;
	}

	public void setDataFormata(DateFormatter dataFormata) {
		this.dataFormata = dataFormata;
	}

}
