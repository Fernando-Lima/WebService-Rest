package com.fernando.webservice.model;

public enum Status {
	PENDENTE ("Pendente"),
	CONCLUIDO("Concluido");
	
	private String descricao;
	
	Status(String descricao){
		this.descricao = descricao;
	}
	public String getDescricao() {
		return descricao;
	}
}
