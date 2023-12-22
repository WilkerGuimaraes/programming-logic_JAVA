package questao_1;

import java.util.Scanner;

public class VendaImovel {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite 1 para imóvel novo ou digite 2 para imóvel usado: ");
		int escolhaImovel = scanner.nextInt();
		
		if (escolhaImovel == 1) {
			Novo imovelNovo = new Novo("Rua A", 100000, 20000);
			System.out.println("Você adquiriu um imóvel novo. Endreço: " + imovelNovo.getEndereco() + ", Preço: R$" + imovelNovo.getPreco());
			imovelNovo.imprimirValorAdicional();
			imovelNovo.imprimirValorFinal();
		} else if (escolhaImovel == 2) {
			Usado imovelUsado = new Usado("Rua B", 80000, 15000);
			System.out.println("Você adquiriu um imóvel novo. Endreço: " + imovelUsado.getEndereco() + ", Preço: R$" + imovelUsado.getPreco());
			imovelUsado.imprimirValorDesconto();
			imovelUsado.imprimirValorFinal();
		} else {
			System.out.println("Escolha inválida. Programa encerrado.");
		}
	}
}
