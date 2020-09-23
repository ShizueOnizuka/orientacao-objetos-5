package main;

public class Circulo {
	private Double raio;
	
	//get
	public Double getRaio(){
		return raio;
		
	}
	
	//set
	public void setRaio(Double raio) {
		this.raio = raio;
	}
	
	public Double calcularArea() {
		if(raio <= 0) {
    		throw new IllegalArgumentException("O raio deve ser maior que zero.");
    	}
		return 3.14 * (raio * raio);
	}
	public Double calcularPerimetro() {
		if(raio <=0) {
    		throw new IllegalArgumentException("O raio deve ser maior que zero.");
    	}
		return 2 * raio * 3.14;
	}
}
