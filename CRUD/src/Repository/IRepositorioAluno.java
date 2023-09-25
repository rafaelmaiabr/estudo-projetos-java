package Repository;

import java.util.List;

import Entity.Aluno;

public interface IRepositorioAluno {
	
	public boolean salvaAluno(Aluno aluno);
	public List<Aluno> retornaListaAluno();
	public boolean atualizaAluno(Aluno aluno);
	public boolean deletaAluno(int ra);
}
