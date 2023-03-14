package controller;

import util.Teclado;

public class Exercicio_04 {
	/*
	 * Desenvolver um programa que apresente o valor da soma dos cem primeiros
	 * números inteiros (1 + 2 + 3 + 4 + ... + 97 + 98 + 99 + 100)
	 */

	public static void main(String[] args) {

		int i,soma;
		soma = 0;
		for (i = 1; i <= 100; i++) {
			
			soma = soma+i;
			
		}
		System.out.println("A soma dos números de 1 a 100 é: " + soma);
	}

}
