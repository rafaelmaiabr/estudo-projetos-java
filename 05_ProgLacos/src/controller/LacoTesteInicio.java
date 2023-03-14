package controller;

import util.Teclado;

public class LacoTesteInicio {
	/*
	 * Criar um programa que faça multiplicação usando laço de repetição
	 */

	public static void main(String[] args) {
		
		int r,x,i;
		
		i = 0;
		x = Teclado.lerInt("Digite um número");
		while (i <= 10) {
			
			r = x * i;
			System.out.println(i + " x " + x +": "+r);
			
			i++;
		}
	}

}
