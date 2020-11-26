package com.example.demo.domain;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.example.demo.domain.enums.TipoCarga;
import com.fasterxml.jackson.annotation.JsonFormat;


@Entity
public class Demanda implements Serializable{
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	private String nome;
	private String email;
	private String cpfOuCnpj;
	
	@JsonFormat(pattern = "dd/MM/yyyy")
	private Date dataRetirada;
	
	@JsonFormat(pattern = "dd/MM/yyyy")
	private Date dataEntrega;
	
	private Double valorCarga;
	
	public Date getDataRetirada() {
		return dataRetirada;
	}


	public Date getDataEntrega() {
		return dataEntrega;
	}


	public Double getValorCarga() {
		return valorCarga;
	}


	public void setDataRetirada(Date dataRetirada) {
		this.dataRetirada = dataRetirada;
	}


	public void setDataEntrega(Date dataEntrega) {
		this.dataEntrega = dataEntrega;
	}


	public void setValorCarga(Double valorCarga) {
		this.valorCarga = valorCarga;
	}


	private TipoCarga tipoCliente;
	private EnderecoOrigem enderecoOrigem;
	private EnderecoDestino enderecoDestino;
	
	


	public Integer getId() {
		return id;
	}


	public String getNome() {
		return nome;
	}


	public String getEmail() {
		return email;
	}


	public String getCpfOuCnpj() {
		return cpfOuCnpj;
	}


	public TipoCarga getTipoCliente() {
		return tipoCliente;
	}


	public EnderecoOrigem getEnderecoOrigem() {
		return enderecoOrigem;
	}


	public EnderecoDestino getEnderecoDestino() {
		return enderecoDestino;
	}


	public void setId(Integer id) {
		this.id = id;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public void setCpfOuCnpj(String cpfOuCnpj) {
		this.cpfOuCnpj = cpfOuCnpj;
	}


	public void setTipoCliente(TipoCarga tipoCliente) {
		this.tipoCliente = tipoCliente;
	}


	public void setEnderecoOrigem(EnderecoOrigem enderecoOrigem) {
		this.enderecoOrigem = enderecoOrigem;
	}


	public void setEnderecoDestino(EnderecoDestino enderecoDestino) {
		this.enderecoDestino = enderecoDestino;
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Demanda other = (Demanda) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}


	public Demanda() {
		super();
	}


	public Demanda(Integer id, String nome, String email, String cpfOuCnpj, Date dataRetirada, Date dataEntrega,
			Double valorCarga, TipoCarga tipoCliente, EnderecoOrigem enderecoOrigem, EnderecoDestino enderecoDestino) {
		super();
		this.id = id;
		this.nome = nome;
		this.email = email;
		this.cpfOuCnpj = cpfOuCnpj;
		this.dataRetirada = dataRetirada;
		this.dataEntrega = dataEntrega;
		this.valorCarga = valorCarga;
		this.tipoCliente = tipoCliente;
		this.enderecoOrigem = enderecoOrigem;
		this.enderecoDestino = enderecoDestino;
	}


	
}
