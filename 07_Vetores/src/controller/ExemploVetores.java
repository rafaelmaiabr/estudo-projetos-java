package controller;

import java.lang.reflect.Array;

import util.Teclado;

public class ExemploVetores {
	/*
	 * Elaborar um programa que pergunte ao usuário o nome de 10 pessoas
	 * e depois exiba na tela
	 */
	public static void main(String[] args) {
		
		// Declarar um vetor do tipo string com 10 posições
		String nomes[] = new String[10];
		
		//nomes[3] = "Carla"
		
		for (int cont = 0 ; cont < 10 ; cont ++) {
			
			nomes[cont] = Teclado.lerTexto("Informe o nome da "+(cont+1)+"ª pessoa");
		}
				
		System.out.print("\n --- RELAÇÃO DE PESSOAS CADASTRADAS --- \n");
		
		for (int cont = 0 ; cont < 10 ; cont ++) {
			System.out.println((cont+1)+" - " + nomes[cont]);
		}

	}

}
