//Questão 3

package questao_3;

public class Vendas {
	private static double valorDesconto = 0.3;
	
	private double desconto;
	
	public Vendas() {
		this.desconto = valorDesconto;
	}
	
	public double obterTaxaDeDesconto(int tipoDesconto) {
		if (tipoDesconto == 1) {
			return 0.1;
		} else {
			return desconto;
		}
	}
}
