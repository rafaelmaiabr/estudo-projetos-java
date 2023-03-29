package controller;

import util.Teclado;

public class Exercicio_06 {
	
	/*
	 * Desenvolver um programa que pergunte o peso de uma pessoa
	 * e também pergunte o código do planeta no qual ela gostaria de obter como resposta
	 * o valor do seu peso neste referido planeta.
	 * As informações da tabela abaixo
	 * (somente as colunas Código e Planeta) devem aparecer como menu de escolha ao usuário:
	 * 
	 * | Código | Planeta 	| Gravidade Relativa |
	 * | 1 		| Mercúrio	| 0,37				 |
	 * | 2 		| Vênus 	| 0,88				 |
	 * | 3 		| Marte 	| 0,38				 |
	 * | 4 		| Júpiter 	| 2,64				 |
	 * | 5 		| Saturno 	| 1,15				 |
	 * | 6 		| Urano 	| 1,17				 |
	 * 
	 * Para calcular o peso no planeta escolhido, utilize a
	 * fórmula pesoNoPlaneta = (pesoNaTerra/10) * gravidadeRelativa.
	 * Caso o usuário digite um código que não esteja na tabela,
	 * informar que o código inserido está errado.
	 */
	
	public static void main(String[] args) {
		
		boolean erro = false;
		int planetaID;
		double peso, planetaGravidade = 0;
		String mensagem = "", planetaNome ="";
		
		peso      = Teclado.lerInt("Informe o seu peso: ");
		planetaID = Teclado.lerInt("Digite o código de um planeta de 1 a 6");
		
				
		switch (planetaID) {
			case 1:
				planetaNome = "Mercúrio";
				planetaGravidade = 0.37;
				break;
			case 2:
				planetaNome = "Vênus";
				planetaGravidade = 0.88;
				break;
			case 3:
				planetaNome = "Marte";
				planetaGravidade = 0.38;
				break;
			case 4:
				planetaNome = "Júpiter";
				planetaGravidade = 2.64;
				break;
			case 5:
				planetaNome = "Saturno";
				planetaGravidade = 1.15;
				break;
			case 6:
				planetaNome = "Urano";	
				planetaGravidade = 1.17;
				break;
			default:
				erro = true;
				mensagem = "Código do planeta inválido";
				break;
		}		
		
		if (!erro) {
			planetaGravidade = (peso/10) * planetaGravidade;
			mensagem = "O seu peso no planeta "+planetaNome+" é de "+planetaGravidade+"kg";
		}
		
		System.out.print(mensagem);		

	}

}
