package questao_1;

public class PessoaNova {
	private String nome;
	private String sobrenome;
	
	public PessoaNova() {
		
	}
	
	public PessoaNova(String nome, String sobrenome) {
		this.nome = nome;
		this.sobrenome = sobrenome;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getSobrenome() {
		return nome;
	}
	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}
	
	public String getNomeCompleto() {
		return nome + " " + sobrenome;
	}
}
