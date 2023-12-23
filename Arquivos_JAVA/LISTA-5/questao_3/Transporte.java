package questao_3;

public class Transporte {
	private boolean ligado;
	private int velocidade;
	
	public Transporte() {
		this.ligado = false;
		this.velocidade = 0;
	}
	
	public void liga() {
		ligado = true;
	}
	public void desliga() {
		ligado = false;
		velocidade = 0;
	}
	
	public boolean estaLigado() {
		return ligado;
	}
	
	public int getVelocidade() {
		return velocidade;
	}
	public void setVelocidade(int velocidade) {
		if (velocidade >= 0) {
			this.velocidade = velocidade;
		} else {
			System.out.println("A velocidade não pode ser negativa.");
		}
	}
}
