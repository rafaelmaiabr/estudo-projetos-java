package controller;

import util.Teclado;

public class Exercicio_06 {
	/*
	 * Desenvolver um programa que leia um número n qualquer menor ou igual a 50 e
	 * apresente o valor obtido da multiplicação sucessiva de n por 3 enquanto o
	 * produto for menor que 250. (n x 3; n x 3 x 3; n x 3 x 3 x 3 etc...).
	 */

	public static void main(String[] args) {

		int numero,resultado;

		numero = Teclado.lerInt("Digite um número entre 1 e 50");
		
		if (numero > 50 || numero < 1) {
			System.out.println( "Número fora da faixa solcitada.");
		}else {
			while (numero < 250) {
				numero = numero * 3;
				
				System.out.println(numero + " x 3 = "+numero);
				
			}
			
		}
		
		

	}

}
