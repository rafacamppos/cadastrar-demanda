package com.example.demo.domain;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


public class EnderecoDestino implements Serializable{
	private static final long serialVersionUID = 1L;
	
//	@Id
//	@GeneratedValue(strategy=GenerationType.IDENTITY)
//	private Integer id;
	private String logradouro;
	private String numero;
	private String complemento;
	private String bairro;
	private String cep;
	private String cidade;
	private String estado;
	
	
	public EnderecoDestino() {
		super();
	}


	public String getLogradouro() {
		return logradouro;
	}


	public String getNumero() {
		return numero;
	}


	public String getComplemento() {
		return complemento;
	}


	public String getBairro() {
		return bairro;
	}


	public String getCep() {
		return cep;
	}


	public String getCidade() {
		return cidade;
	}


	public String getEstado() {
		return estado;
	}


	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}


	public void setNumero(String numero) {
		this.numero = numero;
	}


	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}


	public void setBairro(String bairro) {
		this.bairro = bairro;
	}


	public void setCep(String cep) {
		this.cep = cep;
	}


	public void setCidade(String cidade) {
		this.cidade = cidade;
	}


	public void setEstado(String estado) {
		this.estado = estado;
	}


	public EnderecoDestino(Integer id, String logradouro, String numero, String complemento, String bairro, String cep, String cidade, String estado) {
		super();
		//this.id = id;
		this.logradouro = logradouro;
		this.numero = numero;
		this.complemento = complemento;
		this.bairro = bairro;
		this.cep = cep;
		this.cidade = cidade;
		this.estado = estado;
	}


}
