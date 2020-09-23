package test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import main.Ator;
import main.Filme;
import main.Papel;

public class AtorTeste {
	@Test
	public void criarAtor() {
		Ator ator1 = new Ator("Anne Hathaway");
		assertNotNull(ator1);
	}

	@Test
	public void nomeAtor() {
		Ator ator1 = new Ator("Anne Hathaway");
		assertEquals("Anne Hathaway", ator1.getNome());
	}

	@Test
	public void adicionarUmPapel() {
		Ator ator1 = new Ator("Anne Hathaway");
		Filme filme1 = new Filme("One Day",2011);
		Papel papel1 = new Papel("Principal",true,ator1,filme1);
		ator1.addPapel(papel1);
		assertTrue(ator1.getPapeis().contains(papel1));
	}

	@Test
	public void listaDeFilmes() {
		Ator ator1 = new Ator("Anne Hathaway");
		Filme filme1 = new Filme("Rio",2011);
		Filme filme2 = new Filme("Alice no País das Maravilhas",2010);

		Papel papel1 = new Papel("Principal",true,ator1,filme1 );
		Papel papel2 = new Papel("Coadjuvante",false,ator1,filme2 );

		ator1.addPapel(papel1);
		ator1.addPapel(papel2);

		assertEquals(2,ator1.getFilmes().size());
	}

	@Test
	public void seAtuouNoAno() {
		Ator ator1 = new Ator("Anne Hathaway");
		Filme filme1 = new Filme("One Day",2011);
		Papel papel1 = new Papel("Principal",true,ator1,filme1);
		ator1.addPapel(papel1);
		assertTrue(ator1.atuouNoAno(2011));
	}

	@Test
	public void seNaoAtuouNoAno() {
		Ator ator1 = new Ator("Anne Hathaway");
		Filme filme1 = new Filme("One Day",2011);
		Papel papel1 = new Papel("Principal",true,ator1,filme1);
		ator1.addPapel(papel1);
		assertFalse(ator1.atuouNoAno(2020));

	}

}
