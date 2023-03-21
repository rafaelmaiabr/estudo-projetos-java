package controller;

import util.Teclado;

public class Exercicio_03 {
	/*
	 * Desenvolver um programa que apresente a série de Fibonacci até o décimo
	 * quinto termo. A série de Fibonacci é formada pela sequência
	 * 1,1,2,3,5,8,13,21,34, ... etc. Essa série se caracteriza pela soma de um
	 * termo posterior com o seu anterior subsequente.
	 */

	public static void main(String[] args) {
		
		
		
        int num1 = 1, num2 = 0;
        
        //System.out.println(num2);
        //System.out.println(num1);
        
        for(int i = 0; i < 8; i++){
            num1 = num1 + num2;
            num2 = num1 - num2;
            System.out.println(num1);
        }		

		/*
		int ant =1, pos = 1, cont = 1, aux;
				
		do {
			
			System.out.print(ant + " ");
			
			aux = ant + pos;
			ant = pos;
			pos = aux;
			
			cont++;
			
		}while(cont <= 15);
*/
			

	}

}
