package test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import main.Ator;
import main.Filme;
import main.Papel;

public class PapelTeste {
	@Test
	public void objectNotBeNull() {
		Ator ator1 = new Ator("Martin Freeman");
		Filme filme1 = new Filme("The Hobbit",2012);
		Papel papel1 = new Papel("Principal",true,ator1,filme1);
		assertNotNull(papel1);
	}

	@Test
	public void attributesNeedBeDefine() {
		Ator ator1 = new Ator("Martin Freeman");
		Filme filme1 = new Filme("The Hobbit",2012);
		Papel papel1 = new Papel("Principal",true,ator1,filme1);
		assertEquals(ator1,papel1.getAtor());
		assertEquals(filme1, papel1.getFilme());
		assertEquals("Principal", papel1.getNome());
		assertTrue(papel1.getPrincipal());

	}
}
