package questao_1;

public class Usado extends Imovel {
	private double desconto;
	
	public Usado(String endereco, double preco, double desconto) {
		super(endereco, preco);
		this.desconto = desconto;
	}
	
	public double getPrecoDesconto() {
		return desconto;
	}
	
	public void imprimirValorDesconto() {
		System.out.println("Valor do desconto: R$" + desconto);
	}
	
	public void imprimirValorFinal() {
		System.out.println("Valor final do imóvel: R$" + (super.getPreco() - desconto));
	}
}
