package controller;
public class Aluno {
    private int ra;
    private String nome;
    private String curso;
    private char sexo;
    private String turno;

    // Construtor
    public Aluno(int ra, String nome, String curso, char sexo, String turno) {
        this.ra = ra;
        this.nome = nome;
        this.curso = curso;
        this.sexo = sexo;
        this.turno = turno;
    }

    // Getters e Setters
    public int getRa() {
        return ra;
    }

    public void setRa(int ra) {
        this.ra = ra;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }

    @Override
    public String toString() {
        return "RA: " + ra +
               "\nNome: " + nome +
               "\nCurso: " + curso +
               "\nSexo: " + sexo +
               "\nTurno: " + turno;
    }
}
