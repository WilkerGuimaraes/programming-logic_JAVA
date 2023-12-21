package questao_1_2;

public class ControleFuncionarios {
	public static void main(String[] args) {
		Setor administracao = new Setor("Administracao");
		Setor contabilidade = new Setor("Contabilidade");
		Setor ti = new Setor("T.I.");
		
		Funcionario funcionario1 = new Funcionario("José", 20, 1200.0, ti);
		Funcionario funcionario2 = new Funcionario("Maria", 25, 3500.0, administracao);
		Funcionario funcionario3 = new Funcionario("João", 30, 875.79, contabilidade);
		
		System.out.println(funcionario1.toString());
		System.out.println(funcionario2.toString());
		System.out.println(funcionario3.toString());
	}
}
