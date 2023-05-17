package model;

public class Reptil extends Animal implements IAnimal {
	
	private boolean capacidadeRegenerativa;
	
	@Override
	public void tipoDeRespiracao() {
		super.tipoDeRespiracao();
		System.out.println("Traquial");
	}

	public Reptil() {
		super();
	}

	public Reptil(String nomenclarura, int numeroDePatas, String cobertoPor, String reproducao, String alimentacao,
			boolean capacidadeRegenerativa) {
		super(nomenclarura, numeroDePatas, cobertoPor, reproducao, alimentacao);
		this.capacidadeRegenerativa = capacidadeRegenerativa;
	}

	public boolean isCapacidadeRegenerativa() {
		return capacidadeRegenerativa;
	}

	public void setCapacidadeRegenerativa(boolean capacidadeRegenerativa) {
		this.capacidadeRegenerativa = capacidadeRegenerativa;
	}

	@Override
	public void temperaturaCorporal() {
		System.out.println("Temperatura corporal: Pecilotérmico");
		
	}

	@Override
	public void exibir() {
		System.out.println("\n--- Exibir Réptil ---");
		System.out.println("Nomenclatura: " + super.getNomenclarura());
		System.out.println("Número de Patas: " + super.getNumeroDePatas());
		System.out.println("Coberto por: " + super.getCobertoPor());
		System.out.println("Reprodução: " + super.getReproducao());
		System.out.println("Alimentação: " + super.getAlimentacao());
		
		String capacidadeRegenerativaTxt;
		
		capacidadeRegenerativaTxt = "possui";
		
		if (!this.capacidadeRegenerativa) {
			capacidadeRegenerativaTxt = "não "+capacidadeRegenerativaTxt;
		}
		
		System.out.println("Capacidade Regenerativa: " + capacidadeRegenerativaTxt);			
		tipoDeRespiracao();
		temperaturaCorporal();
	}



}
