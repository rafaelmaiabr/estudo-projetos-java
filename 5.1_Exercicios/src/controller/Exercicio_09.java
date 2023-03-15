package controller;

import util.Teclado;

public class Exercicio_09 {
	/*
	 * Elaborar um programa que apresente no final a soma dos valores pares existentes
	 * na faixa de 0 até 500. Utilize um laço que efetue a variação de 2 em 2.
	 */

	public static void main(String[] args) {
		
		int i = 0, soma = 0;
		String mensagem;
		
		while (i <= 500) {
			soma = soma + i;
			i=i+2;
		}
		
		mensagem = "A soma dos números pares de 0 a 500 é "+soma+".";
		
		System.out.println(mensagem);
		
	}

}
