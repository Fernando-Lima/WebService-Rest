package com.fernando.webservice.model;

public class Vendedor extends Funcionario{

	@Override
	public double getBonificacao() {
		return this.salario*0.10;
	}
}
