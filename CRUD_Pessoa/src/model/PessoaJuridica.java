package model;

public class PessoaJuridica extends Pessoa {
	private int cnpj;
	
	public PessoaJuridica() {
		super();
	}
	
	public PessoaJuridica(int cnpj, String nome) {
		super();
		this.cnpj = cnpj;
		
	}

	public int getCpf() {
		return cnpj;
	}

	public void setCpf(int cnpj) {
		this.cnpj = cnpj;
	}
	
}
