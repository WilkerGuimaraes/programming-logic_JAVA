package questao_4;

public class Pedidos {
	private static int proximoNumero = 1;
	private int numero;
	private String data;
	private String cliente;
	private double valor;
	
	public Pedidos(String data, String cliente, double valor) {
		this.numero = proximoNumero++;
		this.cliente = cliente;
		this.data = data;
		this.valor = valor;
	}
	
	public int getNumero() {
		return numero;
	}
	public String getCliente() {
		return cliente;
	}
	public String data() {
		return data;
	}
	public double getValor() {
		return valor;
	}
	
	public void exibirDetalhes() {
		System.out.println("Pedido: " + numero + " | " + "Data: " + data + " | " + "Cliente: " + cliente + " | " + "Valor: " + valor);
	}
}
