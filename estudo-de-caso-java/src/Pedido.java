import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Pedido {
	private Integer nPedido;
	private Cliente cliente;
	private List<Item> listaItem;
	
	public Pedido (Integer nPedido, Cliente cliente) {
		this.nPedido = nPedido;
		this.cliente = cliente;
		this.listaItem = new ArrayList<>();
	}
	public Integer getNPedido() {
		return nPedido;
	}
	public Cliente getCliente() {
		return cliente;
	}
	public List<Item>getItem(){
		return listaItem;
	}
	public void addItem (Item item) {
		this.listaItem.add(item);
	}
	public BigDecimal getTotalPedido() {
		BigDecimal total = new BigDecimal ("0");
		for(Item item: this.listaItem) {
			total = total.add(item.getTotal());
		}
		return total;
	}
}
