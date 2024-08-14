package com.mercado.mercado.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity(name = "ClienteModel")
@Table(name = "cliente", schema = "sysmercado")
public class ClienteModel {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column(name = "nome", nullable = false)
	private String nome;
	@Column(name = "email", nullable = false)
	private String email;
	@Column(name = "user", nullable = false)
	private String user;
	@Column(name = "password", nullable = false)
	private String senha;
	@Column(name = "dica", nullable = false)
	private String dica;
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getDica() {
        return dica;
    }

    public void setDica(String dica) {
        this.dica = dica;
    }

}
