
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Cliente c1 = new Cliente ("341.231.234-32");
		
		Produto p1 = new Produto ("X-Salada Max", "20.00");
		Produto p2 = new Produto ("Refrigerante de Cola","10.00");
		Pedido pedido1 = new Pedido (1123, c1);
		
		Item i1 = new Item(p1,2, "Sem Observação");
		Item i2 = new Item(p2, 1, "Com Gelo");
		
		pedido1.addItem(i1);
		pedido1.addItem(i2);
		
		System.out.println("Pedido " + pedido1.getNPedido());
		System.out.println("Cliente " + pedido1.getCliente().getCpf());
		System.out.println("Itens");
		
		for (Item item: pedido1.getItem()) {
			System.out.println(item.getProduto().getNome()+ ", "+item.getQuantidade() + "unidade(s), "+item.getProduto().getUnitario()+ "reais. Total " +item.getTotal()+ " reais");
		}
		System.out.println("Valor total do pedido: " + pedido1.getTotalPedido());
	}

}
