package controller;

import util.Teclado;

public class Exercicio_11 {
	/*
	 * Desenvolver um programa que pergunte um número de 3 casas e apresente como
	 * resultado somente o algarismo das centenas.
	 */
	public static void main(String[] args) {

		String valor, valorCentena, mensagem;
		
		valor = Teclado.lerTexto("Informe um número com 3 dígitos");		

		if (valor.length() != 3) {
			
			mensagem = "O valor não possui 3 dígitos";
			
		} else {
			valorCentena = valor.substring(0,1);
			mensagem = "O algarísmo da centena é " +valorCentena;
		}

		System.out.println(mensagem);

	}

}
