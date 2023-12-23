package questao_1;

public class UsaPessoa {
	public static void main(String[] args) {
		PessoaNova pessoa1 = new PessoaNova("José", "Manoel");
		Funcionario pessoa2 = new Funcionario("Leandro", "Charles", 2000);
		Professor pessoa3 = new Professor("Rita", "Cassia", 500);
		
		System.out.println("Exibir a saída do método 'getNomeCompleto' para os 3 objetos.");
		System.out.println(pessoa1.getNomeCompleto());
		System.out.println(pessoa2.getNomeCompleto());
		System.out.println(pessoa3.getNomeCompleto());
		
		System.out.println("\nExibir a saída dos métodos 'getSalarioPrimeiraParcela' e 'getSalarioSegundaParcela' para o objeto 'pessoa2'.");
		System.out.println(pessoa2.getSalarioPrimeiraParcela());
		System.out.println(pessoa2.getSalarioSegundaParcela());
		
		System.out.println("\nExibir a saída dos métodos 'getSalarioPrimeiraParcela' e 'getSalarioSegundaParcela' para o objeto 'pessoa3'.");
		System.out.println(pessoa3.getSalarioPrimeiraParcela());
		System.out.println(pessoa3.getSalarioSegundaParcela());
	}
}
