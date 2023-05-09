package controller;

import util.Teclado;

public class Exercicio12 {
	/*
	 *  Desenvolver um programa que pergunte dois valores numéricos inteiros
	 *  e apresente o valor da diferença entre o maior valor e o menor valor lido.
	 */
	public static void main(String[] args) {
		
		int n1, n2, resultado;
		
		n1 = Teclado.lerInt("Informe um número");
		n2 = Teclado.lerInt("Informe outro número");
		
		resultado = n1 - n2;
		
		if (n1 > n2) {
			System.out.println("O diferença é entre os números é " + resultado);
		}else {
			System.out.println("O diferença é entre os números é " + resultado);			
		}

	}

}
