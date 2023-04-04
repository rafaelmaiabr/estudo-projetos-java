package controller;

import java.lang.reflect.Array;

import util.Teclado;

public class Exercicio_07 {
	/*
	 * Desenvolva um programa que gere e exiba a matriz abaixo:
	 * 11 12 13 14
	 * 15 16 17 18
	 * 19 20 21 22
	 */
	public static void main(String[] args) {

		int linhaTotal = 3, colunaTotal = 4, valor = 11;
		int mat[][] = new int[linhaTotal][colunaTotal];
		
		for (int lin = 0 ; lin < linhaTotal ; lin++) {

			for (int col = 0 ; col < colunaTotal ; col++) {
				
				System.out.print(valor+" ");
				
				mat[lin][col] = valor;
				valor++;			
				
			}
			System.out.println("");
		}

	}

}
