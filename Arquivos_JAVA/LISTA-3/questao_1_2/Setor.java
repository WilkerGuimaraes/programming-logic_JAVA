package questao_1_2;

public class Setor {
	private static int proximoCodigoSetor = 1;
	
	private int codigoSetor;
	private String nomeSetor;
	
	public Setor(String nomeSetor) {
		this.codigoSetor = proximoCodigoSetor++;
		this.nomeSetor = nomeSetor;
	}
	
	public String getNomeSetor() {
		return nomeSetor;
	}
	public int codigoSetor() {
		return codigoSetor;
	}
}
