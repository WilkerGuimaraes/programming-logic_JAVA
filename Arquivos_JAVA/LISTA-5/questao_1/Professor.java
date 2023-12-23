package questao_1;

public class Professor extends Funcionario {
	public Professor(String nome, String sobrenome, double salario) {
		super(nome, sobrenome, salario);
	}
	
	public double getSalarioPrimeiraParcela() {
		return getSalario();
	}
	public double getSalarioSegundaParcela() {
		return 0;
	}
}
	
	
