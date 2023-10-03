package model;

import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		PessoaFisica model = new PessoaFisica();
		
		while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Adicionar PF");
            System.out.println("2. Atualizar PF");
            System.out.println("3. Remover PF");
            System.out.println("4. Listar PF");
            System.out.println("5. Buscar PF por CPF");
            System.out.println("6. Sair");
            System.out.print("Escolha uma opção: ");
            
            int escolha = scanner.nextInt();
            scanner.nextLine();
            
            switch (escolha) {
            case 1:
            	// ADD Pessoa
				System.out.print("CPF: ");
				int cpf = scanner.nextInt();
				scanner.nextLine();
				System.out.print("Nome: ");
				String nome = scanner.nextLine();
            case 2:
            	// UPD Pessoa
            	
            }
		}
	}
}
