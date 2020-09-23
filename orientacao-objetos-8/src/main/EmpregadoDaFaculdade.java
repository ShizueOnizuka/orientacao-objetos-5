package main;

public class EmpregadoDaFaculdade {
	private String nome;
	private Double salario;
	
	public String getNome() {
		return nome;
	}
	public Double getSalario() {
		return salario;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public void setSalario(Double salario) {
		this.salario = salario;
	}
	
	public double getGastos() {
	return this.salario;
	}
	public String getInfo() {
	return "nome: " + this.nome + " com salário " + this.salario;
	}

}
