package questao_3;

public class Main {
	
	public static void main(String[] args) {
		Vendas venda1 = new Vendas();
		Vendas venda2 = new Vendas();
		
		double valorCompra = 100;
		
		double valorDesconto1 = valorCompra * venda1.obterTaxaDeDesconto(1);
		double valorDesconto2 = valorCompra * venda2.obterTaxaDeDesconto(2);
		
		double valorFinal1 = valorCompra - valorDesconto1;
		double valorFinal2 = valorCompra - valorDesconto2;
		
		System.out.println("Desconto tipo 1: 10%");
		System.out.println("Valor do desconto: " + valorDesconto1);
		System.out.println("Você pagará: " + valorFinal1);
		
		System.out.println("\nDesconto tipo 2: 30%");
		System.out.println("Valor do desconto: " + valorDesconto2);
		System.out.println("Você pagará: " + valorFinal2);
	}

}
