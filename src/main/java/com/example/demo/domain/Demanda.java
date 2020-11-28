package com.example.demo.domain;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

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
	private TipoCarga tipoCarga;
	private String logradouroOrigem;
	private String numeroOrigem;
	private String complementoOrigem;
	private String bairroOrigem;
	private String cepOrigem;
	private String cidadeOrigem;
	private String estadoOrigem;
	private String telefone;



	public String getLogradouroOrigem() {
		return logradouroOrigem;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public void setLogradouroOrigem(String logradouroOrigem) {
		this.logradouroOrigem = logradouroOrigem;
	}

	public String getNumeroOrigem() {
		return numeroOrigem;
	}

	public void setNumeroOrigem(String numeroOrigem) {
		this.numeroOrigem = numeroOrigem;
	}

	public String getComplementoOrigem() {
		return complementoOrigem;
	}

	public void setComplementoOrigem(String complementoOrigem) {
		this.complementoOrigem = complementoOrigem;
	}

	public String getBairroOrigem() {
		return bairroOrigem;
	}

	public void setBairroOrigem(String bairroOrigem) {
		this.bairroOrigem = bairroOrigem;
	}

	public String getCepOrigem() {
		return cepOrigem;
	}

	public void setCepOrigem(String cepOrigem) {
		this.cepOrigem = cepOrigem;
	}

	public String getCidadeOrigem() {
		return cidadeOrigem;
	}

	public void setCidadeOrigem(String cidadeOrigem) {
		this.cidadeOrigem = cidadeOrigem;
	}

	public String getEstadoOrigem() {
		return estadoOrigem;
	}

	public void setEstadoOrigem(String estadoOrigem) {
		this.estadoOrigem = estadoOrigem;
	}

	public String getLogradouroDestino() {
		return logradouroDestino;
	}

	public void setLogradouroDestino(String logradouroDestino) {
		this.logradouroDestino = logradouroDestino;
	}

	public String getNumeroDestino() {
		return numeroDestino;
	}

	public void setNumeroDestino(String numeroDestino) {
		this.numeroDestino = numeroDestino;
	}

	public String getComplementoDestino() {
		return complementoDestino;
	}

	public void setComplementoDestino(String complementoDestino) {
		this.complementoDestino = complementoDestino;
	}

	public String getBairroDestino() {
		return bairroDestino;
	}

	public void setBairroDestino(String bairroDestino) {
		this.bairroDestino = bairroDestino;
	}

	public String getCepDestino() {
		return cepDestino;
	}

	public void setCepDestino(String cepDestino) {
		this.cepDestino = cepDestino;
	}

	public String getCidadeDestino() {
		return cidadeDestino;
	}

	public void setCidadeDestino(String cidadeDestino) {
		this.cidadeDestino = cidadeDestino;
	}

	public String getEstadoDestino() {
		return estadoDestino;
	}

	public void setEstadoDestino(String estadoDestino) {
		this.estadoDestino = estadoDestino;
	}

	private String logradouroDestino;
	private String numeroDestino;
	private String complementoDestino;
	private String bairroDestino;
	private String cepDestino;
	private String cidadeDestino;
	private String estadoDestino;
	
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


	public TipoCarga getTipoCarga() {
		return tipoCarga;
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

	public Demanda(Integer id, String nome, String email, String cpfOuCnpj, TipoCarga tipoCliente, String logradouroOrigem, String numeroOrigem, String complementoOrigem,
				   String bairroOrigem, String cepOrigem, String cidadeOrigem, String estadoOrigem, String logradouroDestino,
				   String numeroDestino, String complementoDestino, String bairroDestino, String cepDestino, String cidadeDestino,
				   String estadoDestino, Date dataRetirada, Date dataEntrega, Double valorCarga, String telefone) {
		this.id = id;
		this.nome = nome;
		this.email = email;
		this.cpfOuCnpj = cpfOuCnpj;
		this.tipoCarga = tipoCliente;
		this.logradouroOrigem = logradouroOrigem;
		this.numeroOrigem = numeroOrigem;
		this.complementoOrigem = complementoOrigem;
		this.bairroOrigem = bairroOrigem;
		this.cepOrigem = cepOrigem;
		this.cidadeOrigem = cidadeOrigem;
		this.estadoOrigem = estadoOrigem;
		this.logradouroDestino = logradouroDestino;
		this.numeroDestino = numeroDestino;
		this.complementoDestino = complementoDestino;
		this.bairroDestino = bairroDestino;
		this.cepDestino = cepDestino;
		this.cidadeDestino = cidadeDestino;
		this.estadoDestino = estadoDestino;
		this.dataRetirada = dataRetirada;
		this.dataEntrega = dataEntrega;
		this.valorCarga = valorCarga;
		this.telefone = telefone;
	}

	public void setTipoCarga(TipoCarga tipoCarga) {
		this.tipoCarga = tipoCarga;
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
}
