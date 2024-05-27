package com.unijorge.main;

import com.unijorge.player.Player;
import com.unijorge.pokemon.*;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;
import com.unijorge.batalha.Batalha;


public class Main {

	public static void main(String args[]) {
		Locale.setDefault(Locale.US);
		Batalha batalha = new Batalha();
		Player player1 = new Player();
		Player player2 = new Player();
		Scanner sc = new Scanner(System.in);
		String nome;
		ArrayList<Pokemon> pokemon = new ArrayList<Pokemon>();
		ArrayList<Integer> numeroPokemonControle = new ArrayList<Integer>();
		Blastoise p1 = new Blastoise();
		Blaziken p2 = new Blaziken();
		Charizard p3 = new Charizard();
		Empoleon p4 = new Empoleon();
		Feraligatr p5 = new Feraligatr();
		Infernape p6 = new Infernape();
		Meganium p7 = new Meganium();
		Sceptile p8 = new Sceptile();
		Swampert p9 = new Swampert();
		Torterra p10 = new Torterra();
		Typhlosion p11 = new Typhlosion();
		Venusaur p12 = new Venusaur();
		int numeroPokemon;

		for (int i = 0; i < 2; i++) {
			System.out.println("Apresente-se treinador (digite seu nome) ");
			nome = sc.next();

			for (int j = 0; j < 6; j++) {

				while (true) {

					System.out.println("Quais são seus 6 pokemons " + nome + "? (digite o número do pokemon escolhido)"
							+ "\n 1 - Blastoise\n 2 - Blaziken \n 3 - Charizard\n 4 - Empoleon\n"
							+ " 5 - Feraligatr\n 6 - Infernape\n 7 - Meganium\n 8 - Sceptile\n"
							+ " 9 - Swampert\n 10 - Torterra\n 11 - Typhlosion\n 12 - Venusaur");

					numeroPokemon = sc.nextInt();

					if (numeroPokemonControle.contains(numeroPokemon) == false) {
						numeroPokemonControle.add(numeroPokemon);
						switch (numeroPokemon) {
						case 1:
							pokemon.add(p1);
							break;
						case 2:
							pokemon.add(p2);
							break;
						case 3:
							pokemon.add(p3);
							break;
						case 4:
							pokemon.add(p4);
							break;
						case 5:
							pokemon.add(p5);
							break;
						case 6:
							pokemon.add(p6);
							break;
						case 7:
							pokemon.add(p7);
							break;
						case 8:
							pokemon.add(p8);
							break;
						case 9:
							pokemon.add(p9);
							break;
						case 10:
							pokemon.add(p10);
							break;
						case 11:
							pokemon.add(p11);
							break;
						case 12:
							pokemon.add(p12);
							break;
						default:
							System.out.printf("Erro! Um valor inválido foi digitado. "
									+ "Por favor, digite um dos valores listados");

						}
						if (numeroPokemon <= 12 && numeroPokemon >= 1) {
							break;
						}
					}
					if (numeroPokemonControle.contains(numeroPokemon) == true) {

						System.out.println("Erro! Não é possível inserir o mesmo Pokémon duas vezes!");
					}

				}
			}
			switch (i) {
			case 0:
				player1 = new Player(nome, pokemon);
				pokemon.clear();
				numeroPokemonControle.clear();

				break;
			case 1:
				player2 = new Player(nome, pokemon);
				break;
			}
		}

		Player primeiro = batalha.quemComeca(player1, player2);
		Player segundo;
		if(primeiro == player1) {
			segundo = player2;
		}else {
			segundo = player1;
		}
		
		/* teste de impressão
		System.out.println("Lista de pokemons de " + player1.getNome() + ": ");
		System.out.println(player1.getPokemons());

		System.out.println("Lista de pokemons de " + player2.getNome() + ": ");
		System.out.println(player2.getPokemons());
		*/

		while (batalha.anunciarVitoria(player1, player2) == null) {
			int escolhaAcao;
			System.out.println(primeiro.getNome() + ", o que você escolhe?");
			
			System.out.println("1) escolher ataque do pokemon\n"
					+ "2)trocar de pokemon");
			
			escolhaAcao = sc.nextInt();
			if(escolhaAcao == 1) {
				int escolhaAtaque;
				System.out.println("Qual o ataque"+primeiro.getPokemons()
				.get(0).getNome() +" vai fazer?");
				
				System.out.println("1) "+primeiro.getPokemons()
						.get(0).getAtaques().get(0));
				System.out.println("2) "+primeiro.getPokemons()
						.get(0).getAtaques().get(1));
				System.out.println("3) "+primeiro.getPokemons()
						.get(0).getAtaques().get(2));
				System.out.println("4) "+primeiro.getPokemons()
						.get(0).getAtaques().get(3));
				
				escolhaAtaque = sc.nextInt();
			
				boolean verificaAtaque = batalha.verificarAtaque();
				if(verificaAtaque = true) {
					batalha.aplicarDano(primeiro, segundo, escolhaAtaque);
				}else {
					System.out.println("Você errou, "+primeiro.getNome());
				}
			}else if(escolhaAcao == 2) {
				int escolhaPokemon;
				System.out.println(primeiro.getNome()+", seu pokemon atual é"
						+ primeiro.getPokemons().get(0).getNome()+
						". Para qual pokemon Você quer trocar?");
				
				System.out.println("1) "+primeiro.getPokemons().get(1).getNome());
				System.out.println("2) "+primeiro.getPokemons().get(2).getNome());
				System.out.println("3) "+primeiro.getPokemons().get(3).getNome());
				System.out.println("4) "+primeiro.getPokemons().get(4).getNome());
				System.out.println("5) "+primeiro.getPokemons().get(5).getNome());
				
				escolhaPokemon = sc.nextInt();
				
				switch(escolhaPokemon) {
				case 1: 
					Pokemon pokemonSelecionado1 = primeiro.getPokemons().get(escolhaPokemon);
					primeiro.getPokemons().remove(escolhaPokemon);
					primeiro.getPokemons().add(0,pokemonSelecionado1);
					break;
				case 2: 
					Pokemon pokemonSelecionado2 = primeiro.getPokemons().get(escolhaPokemon);
					primeiro.getPokemons().remove(escolhaPokemon);
					primeiro.getPokemons().add(0,pokemonSelecionado2);
					break;
				case 3:
					Pokemon pokemonSelecionado3 = primeiro.getPokemons().get(escolhaPokemon);
					primeiro.getPokemons().remove(escolhaPokemon);
					primeiro.getPokemons().add(0,pokemonSelecionado3);
					break;
				case 4:
					Pokemon pokemonSelecionado4 = primeiro.getPokemons().get(escolhaPokemon);
					primeiro.getPokemons().remove(escolhaPokemon);
					primeiro.getPokemons().add(0,pokemonSelecionado4);
					break;
				case 5: 
					Pokemon pokemonSelecionado5 = primeiro.getPokemons().get(escolhaPokemon);
					primeiro.getPokemons().remove(escolhaPokemon);
					primeiro.getPokemons().add(0,pokemonSelecionado5);
					break;
				default:
					System.out.println("por favor digite um número válido!");
				}
			}
			Player primeiroViraSegundo = primeiro;
			primeiro = segundo;
			segundo = primeiroViraSegundo;
		}

		sc.close();
	}

}
