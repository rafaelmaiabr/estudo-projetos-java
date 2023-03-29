package controller;

import util.Teclado;

public class Exercicio_05 {
	
	/*
	 * Desenvolver um programa que pergunte um número de 1 a 12,
	 * e responda o mês correspondente ao número,
	 * ou se o número não corresponde a nenhum dos 12 meses.
	 */
	
	public static void main(String[] args) {
		
		int numero;
		String mensagem = "";
		
		numero = Teclado.lerInt("Digite um número de 1 a 12");
		
				
		switch (numero) {
			case 1:
				mensagem = "janeiro";	
				break;
			case 2:
				mensagem = "fevereiro";	
				break;
			case 3:
				mensagem = "março";	
				break;
			case 4:
				mensagem = "abril";	
				break;
			case 5:
				mensagem = "maio";	
				break;
			case 6:
				mensagem = "junho";	
				break;
			case 7:
				mensagem = "julho";	
				break;
			case 8:
				mensagem = "agosto";	
				break;
			case 9:
				mensagem = "setembro";	
				break;
			case 10:
				mensagem = "outubro";	
				break;
			case 11:
				mensagem = "novembro";	
				break;
			case 12:
				mensagem = "dezembro";	
				break;
			default:
				mensagem = "O número "+numero+" não corresponde a um mês válido";
				break;
		}		
		
		System.out.print(mensagem);

	}

}
