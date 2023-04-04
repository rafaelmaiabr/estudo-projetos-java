package controller;

import java.lang.reflect.Array;

import util.Teclado;

public class Exercicio_04 {
	/*
	 * Desenvolver um programa que pergunte oito elementos em um vetor a,
	 * construa um vetor b de mesma dimensão com os elementos do vetor a multiplicados por 3.
	 * Apresente ao final o vetor b.
	 * Na exibição, o elemento b[1] deve ser implicado pelo elemento a[1] * 3,
	 * o elemento b[2] implicado pelo a[2] * 3, e assim por diante, até 8.
	 */
	
	public static void main(String[] args) {
		
		int vetores = 8;
		String mensagem = "";
		
		int a[] = new int[vetores];
		int b[] = new int[vetores];
		
		for (int i = 0 ; i < vetores ; i++) {
			
			a[i] = Teclado.lerInt("Informe o "+(i+1)+"º número");
			
			b[i] = a[i] * 3;
			
			mensagem += a[i] + " * 3 = "+ b[i] + "\n";
			
		}
				
		System.out.print("-------------------\n" + mensagem + "\n-------------------");
		
	}

}
