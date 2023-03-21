package controller;

import util.Teclado;

public class Exercicio_01 {
	/*
	 * Desenvolver um programa que apresente todos os valores numéricos
	 * inteiros ímpares situados na faixa de 1000 a 1500.
	 */

	public static void main(String[] args) {

		for (int i = 1000; i <= 1500; i++) {
			
			if (i % 2 != 0) {
				System.out.println(i);	
			}
			
		}
	
	}

}
