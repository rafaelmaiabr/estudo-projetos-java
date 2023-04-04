package controller;

import java.lang.reflect.Array;

import util.Teclado;

public class Exercicio_03 {
	/*
	 * Desenvolver um programa que crie uma matriz de 4 linhas e 3 colunas.
	 * Pergunte ao usuário números para preencher toda a matriz,
	 * e ao final, exiba a matriz inteira e a soma dos números pares contidos na matriz.
	 */
	public static void main(String[] args) {

		int linhaTotal = 3, colunaTotal = 2;
		int mat[][] = new int[linhaTotal][colunaTotal];
		
		int soma = 0;
		
		for (int lin = 0 ; lin < linhaTotal ; lin++) {
			for (int col = 0 ; col < colunaTotal ; col++) {
				
				mat[lin][col] = Teclado.lerInt("Informe um número para mat["+lin+"]["+col+"]");
				if (mat[lin][col] % 2 == 0) {
					soma += mat[lin][col];	
				}
				
			}

		}
		System.out.println(soma);
		System.out.println("# # # EXIBINDO MATRIZ # # # ");
		
		for (int lin = 0 ; lin < linhaTotal ; lin++) {
			for (int col = 0 ; col < colunaTotal ; col++) {
				
				System.out.print(mat[lin][col] + " ");			
				
			}
			System.out.println("");
			
			
		}
		
		System.out.println("Soma das matrizes é: "+soma);
		

	}

}
