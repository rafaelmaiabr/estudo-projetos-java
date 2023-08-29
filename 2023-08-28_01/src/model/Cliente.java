package model;

import java.util.Date;
/**
 * Classe de clientes
 */
public class Cliente {
	
	private String cpf;
	private String nome;
	private Date dataNascimento;
	private char sexo;
	private boolean temFilho;
	
	
	public Cliente(String cpf, String nome, Date dataNascimento, char sexo, boolean temFilho) {
		super();
		this.cpf = cpf;
		this.nome = nome;
		this.dataNascimento = dataNascimento;
		this.sexo = sexo;
		this.temFilho = temFilho;
	}

	/**
	 * Metodo para retonar cpf
	 * @return the cpf
	 */
	public String getCpf() {
		return cpf;
	}

	/**
	 * Metodo para atribuir cpf
	 * @param cpf the cpf to set
	 */
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	/**
	 * @return the nome
	 */
	public String getNome() {
		return nome;
	}

	/**
	 * @param nome the nome to set
	 */
	public void setNome(String nome) {
		this.nome = nome;
	}

	/**
	 * @return the dataNascimento
	 */
	public Date getDataNascimento() {
		return dataNascimento;
	}

	/**
	 * @param dataNascimento the dataNascimento to set
	 */
	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	/**
	 * @return the sexo
	 */
	public char getSexo() {
		return sexo;
	}

	/**
	 * @param sexo the sexo to set
	 */
	public void setSexo(char sexo) {
		this.sexo = sexo;
	}

	/**
	 * @return the temFilho
	 */
	public boolean isTemFilho() {
		return temFilho;
	}

	/**
	 * @param temFilho the temFilho to set
	 */
	public void setTemFilho(boolean temFilho) {
		this.temFilho = temFilho;
	}
	
}
