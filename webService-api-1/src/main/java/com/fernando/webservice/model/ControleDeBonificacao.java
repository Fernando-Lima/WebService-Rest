package com.fernando.webservice.model;

public class ControleDeBonificacao {
	private double totalDeBonificacoes = 0;
	
	public void registra(Funcionario funcionario) {
		this.totalDeBonificacoes += funcionario.getBonificacao();
	}
	public double getTotalDeBonificacao(){
		return this.totalDeBonificacoes;
	}

}
