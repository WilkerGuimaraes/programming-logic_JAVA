package questao2;

public class Retangulo {
	private double altura;
	private double largura;
	
	public double area() {
		return altura * largura;
	}
	public double perimetro() {
		return altura * 2 + largura * 2;
	}
	
	public double getAltura() {
		return altura;
	}
	public void setAltura(double novaAltura) {
		this.altura = novaAltura;
	}
	
	public double getLargura() {
		return largura;
	}
	public void setLargura(double novaLargura) {
		this.largura = novaLargura;
	}
}
