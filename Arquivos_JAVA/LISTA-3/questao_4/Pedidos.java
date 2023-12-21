package questao_4;

import java.util.Date;

public class Pedidos {
	private static int proximoNumero = 1;
	private int numero;
	private Date data;
	private String cliente;
	private double valor;
	
	public Pedidos(Date data, String cliente, double valor) {
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
	public Date data() {
		return data;
	}
	public double getValor() {
		return valor;
	}
	
	public String toString() {
		return "Pedido: " + numero + " | " + "Data: " + data + " | " + "Cliente: " + cliente + " | " + "Valor: " + valor;
	}
}
