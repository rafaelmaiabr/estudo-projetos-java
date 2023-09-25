package Repository;

import java.util.ArrayList;
import java.util.List;

import Entity.Aluno;

public class RepositorioAluno implements IRepositorioAluno{

	List<Aluno> listaAlunos = new ArrayList<Aluno>();
	
	@Override
	public boolean salvaAluno(Aluno aluno) {
		boolean ok;
		try {
			ok=listaAlunos.add(aluno);
		} catch (Exception e) {
			ok=false;
		}
		return ok;
		
	}

	@Override
	public List<Aluno> retornaListaAluno() {
		return listaAlunos;
	}

	@Override
	public boolean atualizaAluno(Aluno aluno) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean deletaAluno(int ra) {
		// TODO Auto-generated method stub
		return false;
	}

	
	
}
