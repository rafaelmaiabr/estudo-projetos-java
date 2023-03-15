package controller;

import util.Teclado;

public class Exercicio_01 {
	/*
	 * Desenvolver um programa que apresente todos os valores numéricos inteiros
	 * pares situados na faixa de 100 a 200.
	 */

	public static void main(String[] args) {
		
		int i = 100;
		
		do {
			
			System.out.println(i);
			
			i++;
			
		}while(i <= 200);
	}

}
