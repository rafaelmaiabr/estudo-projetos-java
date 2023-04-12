package controller;

import model.Carro;
import util.Teclado;

public class Cadastro {

	public static void main(String[] args) {
		
		//Instanciando Objeto
		Carro hach = new Carro();
		hach.fabricante = "Fiat";
		hach.modelo = "Uno";
		hach.cor = "Preto";
		hach.ano = 2015;
		
		Carro sedan = new Carro();
		sedan.fabricante = "Fiat";
		sedan.modelo = "Linea";
		sedan.cor = "Preto";
		sedan.ano = 2015;
		
		Carro user = new Carro();
		user.fabricante = Teclado.lerTexto("Digite o nome do Fabricante?");
		user.modelo = Teclado.lerTexto("Agora o Modelo?");
		user.cor = Teclado.lerTexto("QUal seria a Cor?");
		user.ano = Teclado.lerInt("E o Ano?");
		
		System.out.println("------------------------");
		System.out.println("Fabricante: " + hach.fabricante);
		System.out.println("Modelo: " + hach.modelo);
		System.out.println("Cor" + hach.cor);
		System.out.println("Ano: " + hach.ano);
		
		System.out.println("------------------------");
		System.out.println("Fabricante: " + sedan.fabricante);
		System.out.println("Modelo: " + sedan.modelo);
		System.out.println("Cor" + sedan.cor);
		System.out.println("Ano: " + sedan.ano);
		
		System.out.println("------------------------");
		System.out.println("Fabricante: " + user.fabricante);
		System.out.println("Modelo: " + user.modelo);
		System.out.println("Cor" + user.cor);
		System.out.println("Ano: " + user.ano);

		
		

	}
	
	
}
