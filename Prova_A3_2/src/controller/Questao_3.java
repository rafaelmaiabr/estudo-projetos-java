package controller;

public class Questao_3 {
	
	public static void main(String[] args) {
		
		int v1[] = new int[5];
		int v2[] = new int[5];
		int numero = 10;
		
		for (int cont = 0 ; cont < 5 ; cont ++) {
			v1[cont] = numero;
			numero ++;
			v2[cont] = numero;
		}
		
		for (int cont = 0 ; cont < 5 ; cont ++) {
			System.out.print(v1[cont] + " ");
		}
		
		for (int cont = 0 ; cont < 5 ; cont ++) {
			System.out.print(v2[cont] + " ");
		}

	}

}
