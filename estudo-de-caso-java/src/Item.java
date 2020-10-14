import java.math.BigDecimal;

public class Item {
	private Integer quantidade;
	private String observacao;
	private Produto produto;
	
	public Item(Produto produto, Integer quantidade, String observacao) {
		this.produto = produto;
		this.observacao = observacao;
		this.quantidade = quantidade;
	}
	
	public Produto getProduto() {
		return produto;
	}
	public Integer getQuantidade() {
		return quantidade;
	}
	public String getObservacao() {
		return observacao;
	}
	public BigDecimal getTotal() {
		return produto.getUnitario().multiply(new BigDecimal(quantidade.toString()));
				
	}
}
