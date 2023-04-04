package controller;

import java.lang.reflect.Array;

import util.Teclado;

public class Exercicio_01 {
	/*
	 * Fazer uma matriz com 3 linhas e 4 colunas e preencher com valores
	 * inseridos pelo usuário. Ao final, exibir todos os valores inseridoc na matriz
	 */
	public static void main(String[] args) {

		int linhaTotal = 5, colunaTotal = 3;
		int mat[][] = new int[linhaTotal][colunaTotal];
		
		for (int lin = 0 ; lin < linhaTotal ; lin++) {
			for (int col = 0 ; col < colunaTotal ; col++) {
				
				mat[lin][col] = Teclado.lerInt("Informe um número para mat["+lin+"]["+col+"]");
				
			}
		}
		
		System.out.println("# # # EXIBINDO MATRIZ # # # ");
		
		for (int lin = 0 ; lin < linhaTotal ; lin++) {
			for (int col = 0 ; col < colunaTotal ; col++) {
				
				System.out.print(mat[lin][col] + " ");
				
			}
			System.out.println("");
		}
		

	}

}
