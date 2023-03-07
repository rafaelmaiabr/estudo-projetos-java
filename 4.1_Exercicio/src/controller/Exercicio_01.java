package controller;

import util.Teclado;

public class Exercicio_01 {
	/*
	 *  Desenvolver um programa que pergunte um número.
	 *  Se este número for maior que 20, então ele deverá exibir a
	 *  metade deste número, senão, ele deverá exibir o número sem alterações.
	 *  */
	public static void main(String[] args) {
		
		double valor,resultado;
		String mensagem;
		
		valor	= Teclado.lerInt("Por favor informe um número");
		
		if (valor > 20) {
			resultado = valor / 2;
			mensagem = "O valor de " + valor + " dividido por 2 é \n" + resultado;
		}else {
			resultado = valor;
			mensagem = "Desculpe, mas não posso dividir "+ resultado;
		}
		
		System.out.println(mensagem);

	}

}
