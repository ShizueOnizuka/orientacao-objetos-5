package main;

public class Quadrado {
	 private Double lado;

	 //get
	 
	 public Double getLado() {
		 return lado;
	 }
	 
	 //set
	 
	 public void setLado(Double lado) {
		 this.lado = lado;
	 }
	 
	 //------
	 
	 public Double calcularArea() {
		 if(lado <=0) {
	    		throw new IllegalArgumentException("O lado deve ser maior que zero.");
	    	}
	        return lado * lado;
	 }
	 public Double calcularPerimetro() {
	   	if(lado <=0) {
	    		throw new IllegalArgumentException("O lado deve ser maior que zero.");
	   		}
	        return 4 * lado;
	}
}
