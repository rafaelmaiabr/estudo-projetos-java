package Controll;

public class Operadores {

	public static void main(String[] args) {
		
		int n1,n2,n3 = 10, n4, soma, sub, mult, div;
		boolean casado;
		
		n1 = 5;
		n2 = 8;
		
		n4 = 7;
		
		soma = n1 + n2 + n3 + n4;
		sub = n1 - n2;
		mult = n1 * n3;
		div = n3 / n1;

		System.out.println("A soma de " + n1 + " e " + n2 + " é: " + soma);
		System.out.println("A subtração de " + n1 + " e " + n2 + " é: " + sub);
		System.out.println("A multiplicação de " + n1 + " e " + n2 + " é: " + mult);
		System.out.println("A divisão de " + n3 + " e " + n1 + " é: " + mult);
		
		casado = 5==2;
		System.out.println(casado);
		
	}

}
