package controller;

import util.Teclado;

public class Exercicio_01 {
	
	public static void main(String[] args) {
		
		String sigla, mensagem;
		sigla = Teclado.lerTexto("Informe a Sigla de um estado brasileiro");
				
		switch (sigla) {
			case "RJ":
				mensagem = "A sigla "+sigla+" corresponde ao estado do Rio de Janeiro";
				
				break;
			case "SP":
				mensagem = "A sigla "+sigla+" corresponde ao estado do São Paulo";
				break;
			case "MG":
				mensagem = "A sigla "+sigla+" corresponde ao estado do Minas Gerais";
				break;
						
			default:
				mensagem = "A sigla "+sigla+" não corresponde a um item da lista dos estados cadastrados no sistema";
				break;
		}
		
		
		System.out.print(mensagem);

	}

}
