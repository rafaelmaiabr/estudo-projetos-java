package controller;

import util.Teclado;

public class LacoTesteInicio {
	/*
	 * Criar um programa que faça multiplicação usando laço de repetição
	 */

	public static void main(String[] args) {
		
		int x, r, contador;
		
		contador = 1;
		// contador = 10; // Se fosse utilizado o do while funcionaria, pois while vem após os dados da variaveis declaradas
		
		while (contador <=5) {
			x = Teclado.lerInt("Informe um número: ");
			r = x * 3;
			
			System.out.println(x + " multiplicado por 3 = " + r);
			
			contador++;
		}

	}

}
