package test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;

import main.Funcionarios;

public class FuncionariosTeste {
	@Test
    public void criarFuncionarios(){
        Funcionarios f1 = new Funcionarios();
        assertNotNull(f1);
    }
    @Test
    public void presencaAtributos(){
        Funcionarios f1 = new Funcionarios();
        f1.nome ="Bilbo";
        f1.email ="bilbobao@gmail.com";
        f1.idade = 4;
        f1.salario = 3000.0;
        assertNotNull(f1.nome);
        assertNotNull(f1.email);
        assertNotNull(f1.idade);
        assertNotNull(f1.salario);
    }
    
    @Test
    public void metodoPromover() {
        Funcionarios f1 = new Funcionarios();
        f1.salario = 3000.0;
        Double esperado = 3300.0;
        f1.promover(10.0);
        Double obtido = f1.salario;
        assertEquals(esperado, obtido);
    }
    
    @Test
    public void metodoObterDados(){
        Funcionarios f1 = new Funcionarios();
        f1.nome ="Bilbo bobão";
        f1.email ="bilbo@email.com";
        f1.idade = 4;
        String dadosEsperado = "Bilbo bobão, 4 anos (bilbo@email.com)";
        String dadosObtido = f1.obterDados();
        assertEquals(dadosEsperado, dadosObtido);

    }
}
