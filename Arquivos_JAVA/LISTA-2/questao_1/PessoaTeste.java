package questao_1;

public class PessoaTeste {
	public static void main(String[] args) {
		Pessoa myObj = new Pessoa();
		
		myObj.setNome("Wilker");
		myObj.setIdade(24);
		
		System.out.println(myObj.toString());
	}
}
