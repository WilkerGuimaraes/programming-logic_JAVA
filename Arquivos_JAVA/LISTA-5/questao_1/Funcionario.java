package questao_1;

public class Funcionario extends PessoaNova {
	private int matricula;
	private double salario;
	
	public Funcionario(String nome, String sobrenome, double salario) {
		super(nome, sobrenome);
		this.salario = salario;
	}
	
	public int getMatricula() {
		return matricula;
	}
	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		if (salario >= 0) {
			this.salario = salario;
		} else {
			System.out.println("O salário não pode ser negativo. Definido como 0.");
			this.salario = 0;
		}
	}
	
	public double getSalarioPrimeiraParcela() {
		return salario * 0.6; //Deve-se colocar a expressão 0.6, pois o resultado tem que retorna um valor 'double'. Ao invés de (60 / 100), que retornaria um valo inteiro.
	}
	 
	public double getSalarioSegundaParcela() {
		return salario * 0.4;
	}
}
