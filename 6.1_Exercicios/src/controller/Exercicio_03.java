package controller;

import util.Teclado;

public class Exercicio_03 {
	
	/*
	 * Desenvolver um programa que pergunte um número e informe como resposta se o número informado é
	 * par ou é ímpar.
	 */
	
	public static void main(String[] args) {
		
		int numero, conta;
		String mensagem;
		numero = Teclado.lerInt("Digite um número?");
		
		conta = numero % 2;
				
		switch (conta) {
			case 0:
				mensagem = "O número "+numero + " é par";
				
				break;
			default:
				mensagem = "O número "+numero + " é impar";
				break;
		}		
		
		System.out.print(mensagem);

	}

}
