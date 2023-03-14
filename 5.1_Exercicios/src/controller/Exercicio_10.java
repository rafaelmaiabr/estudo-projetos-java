package controller;

import util.Teclado;

public class Exercicio_10 {
	/*
	 * Desenvolver um programa que apresente as potências de 3 variando de 0 a 15.
	 * Deve ser considerado que qualquer número elevado a zero é 1, e elevado a 1 é
	 * ele próprio. A apresentação deve observar a seguinte exibição na tela:
	 */

	public static void main(String[] args) {

		int r, x, i;

		i = 0;
		x = Teclado.lerInt("Digite um número");
		while (i <= 10) {

			r = x * i;
			System.out.println(i + " x " + x + ": " + r);

			i++;
		}
	}

}
