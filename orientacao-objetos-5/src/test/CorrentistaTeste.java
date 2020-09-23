package test;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;

import main.Correntista;

public class CorrentistaTeste {
	@Test
	public void criarObjetoCorrentista() {
		Correntista c1 = new Correntista();
		assertNotNull(c1);
	}
	@Test
	public void presencaAtributoNome() {
		Correntista c1 = new Correntista();
		c1.setNome("Bilbo");
		assertNotNull(c1.getNome());
	}
	@Test
    public void presencaAtributoCodigo(){
        Correntista c1 = new Correntista();
        c1.setCodigo(1);
        assertNotNull(c1.getCodigo());
    }
    @Test
    public void presencaAtributoEmail(){
        Correntista c1 = new Correntista();
        c1.setEmail("bilbobao@gmail.com");
        assertNotNull(c1.getEmail());
    }
    @Test
    public void presencaAtributoTelefone(){
        Correntista c1 = new Correntista();
        c1.setTelefone("11 29512493");
        assertNotNull(c1.getTelefone());
    }


}
