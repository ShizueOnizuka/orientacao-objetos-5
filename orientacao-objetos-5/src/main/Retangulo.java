package main;

public class Retangulo {
	private Double base;
	private Double altura;
	
	//get
	
	public Double getBase() {
		return base;
	}
	public Double getAltura() {
		return altura;
	}
	
	//set
	
	public void setBase(Double base) {
		this.base = base;
	}
	public void setAltura(Double altura) {
		this.altura = altura;
	}
	
	//-----
	
	public Double calcularArea() {
		if(base <=0 || altura <=0) {
    		throw new IllegalArgumentException("A base ou a altura deve ser maior que zero.");
    	}
		return base * altura;
	}
	public Double calcularPerimetro() {
		if(base <=0 ||altura <=0) {
    		throw new IllegalArgumentException("A base ou a altura deve ser maior que zero.");
    	}
		return (2* base) + ( 2 * altura);
	}
}
