package controller;

import model.Aluno;
import model.Professor;

public class Cadastro {

	public static void main(String[] args) {
		
		
		Aluno a1 = new Aluno(501, "Ana Silva", "01/01/2000", "Feminino", 2023051);
		a1.exibirMatriculaENome();
		a1.mostrar();
		a1.sorrir();
		
		Professor pr1 = new Professor(74, "Flávia Noronha", "25/09/1980", "Design");
		pr1.exibirMatriculaENome();
		pr1.mostrar();	
		pr1.sorrir();
		
		
	}

}






