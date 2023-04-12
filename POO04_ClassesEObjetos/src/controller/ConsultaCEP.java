package controller;

public class ConsultaCEP {

	public static void main(String[] args) throws Exception {
		
		byte a = 127;
		
		int num = 2147483647;
		
		// Necessita do L no final quando o número passa do limite de um valor int
		long grande = 214748364857576576L;
		
		// Necessário inserir F no final
		float f = 112.7F;
		
		double d = 1.59; 
		
		// Caracter unicode declarado com em aspas simples
		char c = 'A';
		
		// Verdadeiro ou falso - true / false
		boolean b = true;

		// Exemplos
		b = 1 > a;
		if (b) {
			System.out.println("Correto");
		}else {
			System.out.println("Incorreto");			
		}

	}
}
