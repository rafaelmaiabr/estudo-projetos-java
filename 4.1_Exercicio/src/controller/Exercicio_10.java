package controller;

import util.Teclado;

public class Exercicio_10 {
	/*
	 *  Desenvolver um programa que pergunte dois números inteiros,
	 *  e apresente como resultado se o segundo número informado é ou não um divisor do primeiro número informado.
	 */
	public static void main(String[] args) {
		
		String  mensagem;
		int valor1, valor2;
		
		valor1 = Teclado.lerInt("Digite o primeiro valor");
		valor2 = Teclado.lerInt("Digite o segundo valor");
				
		if (valor2 % valor1 == 0) {			
			mensagem = "O número " + valor2 + " é divisível por " + valor1 + ".";
		}else {
			mensagem = "O número " + valor2 + " NÃO é divisível por " + valor1 + ".";
		}
		
		System.out.println(mensagem);

	}

}
