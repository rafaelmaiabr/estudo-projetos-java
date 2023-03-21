package controller;

import util.Teclado;

public class Exercicio_02 {
	/*
	 * Desenvolver um programa que apresente o total da soma de n números inteiros do número 1 até n,
	 * onde n é um valor informado pelo usuário.
	 */

	public static void main(String[] args) {
		
		int i, numero, resultado = 0;
		
		numero = Teclado.lerInt("Digite um número");		

		for (i = 1; i <= numero; i++) {
			
			resultado += i;
			
		}
		
		System.out.print(
			"As somas dos valores de 1 até " +
			numero +
			" é: \n"+
			resultado
		);
	
	}

}
