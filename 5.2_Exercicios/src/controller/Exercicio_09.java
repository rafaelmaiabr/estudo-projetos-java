package controller;

import util.Teclado;

public class Exercicio_09 {
	/*
	 * Desenvolver um programa que apresente os resultados de uma tabuada de um
	 * número n qualquer a ser perguntado ao usuário (n x 1, n x 2, n x 3, ... , n x 9, n x 10)
	 */

	public static void main(String[] args) {

		int i = 1, valor;
		String mensagem = "";

		
		valor = Teclado.lerInt("Digite um número");
		do {
			mensagem += valor+" x "+i+": ";
			mensagem += valor * i +"\n"; 
					
			i++;

		} while (i <= 10);

		System.out.println(mensagem);

	}

}
