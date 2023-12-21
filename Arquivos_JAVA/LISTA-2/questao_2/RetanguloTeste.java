package questao_2;

public class RetanguloTeste {
	public static void main(String[] args) {
		Retangulo myObj = new Retangulo();
		
		myObj.setAltura(2);
		myObj.setLargura(4);
		
		System.out.println(myObj.area());
		System.out.println(myObj.perimetro());
	}	
}
