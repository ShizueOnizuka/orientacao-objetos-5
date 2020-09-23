package test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;

import main.Retangulo;

public class RetanguloTeste {
	@Test
    public void criarObjetoRetangulo(){
        Retangulo q1 = new Retangulo();
        assertNotNull(q1);
    }
    @Test
    public void presencaAtributoBase(){
        Retangulo q1 = new Retangulo();
        q1.setBase(10.0);
        assertNotNull(q1.getBase());
    }
    @Test
    public void presencaAtributosAltura(){
        Retangulo q1 = new Retangulo();
        q1.setAltura(5.0);
        assertNotNull(q1.getAltura());
    }
    @Test
    public void metodoCalcularArea(){
        Retangulo q1 = new Retangulo();
        q1.setAltura(5.0);
        q1.setBase(10.0);
        Double valorEsperado = 50.0;
        Double valorObtido = q1.calcularArea();
        assertEquals(valorEsperado, valorObtido);
    }
    @Test
    public void metodoCalcularPerimetro(){
        Retangulo q1 = new Retangulo();
        q1.setAltura(10.0);
        q1.setBase(50.0);
        Double valorEsperado = 120.0;
        Double valorObtido = q1.calcularPerimetro();
        assertEquals(valorEsperado, valorObtido);
    }
}
