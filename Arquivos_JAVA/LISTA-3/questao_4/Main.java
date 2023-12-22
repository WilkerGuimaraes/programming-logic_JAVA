package questao_4;

public class Main {
	
	public static void main(String[] args) {
		
		Pedidos pedido1 = new Pedidos("01-03-2023", "Cliente A", 100);
		Pedidos pedido2 = new Pedidos("02-03-2023", "Cliente B", 160);
		Pedidos pedido3 = new Pedidos("03-03-2023", "Cliente C", 230);
		
		pedido1.exibirDetalhes();
		pedido2.exibirDetalhes();
		pedido3.exibirDetalhes();
	}

}
