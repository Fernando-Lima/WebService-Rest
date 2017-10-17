package com.fernando.webservice.model;

public class Tecnico extends Funcionario{
	@Override
	public double getBonificacao() {
	
		return this.salario*0.15;
	}
}
