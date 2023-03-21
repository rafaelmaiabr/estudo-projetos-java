package controller;

import util.Teclado;

public class Exercicio_11 {
	/*
	 * Elaborar um programa que apresente o valor de uma potência de
	 * uma base qualquer (Variável b) elevada a um expoente qualquer (Variável e),
	 * ou seja, de be. (Sem usar Math.pow();)
	 */

	public static void main(String[] args) {
		
		int i = 1, num, ex, resultado = 0;
		
		num = Teclado.lerInt("Digite um número");
		ex = Teclado.lerInt("Digite o expoente");
		
		while (i < ex) {
			
			if (resultado == 0) {
				resultado = num * num;
			}else {
				resultado = resultado*num;
			}	
			
			i++;
			
		}
		
		System.out.println(num+" elevado a "+ex+" = "+resultado);
	}

}
