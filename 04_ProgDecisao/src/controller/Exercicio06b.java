package controller;

import util.Teclado;

public class Exercicio06b {
	/*
	 *  Desenvolver um programa que pergunte 5 números inteiros
	 *  e identifique o maior número e o menor número.
	 */
	public static void main(String[] args) {
		
		int n1, n2, n3, n4, n5, maior, menor;
		
		n1 = Teclado.lerInt("Informeo 1º número");
		n2 = Teclado.lerInt("Informeo 2º número");
		n3 = Teclado.lerInt("Informeo 3º número");
		n4 = Teclado.lerInt("Informeo 4º número");
		n5 = Teclado.lerInt("Informeo 5º número");
		
		maior = n1;
		menor = n1;
		
		if (n2 > maior) {
			maior = n2;
		}
		if (n3 > maior) {
			maior = n3;
		}
		if (n4 > maior) {
			maior = n4;
		}
		if (n5 > maior) {
			maior = n5;
		}
		if (n2 < menor) {
			menor = n2;
		}
		if (n3 < menor) {
			menor = n3;
		}
		if (n4 < menor) {
			menor = n4;
		}
		if (n5 < menor) {
			menor = n5;
		}
		
		System.out.println("O maior valor é: " + maior);
		System.out.println("O menor valor é: " + menor);

	}

}
