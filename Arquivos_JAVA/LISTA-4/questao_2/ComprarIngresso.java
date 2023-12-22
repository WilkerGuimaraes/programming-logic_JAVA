package questao_2;

import java.util.Scanner;

public class ComprarIngresso {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite 1 para ingresso Normal ou digite 2 para ingresso VIP: ");
		int escolhaIngresso = scanner.nextInt();
		if (escolhaIngresso == 1) {
			Normal ingressoNormal = new Normal(150);
			ingressoNormal.imprimirTipo();
			ingressoNormal.imprimirValor();
		} else if (escolhaIngresso == 2) {
			System.out.println("Digite 1 para o camarote superior ou digite 2 para o camarote inferior: ");
			int escolhaVIP = scanner.nextInt();
			if (escolhaVIP == 1) {
				CamaroteSuperior camaroteSuperior = new CamaroteSuperior(250, 50, "Setor A");
				System.out.println("Ingresso VIP - Camarote Superior");
				camaroteSuperior.imprimirValor();
				camaroteSuperior.imprimirLocalizacao();;
			} else if (escolhaVIP == 2) {
				CamaroteInferior camaroteInferior = new CamaroteInferior(250, 0, "Setor B");
				System.out.println("Ingresso VIP - Camarote Inferior");
				camaroteInferior.imprimirValor();
				camaroteInferior.imprimirLocalizacao();
			} else {
				System.out.println("Escolha VIP inválida. Programa encerrado.");
			}
		} else {
			System.out.println("Escolha do ingresso inválida. Programa encerrado.");
		}
	}
}
