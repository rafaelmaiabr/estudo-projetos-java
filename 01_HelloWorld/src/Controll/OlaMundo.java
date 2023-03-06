package Controll;

public class OlaMundo {
	public static void main(String[] args) {
		
		//Print Screen the user
		System.out.println("Olá Mundo!");
		System.out.println("Tudo Bem?");
		
		//Variables
		String mensagem;
		int numero1, numero2, soma;
		double pay1, pay2, paySum;
		
		mensagem = "Me chamo Rafael Maia, nasci em 1985 e tenho "+
		(2023-1985)+
		" anos";
		
		System.out.println(mensagem);
		
		// Integer
		numero1 = 100;
		numero2 = 50;
		soma 	= numero1+numero2;
		
		System.out.println("A soma de "+
			numero1 + " e " + numero2 + " é: "+
			soma		
		);
		
		//Double
		pay1 	= 1500.58;
		pay2 	= 50.89;
		paySum	= pay1+pay2;
		System.out.println("A soma dos salários R$"+
				pay1 + " e R$" + pay2 + " é: R$"+
			paySum		
		);
		
		
		
	}
}
