package com.fernando.webservice.model;

public class Funcionario {
	private Long id;
	protected String nome;
	protected String cpf;
	protected double salario;
	
	public Long getId() {
		return id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	public Funcionario(Long id, String nome, String cpf, double salario) {
		super();
		this.id = id;
		this.nome = nome;
		this.cpf = cpf;
		this.salario = salario;
	}
	public Funcionario() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public double getBonificacao() {
		return this.salario*0.10;
	}
	
}
