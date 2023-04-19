package controller;

public class ExemploTypeCast {
	
	public static void main(String[] args) {
		
		int a = 5, b = 2;
		int c;
		c = a / b;
		System.out.println("Valor de C: " + c);
		
		double d;
		d = a / b;
		System.out.println("Valor de D: " + d);
		
		// Conversão Explícita
		double e;
		e = (double) a / b;
		System.out.println("Valor de E: " + e);
		
		// Conversão Implícita
		float f = 14.5f;
		e = f;
		System.out.println("Valor de E: " + e);

	}
}

