package controller;

import util.Teclado;

public class ExemploMultiplaEscolha {
	/*
	 * Desenvolver um programa que mostre o menu de opções da tabela abaixo e peça o código desejado.
	 * Mostre como resposta uma mensagem confirmando a escolha do usuário,
	 * ou que o número digitado não existe no menu de opções.
	 * 1 incluir
	 * 2 alterar
	 * 3 excluir
	 * 4 pesquisar
	 * 5 sair
	 */
	public static void main(String[] args) {
		
		int opcao;
		String mensagem;
		opcao = Teclado.lerInt("Digite um número de 1 a 5");
				
		switch (opcao) {
			case 1:
				mensagem = "Ação incluir";
				
				break;
			case 2:
				mensagem = "Ação alterar";
				break;
			case 3:
				mensagem = "Ação excluir";
				break;
			case 4:
				mensagem = "Ação pesquisar";
				break;
			case 5:
				mensagem = "Ação sair";
				break;
						
			default:
				mensagem = "O número "+opcao+" não é uma opção válida";
				break;
		}
		
		System.out.print(mensagem);

	}

}
