package model;

public class Carro {
	
	private String fabricante;
	private String modelo;
	private String cor;
	private int ano;
	
	// método construtor simples
	public Carro() {
		super();
	}
	
	// método construtor completo
	public Carro(String fabricante, String modelo, String cor, int ano) {
		super();
		this.fabricante = fabricante;
		this.modelo = modelo;
		this.cor = cor;
		this.ano = ano;
	}

	// Métodos Getters e Setters (GET e SET)
	// Atalho Eclipse - Source > Generate Getters and Setters
	
	public String getFabricante() {
		return fabricante;
	}
	
	public void setFabricante(String fabricante) {
		this.fabricante = fabricante;
	}
	
	public String getModelo() {
		return modelo;
	}
	
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	
	public String getCor() {
		return cor;
	}
	
	public void setCor(String cor) {
		this.cor = cor;
	}
	
	public int getAno() {
		return ano;
	}
	
	public void setAno(int ano) {
		this.ano = ano;
	}
	
		
}
