package main;

public class ProfessorDaFaculdade extends EmpregadoDaFaculdade {
private Integer horasDeAula;

public Integer getHorasDeAula() {
	return horasDeAula;
}
public void setHorasDeAula(Integer horasDeAula) {
	this.horasDeAula = horasDeAula;
}
public double getGastos() {
return this.getSalario() + this.horasDeAula * 10;
}
public String getInfo() {
String informacaoBasica = super.getInfo();
String informacao = informacaoBasica + " horas de aula: "
+ this.horasDeAula;
return informacao;
}

}
