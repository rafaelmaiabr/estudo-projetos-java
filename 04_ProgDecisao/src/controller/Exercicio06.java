package controller;

import util.Teclado;

public class Exercicio06 {
	/*
	 *  Desenvolver um programa que pergunte 5 números inteiros
	 *  e identifique o maior número e o menor número.
	 */
	public static void main(String[] args) {
		
		int valor, maior = 0, menor = 0;
		
		for (int i = 1; i <= 5; i++) {
			valor = Teclado.lerInt("Digite o "+i+"º valor");
			
			if (i == 1) {
				maior = valor;
				menor = valor;
			}
			
			if (maior < valor) {
				maior = valor;
			}
			if (menor > valor) {
				menor = valor;
			}
			
		}
		
		System.out.println("Menor Valor: "+ menor);
		System.out.println("Maior Valor: "+ maior);
		

	}

}
