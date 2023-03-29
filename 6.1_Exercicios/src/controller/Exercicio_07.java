package controller;

import util.Teclado;

public class Exercicio_07 {
	
	/*
	 * Elabore um programa que pergunte dois números e também qual operação a ser realizada com estes dois números
	 * de acordo com a tabela abaixo (esta tabela deve aparecer como menu de escolha para o usuário).
	 * Caso o usuário digite um código que não esteja na tabela, informar que o código inserido está errado.
	 * 
	 * | Código | Operação 										|
	 * | a		| Média aritmética entre os números digitados 	|
	 * | b		| Diferença do maior pelo menor 				|
	 * | c 		| Produto entre os números digitados 			|
	 * | d 		| Divisão do primeiro pelo segundo 				|
	 */
	
	public static void main(String[] args) {
				
		String operacao, mensagem;
		int numero1 = 0, numero2 = 0;
		double resultado;
		operacao = Teclado.lerTexto(
				"Digite uma letra para calcular \n\n"+
				"a: Média aritmética entre os números digitados \n"+
				"b: Diferença do maior pelo menor \n"+
				"c: Produto entre os números digitados \n"+
				"d: Divisão do primeiro pelo segundo \n"
				);
		if (operacao == "a" || operacao == "b" || operacao == "c" || operacao == "d") {
			numero1 = Teclado.lerInt("Digite o primeiro número:");
			numero2 = Teclado.lerInt("Digite o segundo número:");	
		}
				
		switch (operacao) {
			case "a":
				resultado = 0;
				mensagem = "A média aritmética entre os "+numero1+" e "+numero2+" é: ...";
				
				break;
			case "b":
				mensagem = "A diferença do maior pelo menor entre "+numero1+" e "+numero2+" é: ...";
				break;
			case "c":
				mensagem = "Produto entre "+numero1+" e "+numero2+" é: ...";
				break;
			case "d":
				resultado = numero1 / numero2;
				mensagem = "A divisão entre "+numero1+" e "+numero2+" é: "+resultado;
				break;
						
			default:
				mensagem = "O código inserido está errado";
				break;
		}
		
		
		System.out.print(mensagem);
		
	}

}
