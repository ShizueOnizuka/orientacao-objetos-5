package main;

public class Conta {
	private Integer numero;
    private Double saldo;
    private Double limite;
    
   //get
    
    public Integer getNumero() {
    	return numero;
    }
    
    public Double getLimite() {
    	return limite;
    }
    public Double getSaldo() {
    	return saldo;
    }
    
    //set
    
    public void setNumero(Integer numero) {
    	this.numero = numero;
    }
    public void setSaldo(Double saldo) {
    	this.saldo = saldo;
    }
    public void setLimite(Double limite) {
    	this.limite = limite;
    }
    
    //-------------
    
    public void depositar(Double valor) {
    	if(valor <=0) {
    		throw new IllegalArgumentException("Valor deve ser maior que zero.");
    	}
        saldo = saldo + valor;
    }

    public void sacar(Double valor) {
    	//caso o valor seja abaixo de zero
        if(valor <= 0){
            throw new IllegalArgumentException("Valor deve ser maior que zero.");
        }
        //caso não exista limite disponivel
        else if (saldo + limite < valor) {
            throw new IllegalArgumentException("Limite indisponível.");
        }
        saldo = saldo - valor;
    }

    public void transferir(Conta conta, Double valor) {
    	//caso o valor seja abaixo de zero
        if(valor <= 0){
            throw new IllegalArgumentException("Valor deve ser maior que zero.");
        }
        //caso não exista limite disponivel
        else if (saldo + limite < valor) {
            throw new IllegalArgumentException("Limite indisponível.");
        }
        saldo = saldo - valor;
        conta.saldo = conta.saldo + valor;
    }
}
