package controller;

import util.Teclado;

public class Exercicio_02 {
	/*
	 *  Desenvolver um programa que permita ao aluno responder qual a capital do Brasil.
	 *  O programa deverá exibir se a resposta está certa ou errada.
	 *  */
	public static void main(String[] args) {
		
		String capital, mensagem;
		
		capital = Teclado.lerTexto("Qual é a capital do Brasil?");
		
		if (capital.equals("brasilia") || capital.equals("Brasilia")) {
			mensagem = "A resposta está correta!";
		}else {
			mensagem = "A capital não seria " + capital +". \nA resposta correta é Brasília";
		}
		
		System.out.println(mensagem);

	}

}
