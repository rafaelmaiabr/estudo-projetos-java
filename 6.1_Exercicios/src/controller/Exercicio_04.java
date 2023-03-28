package controller;

import util.Teclado;

public class Exercicio_04 {
	
	/*
	 * Desenvolver um programa que pergunte a sigla do estado onde a pessoa reside,
	 * e apresente uma das seguintes alternativas como resposta:
	 * Carioca, Paulista, Mineiro, Outros Estados.
	 */
	
	public static void main(String[] args) {
		

		String sigla, mensagem = "";
		
		sigla = Teclado.lerTexto("Digite a sigla so seu estado");
		
				
		switch (sigla) {
			case "rj":
				mensagem = "Você é carioca";
				
				break;
			case "sp":
				mensagem = "Você é paulista";
				
				break;
			case "mg":
				mensagem = "Você é mineiro";
				
				break;
			default:
				mensagem = "Outros estados";
				break;
		}		
		
		System.out.print(mensagem);

	}

}
