package model;

public class Professor extends Pessoa implements IPessoa {
	
	private String formacao;
	
	//método em polimorfismo
	@Override //notação que indica um polimorfismo
	public void exibirMatriculaENome() {
		super.exibirMatriculaENome();
		System.out.print(" - Formação: " + this.formacao);
	}

	public Professor() {
		super();
	}

	public Professor(int matricula, String nome, String dataNascimento, String formacao) {
		super(matricula, nome, dataNascimento);
		this.formacao = formacao;
	}

	public String getFormacao() {
		return formacao;
	}

	public void setFormacao(String formacao) {
		this.formacao = formacao;
	}

	@Override
	public void mostrar() {
		System.out.println("\nMetodo Mostrar - origem da classe PROFESSOR");
		
	}

	@Override
	public void sorrir() {
		System.out.println("Professor(a) " + super.getNome() + " está sorrindo!!!");
		
	}	

}
