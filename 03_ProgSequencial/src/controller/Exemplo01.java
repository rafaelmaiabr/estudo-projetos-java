package controller;

import util.Teclado;

public class Exemplo01 {
	/*
	 * Elaborar um programa que pergunte ao usuário o seu nome,
	 * as suas duas notas e apresente como resultado um relatório com o seu nome,
	 * suas notas e sua média.
	 */
	public static void main(String[] args) {
		
		
		String nome, resultado, separador;
		double nota1, nota2, media;
		
		// Perguntar o nome do usuário e duas notas e armazenar em variáveis
		nome	= Teclado.lerTexto("Informe o seu nome");
		nota1 	= Teclado.lerDouble("Informe sua nota 1");
		nota2 	= Teclado.lerDouble("Informe sua nota 2");
		media	= (nota1 + nota2) / 2;
		
		// Imprimir resultado com o nome do usuário, notas e média	
		resultado = "Olá " + nome + ", \n"+
		"As suas notas foram \n"+
		"1ª nota: "+nota1+"\n"+
		"2ª nota: "+nota2+"\n\n"+
		"A sua média é: " + media;
		
		separador = "----------------------";
		
		System.out.println(separador);
			System.out.println(resultado);
		System.out.println(separador);
		

	}

}
