package controller;

import util.Teclado;

public class Exercicio_08 {
	/*
	 *  Desenvolver um programa que pergunte um número inteiro qualquer e verifique se ele está na faixa de 1 a 10.
	 */
	public static void main(String[] args) {
		
		String  mensagem;
		int valor;
		
		valor = Teclado.lerInt("Digite um valor numérico");
				
		if (valor > 0 && valor < 11 ) {			
			mensagem = "O valor digitado está entre 1 e 10";
		}else {
			mensagem = "O valor digitado não está entre 1 e 10";
		}
		
		System.out.println(mensagem);

	}

}
