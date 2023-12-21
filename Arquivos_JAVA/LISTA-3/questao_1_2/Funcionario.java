package questao_1_2;

public class Funcionario {
	private static int proximaMatricula = 1;
	private int matricula;
	private String nome;
	private int idade;
	private double salario;
	private Setor setor;
	
	public Funcionario(String nome, int idade, double salario, Setor setor) {
		this.matricula = proximaMatricula++;
		this.nome = nome;
		this.idade = idade;
		this.salario = salario;
		this.setor = setor;
	}
	
	public String getNome() {
		return nome;
	}
	public int getIdade() {
		return idade;
	}
	public double getSalario() {
		return salario;
	}
	public int getMatricula() {
		return matricula;
	}
	public Setor getSetor() {
		return setor;
	}
	
	public String toString() {
		return "Matrícula: " + matricula + " | " + "Nome: " + nome + " | " + "Idade: " + idade + " | " + "Salário: " + salario + " | " + "Setor: " + setor.codigoSetor() + "-" + setor.getNomeSetor();
	}
}
