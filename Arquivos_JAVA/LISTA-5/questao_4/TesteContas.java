package questao_4;

public class TesteContas {
	public static void main(String[] args) {
        // Testando a classe Conta
        Conta conta = new Conta(1000.0);
        System.out.println("Saldo inicial da conta: " + conta.getSaldo());

        conta.depositar(500.0);
        System.out.println("Saldo após depósito: " + conta.getSaldo());

        conta.sacar(200.0);
        System.out.println("Saldo após saque: " + conta.getSaldo());

        // Testando a classe Poupanca
        Poupanca poupanca = new Poupanca(2000.0, 15);
        System.out.println("Saldo inicial da poupança: " + poupanca.getSaldo());
        System.out.println("Dia de rendimento: " + poupanca.getDiaRendimento());

        poupanca.depositar(1000.0);
        System.out.println("Saldo após depósito na poupança: " + poupanca.getSaldo());

        poupanca.sacar(300.0);
        System.out.println("Saldo após saque na poupança: " + poupanca.getSaldo());

        poupanca.setDiaRendimento(25);
        System.out.println("Novo dia de rendimento: " + poupanca.getDiaRendimento());
    }
}
