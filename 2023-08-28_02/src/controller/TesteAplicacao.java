package controller;

import model.JogoDeTabuleiro;
import model.JogoDeCarta;
import model.VideoGame;

public class TesteAplicacao {
	public static void main(String[] args) {
		JogoDeTabuleiro tabuleiro = new JogoDeTabuleiro();
		tabuleiro.setNomeJogo("War");
		tabuleiro.setCategoria("Estrategia");
		tabuleiro.setFornecedor("Grow Games");
		//tabuleiro.setGenero("M");
		//tabuleiro.setPreco(100.50);
		
		System.out.println("---Jogo de Tabuleiro 01---");
		System.out.println("Nome: " + tabuleiro.getNomeJogo());
		System.out.println("Categoria: "+tabuleiro.getCategoria());
		System.out.println("Fornecedor: "+tabuleiro.getFornecedor());
		
		
		JogoDeCarta carta = new JogoDeCarta();
		carta.setNomeJogo("Baralho");
		carta.setCategoria("Diversos");
		carta.setFornecedor("Estrela");
		//carta.setGenero("M");
		//carta.setPreco(25);
		
		System.out.println("\n---Jogo de Carta 01---");
		System.out.println("Nome: " + carta.getNomeJogo());
		System.out.println("Categoria: "+carta.getCategoria());
		System.out.println("Fornecedor: "+carta.getFornecedor());
		
		VideoGame videogame = new VideoGame();
		videogame.setNomeJogo("Baralho");
		videogame.setCategoria("Diversos");
		videogame.setFornecedor("Estrela");
		
		System.out.println("\n---Jogo de vIDEO Game 01---");
		System.out.println("Nome: " + videogame.getNomeJogo());
		System.out.println("Categoria: "+videogame.getCategoria());
		System.out.println("Fornecedor: "+videogame.getFornecedor());

		
		

				
		

	}
}
