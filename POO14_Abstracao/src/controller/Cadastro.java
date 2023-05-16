package controller;

import model.Aluno;
import model.Professor;

public class Cadastro {

	public static void main(String[] args) {
		
		
		Aluno a1 = new Aluno(501, "Ana Silva", "01/01/2000", "Feminino", 2023051);
		a1.exibirMatriculaENome();
		
		Professor pr1 = new Professor(74, "Flávia Noronha", "25/09/1980", "Design");
		pr1.exibirMatriculaENome();
		
		
//		Pessoa p1 = new Pessoa();
//		p1.setMatricula(115);
//		p1.setNome("Renato Medeiros");
//		p1.setDataNascimento("18/05/1999");
//		
//		p1.exibirMatriculaENome();
		
		System.out.println(a1);
		
		a1.mostrar();
		pr1.mostrar();
	}

}






