package controller;

import model.Mamifero;
import model.Reptil;

public class CadastroAnimal {

	public static void main(String[] args) {
		// Utilizando o construtor simples
		Reptil jacare = new Reptil();
		jacare.setNomenclarura("Jacaré");
		jacare.setNumeroDePatas(4);
		jacare.setCobertoPor("Escamas");
		jacare.setReproducao("Ovíparo");
		jacare.setAlimentacao("Carnívoro");
		jacare.setCapacidadeRegenerativa(false);
		
		// Utilizando o construtor completo
		Reptil lagartixa	= new Reptil("Lagartixa", 4, "Escamas", "Ovíparo", "Carnívoro", true);
		
		Mamifero cachorro	= new Mamifero("Cachorro", 4, "Pelo", "Vivíparo", "Carnívoro", "Terrestre");

		Mamifero baleia		= new Mamifero("Baleia", 0, "Pele", "Vivíparo", "Carnívoro", "Aquático");
		
		jacare.comer();
		baleia.comer();
		
//		jacare.tipoDeRespiracao();
//		baleia.tipoDeRespiracao();

//		jacare.temperaturaCorporal();
//		baleia.temperaturaCorporal();

		jacare.exibir();
		lagartixa.exibir();
		
		cachorro.exibir();
		baleia.exibir();

	}

}
