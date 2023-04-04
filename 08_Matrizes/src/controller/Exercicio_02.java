package controller;

import java.lang.reflect.Array;

import util.Teclado;

public class Exercicio_02 {
	/*
	 * Desenvolver um programa que crie uma matriz com 3 linhas e 2 colunas.
	 * Pergunte ao usuário números para preencher toda a matriz,
	 * e ao final exiba a matriz inteira e também a soma dos números desta matriz.
	 */
	public static void main(String[] args) {

		int linhaTotal = 3, colunaTotal = 2;
		int mat[][] = new int[linhaTotal][colunaTotal];
		
		int soma = 0;
		
		for (int lin = 0 ; lin < linhaTotal ; lin++) {
			for (int col = 0 ; col < colunaTotal ; col++) {
				
				mat[lin][col] = Teclado.lerInt("Informe um número para mat["+lin+"]["+col+"]");
				
			}
		}
		
		System.out.println("# # # EXIBINDO MATRIZ # # # ");
		
		for (int lin = 0 ; lin < linhaTotal ; lin++) {
			for (int col = 0 ; col < colunaTotal ; col++) {
				
				System.out.print(mat[lin][col] + " ");
				
				soma += mat[lin][col];  
				
			}
			System.out.println("");
		}
		
		System.out.println("Soma das matrizes é: "+soma);
		

	}

}
