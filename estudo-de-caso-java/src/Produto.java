import java.math.BigDecimal;

public class Produto {
	private String nome;
	private BigDecimal unitario;
	
	public Produto (String nome, String valor) {
		this.nome = nome;
		this.unitario = new BigDecimal(valor);
	}
	public String getNome() {
		return nome;
	}
	public BigDecimal getUnitario() {
		return unitario;
	}

}
