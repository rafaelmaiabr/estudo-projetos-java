package controller;

import util.Teclado;

public class Exercicio_06 {
	/*
	 *  Desenvolver um programa que pergunte dois valores numéricos inteiros e apresente o valor da diferença entre o
	 * 	maior valor e o menor valor lido.
	 */
	public static void main(String[] args) {
		
		String  mensagem;
		int valor1, valor2, resultado;
		
		valor1 = Teclado.lerInt("Digite o primeiro número");
		valor2 = Teclado.lerInt("Digite o segundo número");
				
		if (valor1 > valor2) {	
			resultado = valor1 - valor2;
			mensagem = "Resultado \n "+ valor1 + " - " + valor2 + " = "+resultado;
		}else {
			resultado = valor2 - valor1;
			mensagem = "Resultado \n "+ valor2 + " - " + valor1 + " = "+resultado;
		}
		
		System.out.println(mensagem);

	}

}
