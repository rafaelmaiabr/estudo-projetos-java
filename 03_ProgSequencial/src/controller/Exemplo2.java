package controller;

import util.Teclado;

public class Exemplo2 {
	/*
	 * Desenvolver um programa que peça ao usuário comprar uma coxinha
	 * e um rissole na cantina. Informar se ele atendeu o pedido 
	*/
	public static void main(String[] args) {
		
		String produto1, produto2, pedido, entrega1, entrega2,resultado1,resultado2;
		boolean retorno1, retorno2;
		
		produto1 = Teclado.lerTexto("Informe o nome do 1º produto");
		produto2 = Teclado.lerTexto("Informe o nome do 2º produto");
		
		pedido = "Poderia comprar " + produto1 + " e " + produto2;
		
		entrega1 = Teclado.lerTexto("Tinha "+produto1+"?");
		entrega2 = Teclado.lerTexto("Tinha "+produto2+"?");
		
		if (entrega1.equals("s")) {
			resultado1 = "Oba, hoje como "+produto1;
			retorno1 = true;
		}else {
			resultado1 = "Putz, ficarei sem "+produto1;
			retorno1 = false;
		}
		
		if (entrega2.equals("s")) {
			resultado2 = "Oba, hoje como "+produto2;
			retorno2 = true;
		}else {
			resultado2 = "Putz, ficarei sem "+produto2;
			retorno2 = false;
		}
		
		
		if (retorno1 && retorno2) {
			System.out.println("Opa!!! comerei "+produto1+" e "+produto2+" hoje!");
		}else {
			System.out.println(resultado1);
			System.out.println(resultado2);
		}
		

	}

}
