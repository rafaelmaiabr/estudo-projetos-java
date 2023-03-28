package controller;

import util.Teclado;

public class Exercicio_02 {
	
	/*
	 * Desenvolver um programa que pergunte o sexo da pessoa e dê como resposta a seguinte orientação de acordo
	 * com o sexo informado:
	 * “Banheiro masculino à direita” ou “Banheiro feminino à esquerda”.
	 */
	
	public static void main(String[] args) {
		
		String sexo, mensagem;
		sexo = Teclado.lerTexto("Qual seu sexo Masculino ou Feminino?");
		sexo = sexo.toLowerCase();
				
		switch (sexo) {
			case "masculino":
				mensagem = "Banheiro masculino à direita";
				
				break;
			case "feminino":
				mensagem = "Banheiro feminino à esquerda";
				break;
						
			default:
				mensagem = "Orientação não encontrada";
				break;
		}
		
		
		System.out.print(mensagem);

	}

}
