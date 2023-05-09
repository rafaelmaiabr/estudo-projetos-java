package controller;

import util.Teclado;

public class Exercicio04 {
	
	/*
	 * Desenvolver um programa que pergunte ao usuário o seu peso e sua altura.
	 * Ao final o programa deverá exibir na tela o valor do índice de massa corporal desta pessoa (IMC). 
	 * Fórmula: IMC = peso / altura² - Obs: peso em quilos e altura em metros
	 */
	public static void main (String[] args) {
		
		double imc, peso, altura;
		
		peso   = Teclado.lerDouble("Informe o seu peso em kilos:");
		altura = Teclado.lerDouble("Informe a sua altura:");
		
		imc = peso / Math.pow(altura, 2);
		
		System.out.println("Seu IMC é: " + imc);
		
	}

}
