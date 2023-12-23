package questao_4;

public class Poupanca extends Conta {
	private int diaRendimento;
	
	public Poupanca(double saldoInicial, int diaRendimento) {
		super(saldoInicial);
		this.diaRendimento = diaRendimento;
	}
	
	public int getDiaRendimento() {
		return diaRendimento;
	}
	public void setDiaRendimento(int dia) {
		if (dia >= 1 && dia <= 31) {
			this.diaRendimento = dia;
		} else {
			System.out.println("Dia de rendimento inválido.");
		}
	}
}
