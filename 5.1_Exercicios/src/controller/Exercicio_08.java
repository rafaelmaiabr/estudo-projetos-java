package controller;

import util.Teclado;

public class Exercicio_08 {
	/*
	 * Desenvolver um programa que apresente todos os valores numéricos inteiros ímpares
	 * situados na faixa de 0 a 20.
	 * Para saber se o número é ímpar, será necessário verificar essa condição com o comando if.
	 * Sendo ímpar, mostre-o; não sendo, passe para o próximo passo.
	 */

	public static void main(String[] args) {
		
		int i,calculo;

		for (i = 1; i <= 20; i++) {
			
			calculo = (i % 2);
			if (calculo != 0) {
				System.out.println(i + " é impar");
			}
			
		}
	}

}
