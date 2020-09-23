package test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertThrows;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import main.Ator;
import main.Filme;

public class FilmeTeste {
	@Test
	  public void criarFilmes() {
		  Filme filme1 = new Filme("One Day",2011);
		  assertNotNull(filme1);
	  }

	  @Test
	  public void presencaAtributos() {
		  Filme filme1 = new Filme("One Day",2011);
	    assertEquals(2011, filme1.getAno());
	    assertEquals("One Day", filme1.getTitulo());
	  }

	  @Test
		public void adicionaFilmePapel() {
			Ator ator1 = new Ator("Jim Sturgess");
			Filme filme1 = new Filme("One Day",2011);
			filme1.addPapel(ator1,"Protagonista",true);
			Ator ator2 = new Ator("Anne Hathaway");
			filme1.addPapel(ator2,"Coadjuvante",false);
			assertEquals(2,filme1.getPapeis().size());
		}
	  
	  @Test
		public void naoAdicionaFilmePapel() {
			Ator ator1 = new Ator("Jim Sturgess");
			Filme filme1 = new Filme("One Day",2011);
			filme1.addPapel(ator1,"Protagonista",true);
			Ator ator2 = new Ator("Martin Freeman");		
			Exception exception = assertThrows(IllegalArgumentException.class, () -> filme1.addPapel(ator2,"Principal",true));
			assertEquals("O Ator principal já está selecionado!", exception.getMessage());
		}

	 @Test
	  public void filmeAtorPrincipal() {
		  Ator ator1 = new Ator("Jim Sturgess");
		  Filme filme1 = new Filme("One Day",2011);
		  filme1.addPapel(ator1,"Principal",true);
		  assertEquals(ator1,filme1.getPrincipal());
	  }


	  @Test
	  public void retornaListadeAtores() {
		  Ator ator1 = new Ator("Jim Sturgess");
		  Filme filme1 = new Filme("One Day",2011);
		  filme1.addPapel(ator1,"Principal",true);
		  Ator ator2 = new Ator("Anne Hathaway");
		  filme1.addPapel(ator2,"Coadjuvante",false);
		  assertTrue(filme1.getAtores().contains(ator1));
	  }

}
