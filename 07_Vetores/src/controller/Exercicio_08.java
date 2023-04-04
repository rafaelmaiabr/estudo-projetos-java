package controller;

import java.lang.reflect.Array;

import util.Teclado;

public class Exercicio_08 {
	/*
	 * Desenvolver um programa que armazene nome e nota das PR1 e PR2 de 15 alunos,
	 * calcule e armazene a média, armazene também a situação do aluno (AP ou RP).
	 * Exibir ao final uma listagem contendo nomes, notas, médias e situação de cada aluno.
	 */
	
	public static void main(String[] args) {
		
		int vetores = 15;
		String mensagem = "";
		
		String nome[] = new String[vetores];
		double pr1[] = new double[vetores];
		double pr2[] = new double[vetores];
		double media[] = new double[vetores];
		String situacao[] = new String[vetores];		
				
		for (int i = 0 ; i < vetores ; i++) {
			
			nome[i] = Teclado.lerTexto("Nome do "+(i+1)+"º aluno");
			pr1[i] = Teclado.lerInt("Nota da prova 1ª do aluno "+(nome[i]));
			pr2[i] = Teclado.lerInt("Nota da prova 2ª do aluno "+(nome[i]));
			
			media[i] = pr1[i] + pr2[i] / 2;			
			
			if (media[i] >= 7 ) {
				situacao[i] = "Aprovado.";
			}else {
				situacao[i] = "Reprovado.";
			}
			
			mensagem += "Aluno(a): " + nome[i] + "\nPR1: " + pr1[i] + "\nPR2: " + pr2[i] + "\nSituação: "+situacao[i]+"\n";
			mensagem += "-------------------------------------------------------------\n";
		}
				
		System.out.print("# # # # BOLETIM # # # # \n" + mensagem);
		
	}

}
