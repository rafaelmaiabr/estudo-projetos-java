package controller;

import util.Teclado;

public class Exercicio_07 {
	/*
	 *  Desenvolver um programa que pergunte um valor inteiro positivo ou negativo, e exiba como resposta o módulo
	 *	deste valor, ou seja, o número lido como sendo positivo.
	 */
	public static void main(String[] args) {
		
		String  mensagem;
		int valor;
		
		valor = Teclado.lerInt("Digite um valor numérico");
				
		if (valor < 0) {			
			mensagem = "O número informado é considerado negativo";
		}else {
			mensagem = "O número informado é considerado positivo";
		}
		
		System.out.println(mensagem);

	}

}
