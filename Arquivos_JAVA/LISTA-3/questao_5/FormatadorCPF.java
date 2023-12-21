package questao_5;

import java.text.ParseException;
import javax.swing.text.MaskFormatter;

public class FormatadorCPF {
	public static String formatarCPF(String numeros) {
		try {
			MaskFormatter mf = new MaskFormatter("###.###.###-##");
			mf.setValueContainsLiteralCharacters(false);
			
			if (numeros.length() != 11) {
				throw new IllegalArgumentException("O CPF precisa ter 11 dígitos.");
			} return mf.valueToString(numeros);
		} catch (ParseException e) {
			e.printStackTrace();
			return null;
		}
	}
	
	public static void main(String[] args) {
		String numerosCPF = "12345678901";
		String cpfFormatado = formatarCPF(numerosCPF);
		
		if (cpfFormatado != null) {
			System.out.println("CPF formatado: "  + cpfFormatado);
		} else {
			System.out.println("Erro ao formatar CPF.");
		}
	}
}
