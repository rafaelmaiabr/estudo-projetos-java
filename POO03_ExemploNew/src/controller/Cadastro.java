package controller;

import model.Usuario;

public class Cadastro {

	public static void main(String[] args) {
		
		//Instanciando Objeto
		Usuario person = new Usuario();
		
		person.nome = "Ana Paula Silva";
		person.endereco = "Av. das Américas, 3500";
		person.email = "email@dominio.com";
		
		Usuario company = new Usuario();
		
		company.nome = "Empresa dos Fundos";
		company.endereco = "Rua da frente, 22";
		company.email = "empresa@exemplo.com";

	}

}
