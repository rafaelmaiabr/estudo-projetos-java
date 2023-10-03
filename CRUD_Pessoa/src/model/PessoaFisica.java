package model;

public class PessoaFisica extends Pessoa {
	private int cpf;
	
	public PessoaFisica() {
		super();
	}
	
	public PessoaFisica(int cpf, String nome) {
		super();
		this.cpf = cpf;
		
	}

	public int getCpf() {
		return cpf;
	}

	public void setCpf(int cpf) {
		this.cpf = cpf;
	}
	
}
