package model;

public abstract class Animal {
	
	private String 	nomenclarura;
	private int 	numeroDePatas;
	private String 	cobertoPor;
	private String 	reproducao;
	private String 	alimentacao;
	
	public abstract void exibir();
	
	public void tipoDeRespiracao() {
		System.out.print("Respiracao do tipo: ");
	}
	
	public void comer() {
		System.out.println(this.nomenclarura + " comeu e agora está feliz");
	}
	
	public Animal() {
		super();
	}

	public Animal(String nomenclarura, int numeroDePatas, String cobertoPor, String reproducao, String alimentacao) {
		super();
		this.nomenclarura  	= nomenclarura;
		this.numeroDePatas 	= numeroDePatas;
		this.cobertoPor 	= cobertoPor;
		this.reproducao 	= reproducao;
		this.alimentacao 	= alimentacao;
	}

	public String getNomenclarura() {
		return nomenclarura;
	}

	public void setNomenclarura(String nomenclarura) {
		this.nomenclarura = nomenclarura;
	}

	public int getNumeroDePatas() {
		return numeroDePatas;
	}

	public void setNumeroDePatas(int numeroDePatas) {
		this.numeroDePatas = numeroDePatas;
	}

	public String getCobertoPor() {
		return cobertoPor;
	}

	public void setCobertoPor(String cobertoPor) {
		this.cobertoPor = cobertoPor;
	}

	public String getReproducao() {
		return reproducao;
	}

	public void setReproducao(String reproducao) {
		this.reproducao = reproducao;
	}

	public String getAlimentacao() {
		return alimentacao;
	}

	public void setAlimentacao(String alimentacao) {
		this.alimentacao = alimentacao;
	}
	
	
	
}
