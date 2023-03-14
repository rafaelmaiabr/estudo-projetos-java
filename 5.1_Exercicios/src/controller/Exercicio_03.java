package controller;

import util.Teclado;

public class Exercicio_03 {
	/*
	 * Desenvolver um programa que apresente os quadrados dos números inteiros de 15 a 200.
	 * 
	 * Math.pow(base,expoente)
	 */

	public static void main(String[] args) {
				
		int i;
		double resultado;
				
		for (i = 15; i <= 200; i++) {
			
			resultado = Math.pow(i, 2);
			
			System.out.println(i+"² = "+ resultado);
			
		}
		
	}

}
