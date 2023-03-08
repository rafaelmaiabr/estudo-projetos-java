package controller;

import util.Teclado;

public class Exercicio_12 {
	/*
	 * Desenvolver um programa que pergunte 5 números inteiros e identifique o maior
	 * número e o menor número.
	 */
	public static void main(String[] args) {

		String mensagem;
		int valores;
		
		int[] array = new int[4];
		
		for (int i = 1; i <= 4; i++) {
			valores = Teclado.lerInt("Digite o "+i+"º numero");
			
		}
		
		System.out.println(valores);

/*
		if (true) {
			mensagem = "xxx";
		} else {
			mensagem = "xxx";
		}

		System.out.println(mensagem);
		*/

	}

}
