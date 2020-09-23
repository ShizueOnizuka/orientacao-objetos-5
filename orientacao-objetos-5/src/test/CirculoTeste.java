package test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import main.Circulo;

public class CirculoTeste {
	
	private Circulo c1;
	
	@Before
	public void beforeEach(){
		c1= new Circulo();
	}
	@After
	public void afterEach() {
		c1 = null;
	}
	@Test
	public void criarObjetoCirculo() {
		assertNotNull(c1);			
	}
	@Test
	public void presencaAtributoRaio() {
		c1.setRaio(10.0);
		assertNotNull(c1.getRaio());
	}

	@Test
	public void metodoCalcularArea() {
		c1.setRaio(10.0);
		Double valorEsperado = 314.0;
		Double valorObtido = c1.calcularArea();
		assertEquals(valorEsperado, valorObtido);
	}
	@Test
	public void metodoCalcularPerimetro() {
		c1.setRaio(2.0);
		Double valorEsperado = 12.56;
		Double valorObtido = c1.calcularPerimetro();
		assertEquals(valorEsperado, valorObtido);
	}

}
