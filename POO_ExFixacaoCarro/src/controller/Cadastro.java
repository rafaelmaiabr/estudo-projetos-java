package controller;

import model.Carro;

public class Cadastro {

	public static void main(String[] args) {
	
		//Instanciando objeto com construtor simples		
		Carro uno = new Carro();
		uno.setFabricante("Fiat");
		uno.setModelo("Uno Mille 1.0");
		uno.setAno(2010);
		uno.setMotorLigado(false);
		uno.setVelocidade(0);
		
		//Instanciando objeto com construtor completo
		Carro gol = new Carro("VW", "Gol Turbo", 2018);
		
		Carro ka = new Carro("Ford", "Ka", 2020, true, 95);
		
		//Resultado chamando o void
		System.out.println("## DADOS DO(S) VEÍCULO(S) ##");
		uno.detalhes();
		String textoUno = uno.situacaoMotor();
		System.out.print("\n"+textoUno);
		System.out.print("\n---------------------\n");
		
		gol.detalhes();
		System.out.print("\n"+gol.situacaoMotor());
		System.out.print("\n---------------------\n");
		
		ka.detalhes();
		System.out.print("\n"+ka.situacaoMotor());
		System.out.println("\n---------------------\n");

		
		
		
		
		/* Resultado gerado manualmente
		System.out.print(
			"## DADOS DO VEÍCULO ##"+
			"\nFabricante: " + uno.getFabricante()+
			"\nModelo: " + uno.getModelo()+
			"\nAno: " + uno.getAno()+
			"\nMotor Ligado? " + uno.isMotorLigado()+
			"\nVelocidade: " + uno.getVelocidade()
		);
		
		System.out.print(
			"\n\n## DADOS DO VEÍCULO ##"+
			"\nFabricante: " + gol.getFabricante()+
			"\nModelo: " + gol.getModelo()+
			"\nAno: " + gol.getAno()+
			"\nMotor Ligado? " + gol.isMotorLigado()+
			"\nVelocidade: " + gol.getVelocidade()
		);
		*/
		
	}

}
