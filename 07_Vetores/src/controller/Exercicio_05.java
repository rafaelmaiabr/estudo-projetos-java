package controller;

import java.lang.reflect.Array;

import util.Teclado;

public class Exercicio_05 {
	/*
	 * Desenvolver um programa que pergunte 5 valores do vetor a,
	 * e em seguida crie um vetor b de mesma dimensão contendo
	 * os valores ao quadrado correspondentes no vetor a.
	 * Ao final exibir os 2 vetores.
	 */
	
	public static void main(String[] args) {
		
		int vetores = 2;
		String mensagem = "";
		
		double a[] = new double[vetores];
		double b[] = new double[vetores];
		
		for (int i = 0 ; i < vetores ; i++) {
			
			a[i] = Teclado.lerInt("Informe o "+(i+1)+"º número");
			
			b[i] = Math.pow(a[i], 2);
			
			mensagem += a[i] + "² = "+ b[i] +" \n";
			
		}
				
		System.out.print("-------------------\n" + mensagem + "-------------------");
		
	}

}
