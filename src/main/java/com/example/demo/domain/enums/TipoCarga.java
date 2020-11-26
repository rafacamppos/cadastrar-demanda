package com.example.demo.domain.enums;

public enum TipoCarga {
	
	CARGA_VIVA(1, "Carga viva"), 
	EQUIPAMENTO_ELETRONICO(2, "Equipamento Eletrônico");
	
	private int cod;
	private String descricao;
	
	private TipoCarga(int cod, String descricao) {
		this.cod = cod;
		this.descricao = descricao;
	}

	public String getDescricao() {
		return descricao;
	}

	public int getCod() {
		return cod;
	}
	
	
	public static TipoCarga toEnum(Integer cod) {
		if(cod == null) {
			return null;
		}
			
		for(TipoCarga x : TipoCarga.values()) {
			if(cod.equals(cod)) {
				return x;
			}
		}
		throw new IllegalArgumentException("Id inválido: " + cod);
	}
}

