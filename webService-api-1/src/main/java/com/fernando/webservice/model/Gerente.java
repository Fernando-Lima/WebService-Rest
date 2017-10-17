package com.fernando.webservice.model;

public class Gerente extends Funcionario{
	
	int senha;
	int numeroFuncionariosGerenciados;
	public int getSenha() {
		return senha;
	}
	public void setSenha(int senha) {
		this.senha = senha;
	}
	public int getNumeroFuncionariosGerenciados() {
		return numeroFuncionariosGerenciados;
	}
	public void setNumeroFuncionariosGerenciados(int numeroFuncionariosGerenciados) {
		this.numeroFuncionariosGerenciados = numeroFuncionariosGerenciados;
	}
	@Override
	public double getBonificacao() {
		return this.salario*0.15;
	}
}
