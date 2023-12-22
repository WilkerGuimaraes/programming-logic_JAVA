package questao_1;

public class Novo extends Imovel{
	public double adicional;
	
	public Novo(String endereco, double preco, double adicional) {
		super(endereco, preco);
		this.adicional = adicional;
	}
	
	public double getAdicional() {
		return adicional;
	}
	
	public void imprimirValorAdicional() {
		System.out.println("Valor adicional: R$" + adicional);
	}
	
	public void imprimirValorFinal() {
		System.out.println("Valor final do imóvel: R$" + (super.getPreco() + adicional));
	}
}
