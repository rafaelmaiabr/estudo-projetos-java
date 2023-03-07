package controller;

import util.Teclado;

public class DesvioCondicionalSimples {
	/*
	 *  Faça um algoritimo para perguntar dois numeros ao usuario,
	 *  em seguida realize a soma dos numeros e apresente o resultado
	 *  se a soma for maior que 10;
	 */
	public static void main(String[] args) {
		int valor1,valor2,total;
		

		System.out.println("Vamos fazer um calculo:");
		
		valor1 = Teclado.lerInt("Digite o primeiro numero");
		valor2 = Teclado.lerInt("Digite o segundo numero");
		total = valor1 + valor2;
		
		if (total > 10) {
			System.out.println("O resultado é: \n" + total);
		}
		
			
		

	}

}
