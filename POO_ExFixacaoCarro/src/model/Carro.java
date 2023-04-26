package model;

public class Carro {
	
	private String fabricante;
	private String modelo;
	private int ano;
	private boolean motorLigado;
	private int velocidade;
	
	//metodo responsavel por imprimir resultado
	public void detalhes() {
		/*
		 * pode ser chamando o método ou this
		 * Exemplos:
		 * this.fabricante
		 * getModelo()		 * 
		 */
		
		System.out.print(
			"Fabricante: " + this.fabricante+
			"\nModelo: " + getModelo()+
			"\nAno: " + this.ano
		);
	}
	
	public String situacaoMotor() {
		
		if (this.motorLigado) {
			return "--> motor LIGADO";			
		}else {
			return "--> motor DESLIGADO";	
		}		
	}
		
	//metodo construtor simples
	public Carro() {
		super();
	}

	//metodo construtor completo
	public Carro(String fabricante, String modelo, int ano, boolean motorLigado, int velocidade) {
		super();
		this.fabricante = fabricante;
		this.modelo = modelo;
		this.ano = ano;
		this.motorLigado = motorLigado;
		this.velocidade = velocidade;
		
	}
	
	// Método construtor personalizado (terceiro m. construtor)
	public Carro(String fabricante, String modelo, int ano) {
		super();
		this.fabricante = fabricante;
		this.modelo = modelo;
		this.ano = ano;
		this.motorLigado = false;
		this.velocidade = 0;
		
	}
	
	//	Getters e Setters
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

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

	public boolean isMotorLigado() {
		return motorLigado;
	}

	public void setMotorLigado(boolean motorLigado) {
		this.motorLigado = motorLigado;
	}

	public int getVelocidade() {
		return velocidade;
	}

	public void setVelocidade(int velocidade) {
		this.velocidade = velocidade;
	}
	
	
	
}
