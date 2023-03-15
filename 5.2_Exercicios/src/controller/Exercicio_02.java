package controller;

import util.Teclado;

public class Exercicio_02 {
	/*
	 * Desenvolver um programa que apresente no final a soma dos valores pares
	 * existentes na faixa de 0 até 500. Utilize um laço que varie de 2 em 2.
	 */

	public static void main(String[] args) {

		int i = 0, total = 0;

		do {
			if (i % 2 == 0) {
				total += i;	
			}
			
			i ++;

		} while (i <= 500);
		
		System.out.print(total);
	}

}
