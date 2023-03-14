package controller;

import util.Teclado;

public class Exercicio_05 {
	/*
	 * Desenvolver um programa que apresente os resultados de uma tabela de um número qualquer.
	 * Ela deve ser impressa no seguinte formato: 
	 * Considerando como exemplo o fornecimento do número 2
	 * 2 . 1 = 2
	 * 2 . 2 = 4
	 * 2 . 3 = 6
	 * 2 . 4 = 8
	 * 2 . 5 = 10 (...)
	 * 2 . 10 = 20
	 */

	public static void main(String[] args) {
		
		int i,valor,resultado;
		valor = 2;
		for (i = 1; i <= 10; i++) {
			resultado = valor * i;
			System.out.println(valor + " . " + i + " = " + resultado);
			
		}

	}

}
