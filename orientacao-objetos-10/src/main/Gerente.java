package main;

public class Gerente extends Funcionario {
private int senha;
private int numeroDeFuncionariosGerenciados;

public Integer getSenha() {
	return senha;
}
public Integer getNumeroDeFuncionariosGerenciados() {
	return numeroDeFuncionariosGerenciados;
	}

public void setSenha(Integer senha) {
	this.senha = senha;
	}
public void setNumeroDeFuncionariosGerenciados(Integer numeroDeFuncionariosGerenciados) {
	this.numeroDeFuncionariosGerenciados = numeroDeFuncionariosGerenciados;
	}
	public double getBonificacao() {
		return this.salario * 1.4 + 1000;
	}

public boolean autentica(int senha) {
	if (this.senha == senha) {
		System.out.println("Acesso Permitido!");
		return true;
	} else {
		System.out.println("Acesso Negado!");
		return false;
		}
	}


}
