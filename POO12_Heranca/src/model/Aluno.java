package model;

public class Aluno extends Pessoa {

	private String sexo;
	private int turma;
	
	public Aluno() {
		super();
	}

	public Aluno(int matricula, String nome, String dataNascimento, String sexo, int turma) {
		super(matricula, nome, dataNascimento);
		this.sexo = sexo;
		this.turma = turma;
	}

	public String getSexo() {
		return sexo;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	public int getTurma() {
		return turma;
	}
	public void setTurma(int turma) {
		this.turma = turma;
	}

}
