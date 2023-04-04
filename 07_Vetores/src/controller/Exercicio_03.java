package controller;

import java.lang.reflect.Array;

import util.Teclado;

public class Exercicio_03 {
	/*
	 * Desenvolver um programa que pergunte cinco elementos de um vetor a.
	 * No final, apresente a soma de todos os elementos que sejam ímpares.
	 */
	
	public static void main(String[] args) {
		
		int a[] = new int[5];
		int soma = 0, impares = 0;
		String mensagem;
		
		for (int i = 0 ; i < 5 ; i++) {
			
			a[i] = Teclado.lerInt("Informe o "+(i+1)+"º número");
			
			if (a[i] % 2 == 1) {
				soma = soma + a[i];
				impares++;
			}
			
		}
		switch (impares) {
			case 0:
				mensagem = "Nenhum número impar foi digitado";
				break;
			case 1: 
				mensagem = "Foi digitado apenas 1 número ímpar";
				break;
			default:
				mensagem = "Foram digitados "+impares+" números ímpares. \nA soma deles é: "+soma;
				break;
			
		}
		
		System.out.print(mensagem);
		
	}

}
