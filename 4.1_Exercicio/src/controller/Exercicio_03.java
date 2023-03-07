package controller;

import util.Teclado;

public class Exercicio_03 {
	/*
	 *  Desenvolver um programa que permita ao aluno responder qual a capital do Brasil.
	 *  O programa deverá exibir se a resposta está certa ou errada.
	 *  */
	public static void main(String[] args) {
		
		String  mensagem;
		int valor;
		
		valor = Teclado.lerInt("Informe um número");
		
		if (valor % 2 == 0) {
			mensagem = valor + " é um número par.";
		}else {
			mensagem = valor + " é um número impar.";
		}
		
		System.out.println(mensagem);

	}

}
