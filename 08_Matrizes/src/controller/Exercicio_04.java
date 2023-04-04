package controller;

import java.lang.reflect.Array;

import util.Teclado;

public class Exercicio_04 {
	/*
	 * Desenvolver um programa que crie uma matriz de 5 linhas e 2 colunas.
	 * Pergunte ao usuário números para preencher toda a matriz,
	 * e ao final, exiba a matriz inteira e a média dos números da matriz.
	 */
	public static void main(String[] args) {

		int linhaTotal = 5, colunaTotal = 2, matrizTotal = (linhaTotal*colunaTotal);
		double mat[][] = new double[linhaTotal][colunaTotal];
		
		double soma = 0, media;
		
		for (int lin = 0 ; lin < linhaTotal ; lin++) {

			for (int col = 0 ; col < colunaTotal ; col++) {
				
				mat[lin][col] = Teclado.lerDouble("Informe um número para mat["+lin+"]["+col+"]");
				
				soma = soma + mat[lin][col];
				
			}
		}
		media = soma / matrizTotal;
		
		System.out.println("# # # EXIBINDO MATRIZ # # # ");
		
		for (int lin = 0 ; lin < linhaTotal ; lin++) {
			for (int col = 0 ; col < colunaTotal ; col++) {
				
				System.out.print(mat[lin][col] + " ");
				
				soma += mat[lin][col];  
				
			}
			System.out.println("");
		}
		
		System.out.println("A média das matrizes é: "+media);
		

	}

}
