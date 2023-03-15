package controller;

import util.Teclado;

public class Exercicio_03 {
	/*
	 * Desenvolver um programa que apresente o total da soma dos cinco primeiros números inteiros.
	 */

	public static void main(String[] args) {

		int i = 1, total = 0;

		do {
			total += i;
			i++;

		} while (i <= 5);
		
		System.out.println(total);
		
	}

}
