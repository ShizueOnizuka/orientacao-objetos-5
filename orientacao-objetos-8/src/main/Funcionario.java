package main;

public class Funcionario {
	private String nome;
	private String cpf;
	private Double salario;
	
	//get
	public String getNome() {
		return nome;
	}
	public String getCPF() {
		return cpf;
	}
	public Double getsalario() {
		return salario;
	}
	//set
	public void setNome(String nome) {
		this.nome = nome;
	}
	public void setCPF(String cpf) {
		this.cpf = cpf;
	}
	public void setSalario(Double salario) {
		this.salario = salario;
	}
	
	public double getBonificacao() {
	return this.salario * 0.15;
	}
}
