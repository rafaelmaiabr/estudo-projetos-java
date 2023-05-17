package model;

public class Mamifero extends Animal implements IAnimal{
	
	private String habitat;

	@Override
	public void tipoDeRespiracao() {
		super.tipoDeRespiracao();
		System.out.println("Pulmonar");
	}

	public Mamifero() {
		super();
	}

	public Mamifero(String nomenclarura, int numeroDePatas, String cobertoPor, String reproducao, String alimentacao,
			String habitat) {
		super(nomenclarura, numeroDePatas, cobertoPor, reproducao, alimentacao);
		this.habitat = habitat;
	}

	public String getHabitat() {
		return habitat;
	}

	public void setHabitat(String habitat) {
		this.habitat = habitat;
	}

	@Override
	public void temperaturaCorporal() {
		System.out.println("Temperatura corporal: Homeotérmico");
		
	}

	@Override
	public void exibir() {
		System.out.println("\n--- Exibir Mamífero ---");
		System.out.println("Nomenclatura: " + super.getNomenclarura());
		System.out.println("Número de Patas: " + super.getNumeroDePatas());
		System.out.println("Coberto por: " + super.getCobertoPor());
		System.out.println("Reprodução: " + super.getReproducao());
		System.out.println("Alimentação: " + super.getAlimentacao());
		System.out.println("Habitat: " + this.habitat);
		tipoDeRespiracao();
		temperaturaCorporal();
	}
	
	

}
