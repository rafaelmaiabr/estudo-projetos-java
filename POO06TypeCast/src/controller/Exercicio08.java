package controller;

import util.Teclado;

public class Exercicio08 {
	
	/*
	 * Fazer um algoritmo que receba o preço de custo de um produto
	 * e mostre como resposta o valor de venda.
	 * Sabe-se que o preço de custo receberá um acréscimo de acordo com um percentual informado pelo usuário.
	 */
	public static void main (String[] args) {
		
		String produto;
		double precoCusto, acrescimoPercentual, precoFinal;
		
		produto   = Teclado.lerTexto("Nome do Produto:");
		precoCusto = Teclado.lerDouble("Custo do produto:");
		acrescimoPercentual = Teclado.lerDouble("Acréscimo em %");
		
		precoFinal = precoCusto * acrescimoPercentual/100;
		precoFinal += precoCusto;
		
		System.out.print("O produto " + produto +
			"\nPossui o valor de R$ " + precoCusto +
			"\nValor de venda é de " + precoFinal
		);
		
	}

}
