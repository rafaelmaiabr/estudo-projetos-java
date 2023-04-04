package controller;

import java.lang.reflect.Array;

import util.Teclado;

public class Exercicio_06 {
	/*
	 * Desenvolver um programa que pergunte 20 elementos de um vetor a
	 * e construa um vetor b de mesma dimensão com os mesmos elementos de a,
	 * os quais devem estar invertidos, ou seja, o primeiro elemento de a
	 * passa a ser o último elemento de b, e assim por diante.
	 * Apresentar os vetores a e b.
	 */
	
	public static void main(String[] args) {
		
		int vetores = 2;
		String mensagem = "";
		
		int a[] = new int[vetores];
		int b[] = new int[vetores];
				
		for (int i = 0 ; i < vetores ; i++) {
			
			System.out.println("Item 1: "+a[i]);
			
		}
				
		//System.out.print("-------------------\n" + mensagem + "-------------------");
		
	}

}
