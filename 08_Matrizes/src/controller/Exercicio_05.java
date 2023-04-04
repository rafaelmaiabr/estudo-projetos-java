package controller;

import java.lang.reflect.Array;

import util.Teclado;

public class Exercicio_05 {
	/*
	 * Desenvolver um programa que crie uma matriz de 4 linhas e 4 colunas.
	 * Pergunte ao usuário nomes de pessoas para preencher toda a matriz.
	 * Em seguida o programa perguntará ao usuário as coordenadas (linha e coluna)
	 * que deseja visualizar o conteúdo correspondente na matriz.
	 * Enquanto o usuário informar coordenadas válidas,
	 * o programa exibirá o conteúdo correspondente.
	 * No momento em que forem inseridas coordenadas não válidas o
	 * programa será encerrado com a mensagem na tela “Coordenadas inválidas”.
	 */
	public static void main(String[] args) {

		int linhaTotal = 4, colunaTotal = 4, lin, col;
		String mat[][] = new String[linhaTotal][colunaTotal];
		boolean valido = true;
		
		int coordenadaLinha, coordenadaColuna;
		
		for (lin = 0 ; lin < linhaTotal ; lin++) {

			for (col = 0 ; col < colunaTotal ; col++) {
				
				mat[lin][col] = Teclado.lerTexto("Informe nome de pessoa para matriz mat["+lin+"]["+col+"]");	
				
			}
		}
		
		System.out.println("# # # # COORDENADAS DA MATRIZ # # # #");
		
		do {
			
			coordenadaLinha = Teclado.lerInt("Coordenada Linha número de 0 até "+(linhaTotal-1));
			coordenadaColuna = Teclado.lerInt("Coordenada Coluna número de 0 até "+(colunaTotal-1));
		
			if (coordenadaLinha >= linhaTotal || coordenadaColuna >= colunaTotal) {
				System.out.println("Coordenadas inválidas");
				valido = false;
			}else {
				System.out.println("Valor em mat ["+coordenadaLinha+"]["+coordenadaColuna+"]: "+ mat[coordenadaLinha][coordenadaColuna]);
			}
			
		}while (valido);
		

	}

}
