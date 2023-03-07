package controller;

import util.Teclado;

public class Exercicio_05 {
	/*
	 *  Desenvolver um programa que pergunte 4 notas escolares de um aluno
	 *  e exiba mensagem informando que o aluno foi aprovado se
	 *  a média escolar for maior ou igual a 5.
	 *  Se o aluno não foi aprovado, indicar uma mensagem informando essa condição.
	 *  Apresentar junto com a mensagem de aprovação ou reprovação o valor da média obtida pelo aluno.”.
*/
	public static void main(String[] args) {
		
		String  mensagem;
		double nota1,nota2,nota3,nota4, media;
		
		nota1 = Teclado.lerInt("Qual sua nota de Português?");
		nota2 = Teclado.lerInt("Qual sua nota de Matemática?");
		nota3 = Teclado.lerInt("Qual sua nota de Estudos Sociais?");
		nota4 = Teclado.lerInt("Qual sua nota de Ciências?");
		
		media = (nota1+nota2+nota3+nota4) / 4;
		
		if (media >= 5) {			
			mensagem = "Parabéns você foi aprovado \n Sua média foi "+media;
		}else {
			mensagem = "Você foi reprovado. \nSua média foi "+media;
		}
		
		System.out.println(mensagem);

	}

}
