package controller;

import model.Funcionario;
import model.Gerente;
import model.Vendedor;

public class Cadastro {
	public static void main(String[] args) {
		Funcionario joao = new Funcionario();
		joao.setMatricula(222);
		joao.setSalario(20);
		
		System.out.println("======= Funcionario Joao =======");
		System.out.println("Matricula: "+joao.getMatricula());
		System.out.println("Salario: "+joao.getSalario());
		
		Gerente maria = new Gerente();
		maria.setSetor("Pessoa Fisica");
		
		System.out.println("\n======= Gerente Maria =======");
		System.out.println("Setor: " + maria.getSetor());
		
		Vendedor pedro = new Vendedor();
		pedro.setQuantidadeVenda(22);
		pedro.setValorVendas(15);
		
		System.out.println("\n======= Vendedor Pedro =======");
		System.out.println("Quantidade de Vendas: " + pedro.getQuantidadeVenda());
		System.out.println("Valor das vendas: " + pedro.getValorVendas());
		
		
		
		
	}
}
