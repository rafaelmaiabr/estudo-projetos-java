package controller;

import util.Teclado;

public class DesvioCondicionalEncadeado2 {
	/*
	 * Elaborar um programa que calcule o reajuste de salario de um funcionario, sob
	 * as seguintes condicoes:
	 * - Reajuste de 15% se salario menor que R$ 500,00;
	 * - Reajuste de 10% se salario entre R$ 500,00 e R$ 1000,00
	 * - Reajuste de 5% se salario for acima de R$ 1000,00
	 */
	public static void main(String[] args) {

		double salario, salarioReajustado;
		int reajuste;
		String mensagem;

		salario = Teclado.lerInt("Por favor informe seu salario: ");		

		if ( salario < 500 ) {
			reajuste = 15;
			salarioReajustado = (salario * reajuste / 100) + salario;			
		
		} else {
			if ( salario <= 1000 ) {
				reajuste = 10;
				salarioReajustado = (salario * reajuste / 100) + salario;	
				
			}else {
				reajuste = 5;
				salarioReajustado = (salario * reajuste / 100) + salario;	
				
			}
		}
		
		mensagem = "O seu salário teve um reajuste de " + reajuste + "%\nAgora ele é: "+salarioReajustado+".";	
		
		System.out.println(mensagem);

	}

}
