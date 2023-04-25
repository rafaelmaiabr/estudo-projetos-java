package controller;

import model.Carro;
import util.Teclado;

public class Cadastro {

	public static void main(String[] args) {
		
		Carro kombi = new Carro("VW", "Kombi 1.6", "Branca", 2000);
		
		
		//Instanciando Objeto
		Carro uno = new Carro();
		
		// inserindo dados no objeto "uno"
		uno.setFabricante("Fiat");
		uno.setModelo("Uno");
		uno.setCor("Preto");
		uno.setAno(2015);
		
//		Carro sedan = new Carro();
//		sedan.fabricante = "Fiat";
//		sedan.modelo = "Linea";
//		sedan.cor = "Preto";
//		sedan.ano = 2015;
//		
		Carro user = new Carro();
		user.setFabricante(Teclado.lerTexto("Digite o nome do Fabricante?"));;
//		user.modelo = Teclado.lerTexto("Agora o Modelo?");
//		user.cor = Teclado.lerTexto("QUal seria a Cor?");
//		user.ano = Teclado.lerInt("E o Ano?");
		
		System.out.println("------------------------");
		System.out.println("Fabricante: " + uno.getFabricante());
		System.out.println("Modelo: " + uno.getModelo());
		System.out.println("Cor: " + uno.getCor());
		System.out.println("Ano: " + uno.getAno());
		
//		System.out.println("------------------------");
//		System.out.println("Fabricante: " + sedan.fabricante);
//		System.out.println("Modelo: " + sedan.modelo);
//		System.out.println("Cor" + sedan.cor);
//		System.out.println("Ano: " + sedan.ano);
//		
		System.out.println("------------------------");
		System.out.println("Fabricante: " + user.getFabricante());
//		System.out.println("Modelo: " + user.modelo);
//		System.out.println("Cor: " + user.cor);
//		System.out.println("Ano: " + user.ano);	
		
//		Alterando valor depois de declarado
		
		kombi.setCor("Preta");
		
		System.out.println("------------------------");
		System.out.println("Fabricante: " + kombi.getFabricante());
		System.out.println("Modelo: " + kombi.getModelo());
		System.out.println("Cor: " + kombi.getCor());
		System.out.println("Ano: " + kombi.getAno());

	}
	
	
}
