package controller;

import util.Teclado;

public class Exercicio_09 {
	/*
	 *  Desenvolver um programa que pergunte um número e exiba a informação de que ele é positivo, negativo ou
	 *	nulo.
	 */
	public static void main(String[] args) {
		
		String  mensagem;
		int valor;
		
		valor = Teclado.lerInt("Digite um valor numérico");
				
		if (valor < 0) {			
			mensagem = "Valor digitado é negativo";
		}else if (valor > 0) {
			mensagem = "Valor digitado é positivo";
		}else {
			mensagem = "Valor digitado é Nulo"; // Não seria null, mas zero
		}
		
		System.out.println(mensagem);

	}

}
