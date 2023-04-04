package controller;

import java.lang.reflect.Array;

import util.Teclado;

public class ExemploMatriz {
	/*
	 * Desenvolver um programa que crie uma matriz com 5 linhas e 3 colunas.
	 * Pergunte ao usuário o conteúdo desta matriz e ao final exiba a matriz inteira.
	 */
	public static void main(String[] args) {

		//declaração de matriz[linhas][colunas]
		int mat[][] = new int[3][4];
		
		for (int lin = 0 ; lin < 3 ; lin++) {
			for (int col = 0 ; col < 4 ; col++) {
				
				mat[lin][col] = Teclado.lerInt("Informe um número para mat["+lin+"]["+col+"]");
				
			}
		}
		
		System.out.println("# # # EXIBINDO MATRIZ # # # ");
		
		for (int lin = 0 ; lin < 3 ; lin++) {
			for (int col = 0 ; col < 4 ; col++) {
				
				System.out.print(mat[lin][col] + " ");
				
			}
			System.out.println("");
		}
		

	}

}
