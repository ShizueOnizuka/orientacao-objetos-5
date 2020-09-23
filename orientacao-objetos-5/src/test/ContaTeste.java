package test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertThrows;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import main.Conta;

public class ContaTeste {
	private Conta conta1;


    @Before
    public void beforeEach() {
        conta1 = new Conta();
        conta1.setNumero(1);
        conta1.setSaldo(1000.0);
    }

    @After
    public void afterEach() {

        conta1 = null;
    }

    @Test
    public void criarObjetoConta() {
        assertNotNull(conta1);
    }

    @Test
    public void presencaAtributos() {
        assertNotNull(conta1.getNumero());
        assertNotNull(conta1.getSaldo());
    }


    @Test
    public void metodoSetNumero() {
        conta1.setNumero(2);
        Integer contaigual = conta1.getNumero();
        assertEquals(contaigual, conta1.getNumero());

    }
    @Test
    public void metodoGetNumero(){
        conta1.setLimite(300.0);
        Double contaigual = conta1.getLimite();
        assertEquals(contaigual, conta1.getLimite());
    }

    @Test
    public void metodoDepositar() {
        conta1.setLimite(200.0);
        Double contaigual = conta1.getLimite();
        assertEquals(contaigual, conta1.getLimite());


    }

    @Test
    public void metodoDepositarValorInvalido() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> conta1.depositar(-200.0));
        assertEquals("Valor deve ser maior que zero.", exception.getMessage());
    }

    //-----------------------------------------------
    @Test
    public void metodoSacar() {
        conta1.sacar(50.0);
        Double contaigual = conta1.getLimite();
        assertEquals(contaigual, conta1.getSaldo());
    }
    //------------------------------------------------

    @Test
    public void metodoSacarValorInvalido() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> conta1.sacar(-200.0));
        assertEquals("Valor deve ser maior que zero.", exception.getMessage());

    }

    @Test
    public void metodoSacarSaldoInsuficiente() {
        conta1.setLimite(100.0);
        Exception exception = assertThrows(IllegalArgumentException.class, () -> conta1.sacar(250.0));
        assertEquals("Limite indisponível.", exception.getMessage());

    }

    //--------------------------------------------------
    @Test
    public void metodoTransferir() {
        Conta conta2 = new Conta();
        conta1.transferir(conta2, 30.0);
        Double contaigual = conta1.getSaldo();
        assertEquals(contaigual,conta1.getSaldo());
        assertEquals(contaigual,conta2.getSaldo());
    }
    //--------------------------------------------------

    @Test
    public void metodoTransferirValorInvalido() {
        Conta conta2 = new Conta();
        Exception exception = assertThrows(IllegalArgumentException.class, () -> conta1.transferir(conta2,-30.0));
        assertEquals("Valor deve ser maior que zero.", exception.getMessage());

    }

    @Test
    public void metodoTransferirSaldoInsuficiente() {
        Conta conta2 = new Conta();
        Exception exception = assertThrows(IllegalArgumentException.class, () -> conta1.transferir(conta2,250.0));
        assertEquals("Limite indisponível.", exception.getMessage());

    }

}
