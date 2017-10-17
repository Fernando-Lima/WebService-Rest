package com.fernando.webservice.model;

public class Secretaria extends Funcionario {

	int senha;
	int quantidadeDeAtendimentos;
	public int getSenha() {
		return senha;
	}
	public void setSenha(int senha) {
		this.senha = senha;
	}
	public int getQuantidadeDeAtendimentos() {
		return quantidadeDeAtendimentos;
	}
	public void setQuantidadeDeAtendimentos(int quantidadeDeAtendimentos) {
		this.quantidadeDeAtendimentos = quantidadeDeAtendimentos;
	}
	
	@Override
	public double getBonificacao() {
		return this.salario * 0.05;
	}
}
