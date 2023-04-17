package controller;

import util.Teclado;

public class Questao_5 {
	
	public static void main(String[] args) {
		
		int num;
		
		do {
			num = Teclado.lerInt("Num Positivo");
		}while (num < 0);
		
		System.out.println("num positivo foi "+num);

	}

}
