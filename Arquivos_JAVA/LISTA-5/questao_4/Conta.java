package questao_4;

public class Conta {
	private double saldo;
	
	public Conta(double saldoInicial) {
		this.saldo = saldoInicial;
	}
	
	public double getSaldo() {
		return saldo;
	}
	
	public void depositar(double valor) {
		saldo += valor;
	}
	public void sacar(double valor) {
		saldo -= valor;
	}
}
