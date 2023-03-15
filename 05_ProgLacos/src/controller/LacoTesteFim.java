package controller;

import util.Teclado;

public class LacoTesteFim {
	/*
	 * Algoritimo para pedir a leitura de um valor para a variavel x, multiplicar
	 * este valor por 3, colocar o valor obtido na variavel r, e apresentar o valor
	 * de r, repetindo a sequencia cinco vezes
	 */
	public static void main(String[] args) {
		
		int x, r, contador;
		
		contador = 10;
		
		do {
			x = Teclado.lerInt("Informe um número: ");
			r = x * 3;
			
			System.out.println(x + " multiplicado por 3 = " + r);
			
			contador++;
		} while (contador <=5);


	}

}
