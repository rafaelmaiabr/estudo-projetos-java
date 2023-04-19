package controller;

public class EscopoDeVariavel {
	
	public static int x = 1; //variavel global
	
	public static void main(String[] args) {
		int x = 5;
		System.out.println("x no início de main() é: "+x);
		
		System.out.println("### Chama Metodo A ###");
		metodoA();
		
		System.out.println("### Chama Metodo B ###");
		metodoB();
		
		System.out.println("### Chama Novamente o Metodo A ###");
		metodoA();

		System.out.println("### Chama Novamente o Metodo B ###");
		metodoB();
	}
	
	public static void metodoA() {
		int x = 25;
		System.out.println("Variavel local x ao entrar no metodoA é: " + x);
		x = x +1;
		System.out.println("Variavel local x ao sair no metodoA é: " + x);

	}

	public static void metodoB() {
		System.out.println("Variavel local x ao entrar no metodoB é: " + x);
		x = x * 10;
		System.out.println("Variavel local x ao sair no metodoB é: " + x);
		
	}
	
}
