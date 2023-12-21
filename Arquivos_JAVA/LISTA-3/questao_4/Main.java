package questao_4;

import java.util.Date;

public class Main {
	
	public static void main(String[] args) {
		Date data1 = new Date();
		Date data2 = new Date();
		Date data3 = new Date();
		
		Pedidos pedido1 = new Pedidos(data1, "José", 16000);
		Pedidos pedido2 = new Pedidos(data2, "Maria", 350);
		Pedidos pedido3 = new Pedidos(data3, "Carlos", 89);
		
		System.out.println(pedido1.toString());
		System.out.println(pedido2.toString());
		System.out.println(pedido3.toString());
	}

}
