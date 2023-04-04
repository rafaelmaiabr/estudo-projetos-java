package controller;

import java.lang.reflect.Array;

import util.Teclado;

public class Exercicio_02 {
	/*
	 * Desenvolver um programa que pergunte cinco elementos de um vetor a.
	 * No final, apresente a soma de todos os elementos deste vetor.
	 */
	
	public static void main(String[] args) {
		
		int a[] = new int[5];
		int soma = 0;
		String mensagem;
		
		for (int i = 0 ; i < 5 ; i++) {
			
			a[i] = Teclado.lerInt("Informe o "+(i+1)+"º número");
			
			soma = soma + a[i];
			
		}
		
		mensagem = "O valor da soma dos itens digitados é: "+soma;
		
		System.out.print(mensagem);
		
	}

}
