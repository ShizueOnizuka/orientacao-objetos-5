package main;

public class Diretor extends Funcionario implements FuncionarioAutenticavel{

	private int	senha;

public boolean autentica(int senha) {		
		return senha== this.senha;
	}

	public	double	getBonificacao() {
	return (this.salario	*	0.10)	+	1000;
}

}