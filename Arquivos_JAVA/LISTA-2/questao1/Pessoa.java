package questao1;

public class Pessoa {
	private String nome;
	private int idade;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String novoNome) {
		this.nome = novoNome;
	}
	
	public int getIdade() {
		return idade;
	}
	public void setIdade(int novaIdade) {
		this.idade = novaIdade;
	}
	
	public String toString() {
		return "Nome: " + nome + "\nIdade: " + idade;
	}
}
