package Entity;

import Repository.RepositorioAluno;

public class Teste {

	public static void main(String[] args) {
		Aluno z= new Aluno();
		RepositorioAluno repAluno = new RepositorioAluno();
		
		
		z.setRa(1);
		z.setNome("zodi2");
		z.setCurso("ADS");
		z.setSexo('M');
		z.setTurno("Noite");
		
		if(repAluno.salvaAluno(z)) {
			System.out.println("Aluno salvo.");
		} 
		
		System.out.println(repAluno.retornaListaAluno().get(0).getNome());
		

	}

}
