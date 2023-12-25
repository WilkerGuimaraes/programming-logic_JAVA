package question_5;

import java.text.ParseException;
import javax.swing.text.MaskFormatter;

public class formatCPF {
	public static String createCPF(String numbers) {
		try {
			MaskFormatter mf = new MaskFormatter("###.###.###-##");
			mf.setValueContainsLiteralCharacters(false);
			
			if (numbers.length() != 11) {
				throw new IllegalArgumentException("The CPF must have 11 digits.");
			} return mf.valueToString(numbers);
		} catch (ParseException e) {
			e.printStackTrace();
			return null;
		}
	}
	
	public static void main(String[] args) {
		String numbersCPF = "12345678901";
		String formattedCPF = createCPF(numbersCPF);
		
		if (formattedCPF != null) {
			System.out.println("Formatted CPF: "  + formattedCPF);
		} else {
			System.out.println("Error when formatting CPF");
		}
	}
}
