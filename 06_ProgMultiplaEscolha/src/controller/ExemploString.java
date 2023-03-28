package controller;

import util.Teclado;

public class ExemploString {
	/*
	 * Programa que pergunte o nº de matrícua de sócio de um Clube e exiba o mês de
	 * pagamento da anuidade, confirme a seguinte tabela:
	 * 
	 * Nº Final da Matrícula - Mês de Pagamento
	 * 0 - Janeiro
	 * 1 - Fevereiro
	 * 2 - Março
	 * 3 - Abril
	 * Outro Final - Maio
	 */
	
	public static void main(String[] args) {
		
		int matricula, ultimoDigito;
		String mes;
		matricula = Teclado.lerInt("Informe o número de sua matrícula: ");
		ultimoDigito = matricula % 10; // Rest da divisao por 10 ele obtem o ultimo dígito
		

		switch (ultimoDigito) {
			case 0:
				mes = "Janeiro";
				
				break;
			case 1:
				mes = "Fevereiro";
				break;
			case 2:
				mes = "Março";
				break;
			case 3:
				mes = "Abril";
				break;
			
			default:
				mes = "Maio";
				break;
		}
		
		System.out.print("Mês de pagamento: "+mes);

	}

}
