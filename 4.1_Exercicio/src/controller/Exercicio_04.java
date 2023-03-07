package controller;

import util.Teclado;

public class Exercicio_04 {
	/*
	 *  Desenvolver um programa que pergunte 4 notas escolares de um aluno
	 *  e exiba mensagem informando que o aluno foi aprovado se
	 *  a média escolar for maior ou igual a 5.
	 *  Se o aluno não foi aprovado, indicar uma mensagem informando essa condição.
	 *  Apresentar junto com a mensagem de aprovação ou reprovação o valorda média obtida pelo aluno.”.
*/
	public static void main(String[] args) {
		
		String  mensagem;
		int valor,divisivelPor;
		
		valor = Teclado.lerInt("Informe um número");
		
		if (valor % 4 == 0 || valor % 5 == 0) {
			if (valor % 4 == 0) {
				divisivelPor = 4;
			}else {
				divisivelPor = 5;
			}
			
			mensagem = "O número "+ valor +" é divisível por " + divisivelPor + ".";
		}else {
			mensagem = "O número "+ valor +" não é divisível por 4 e nem por 5.";
		}
		
		System.out.println(mensagem);

	}

}
