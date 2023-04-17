package controller;

import util.Teclado;

public class Questao_2 {
	
	public static void main(String[] args) {
		
		double vet[] = new double[20];
		int mult=1;
		
		for (int cont = 0 ; cont < 20 ; cont ++) {
			vet [cont] = Teclado.lerDouble("Nota"+cont);
			mult = mult * vet[cont];
		}

	}

}
