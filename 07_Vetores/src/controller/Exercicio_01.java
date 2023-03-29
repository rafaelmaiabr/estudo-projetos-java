package controller;

import java.lang.reflect.Array;

import util.Teclado;

public class Exercicio_01 {
	/*
	 * Crie 2 vetores chamados nome e profissao, cada um com 5 elementos.
	 * Pergunte ao usuário o nome e a profissão de 5 pessoas e preencha estes vetores.
	 * Ao final exiba um relatório apontando o nome e a profissão de cada uma das 5 pessoas cadastradas.
	 */
	
	public static void main(String[] args) {
		
		String nome[] = new String[5];
		String profissao[] = new String[5];
		
		String mensagem;

		mensagem = "\n --- RELATÓRIO --- \n";
		
		for (int cont = 0 ; cont < 5 ; cont ++) {
			
			nome[cont] = Teclado.lerTexto("Informe o nome da "+(cont+1)+"ª pessoa");
			profissao[cont] = Teclado.lerTexto("Qual é a profissão de "+ (nome[cont]));
			
			mensagem = mensagem + "A profissão de " + nome[cont] + " é " + profissao[cont] + "\n";
		}
				
		System.out.print(mensagem);

	}

}
