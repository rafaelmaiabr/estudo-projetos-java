package controller;

import util.Teclado;

public class Exercicio_07 {
	/*
	 * Desenvolver um programa que apresente todos os números divisíveis por 4 que sejam menores que 200.
	 * Para saber se o número é divisível por 4 será necessário verificar a lógica desta condição com o comando if.
	 * Sendo divisível, mostre-o; não sendo, passe para o próximo passo.
	 * A variável que controla o contador deve ser iniciada com valor 1.
	 */

	public static void main(String[] args) {

		int i,calculo;

		for (i = 1; i <= 200; i++) {
			
			calculo = (i % 4);
			if (calculo == 0) {
				System.out.println(i + " é divisível por 4");
			}
			
		}
	}

}
