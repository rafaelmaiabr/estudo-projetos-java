package model;

public class Carro {
	
	public String fabricante;
	public String modelo;
	public String cor;
	public int ano;
	
	// método construtor simples
	public Carro() {
		
	}
	
	public Carro(String fabricante, String modelo, String cor, int ano) {
		this.fabricante = fabricante;
		this.modelo = modelo;
		this.cor = cor;
		this.ano = ano;
	}
		
}
