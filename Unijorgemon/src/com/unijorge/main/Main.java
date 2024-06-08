package com.unijorge.main;

import com.unijorge.player.Player;
import com.unijorge.pokemon.*;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;
import com.unijorge.batalha.Batalha;
//import com.unijorge.arena.Arena;

public class Main {

	public static void main(String args[]) {
		Locale.setDefault(Locale.US);
		Batalha batalha = new Batalha();
		Player player1 = new Player();
		Player player2 = new Player();
		Scanner sc = new Scanner(System.in);
		String nome;
		boolean controleValido;
		ArrayList<Pokemon> pokemon = new ArrayList<Pokemon>();
		ArrayList<Integer> numeroPokemonControle = new ArrayList<Integer>();
		int numeroPokemon;
		
		controleValido = false;
		for (int i = 0; i < 2; i++) {
			System.out.println("Apresente-se treinador (digite seu nome) ");
			nome = sc.next();
			if(i == 1 && player1.getNome().equals(nome)){
				nome = nome + "_2";
			}
			for (int j = 0; j < 6; j++) {
				boolean inputValido = false;
				while (true) {
					
					
					
					numeroPokemon = 0;
					System.out.println("Quais são seus 6 pokemons " + nome + "? (digite o número do pokemon escolhido)"
							+ "\n 1 - Blastoise\n 2 - Blaziken \n 3 - Charizard\n 4 - Empoleon\n"
							+ " 5 - Feraligatr\n 6 - Infernape\n 7 - Meganium\n 8 - Sceptile\n"
							+ " 9 - Swampert\n 10 - Torterra\n 11 - Typhlosion\n 12 - Venusaur");

					try {
						
						numeroPokemon = sc.nextInt();
						controleValido = true;
					} 
					catch (InputMismatchException e) {				
				
						controleValido = false;
						
						sc.next();
					}
					
					if (numeroPokemon < 1 || numeroPokemon > 12) {
                        System.out.printf("\nErro! Um valor inválido foi digitado. "
                                + "Por favor, digite um dos valores listados\n\n");
                        controleValido = false;
                    }
					
					if (numeroPokemonControle.contains(numeroPokemon) == false) {
						numeroPokemonControle.add(numeroPokemon);
						switch (numeroPokemon) {
						case 1:
							pokemon.add(new Blastoise());
							break;
						case 2:
							pokemon.add(new Blaziken());
							break;
						case 3:
							pokemon.add(new Charizard());
							break;
						case 4:
							pokemon.add(new Empoleon());
							break;
						case 5:
							pokemon.add(new Feraligatr());
							break;
						case 6:
							pokemon.add(new Infernape());
							break;
						case 7:
							pokemon.add(new Meganium());
							break;
						case 8:
							pokemon.add(new Sceptile());
							break;
						case 9:
							pokemon.add(new Swampert());
							break;
						case 10:
							pokemon.add(new Torterra());
							break;
						case 11:
							pokemon.add(new Typhlosion());
							break;
						case 12:
							pokemon.add(new Venusaur());
							break;
						/*default:
							System.out.printf("\nErro! Um valor inválido foi digitado. "
									+ "Por favor, digite um dos valores listados\n\n");
						*/
						}
						if (numeroPokemon <= 12 && numeroPokemon >= 1) {
							break;
						}
					}
					if (numeroPokemonControle.contains(numeroPokemon) == true && controleValido == true) {

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
		
		/*teste de armazenamento dos ataques
		System.out.println(primeiro.getPokemons()
						.get(0).getAtaques());
		System.out.println(primeiro.getPokemons()
				.get(0).getNome());
		*/
		/* teste de impressão
		System.out.println("Lista de pokemons de " + player1.getNome() + ": ");
		System.out.println(player1.getPokemons());

		System.out.println("Lista de pokemons de " + player2.getNome() + ": ");
		System.out.println(player2.getPokemons());
		*/
		
		
		/* teste de criação de pokemon e anunciar vitória
		System.out.println(batalha.anunciarVitoria(player1, player2));
		System.out.println(player1.getPokemons().get(0).getHp());
		*/

		
		while (batalha.anunciarVitoria(player1, player2) == null) {
			int escolhaAcao;
			if(primeiro.getPokemons().get(0).getHp() == 0) {
				
				int escolhaPokemon;
				System.out.println(primeiro.getNome()+", seu pokemon atual é "
						+ primeiro.getPokemons().get(0).getNome()+
						". E ele não aguenta mais batalhar "
						+ "para qual pokemon Você quer trocar?");
				
				System.out.println(batalha.escolhaPokemonTroca(primeiro));
				
				escolhaPokemon = sc.nextInt();
				
				batalha.trocarPokemon(escolhaPokemon, primeiro);
				
				
			} else {
				System.out.println(primeiro.getNome() + ", o que você escolhe?");
				
				System.out.println("1) escolher ataque do pokemon\n"
						+ "2)trocar de pokemon \n" 
						+ "0) encerrar a batalha");
				
				escolhaAcao = sc.nextInt();
				if(escolhaAcao == 1) {
					int escolhaAtaque;
					System.out.println("Qual o ataque "+primeiro.getPokemons()
					.get(0).getNome() +" vai fazer?");
					
					System.out.println("1) "+primeiro.getPokemons()
							.get(0).getAtaques().get(0).getNome());
					System.out.println("2) "+primeiro.getPokemons()
							.get(0).getAtaques().get(1).getNome());
					System.out.println("3) "+primeiro.getPokemons()
							.get(0).getAtaques().get(2).getNome());
					System.out.println("4) "+primeiro.getPokemons()
							.get(0).getAtaques().get(3).getNome());
					
					escolhaAtaque = sc.nextInt()-1;
				
					boolean verificaAtaque = batalha.verificarAtaque();
					if(verificaAtaque == true) {
						int dano = batalha.aplicarDano(primeiro, segundo, escolhaAtaque, verificaAtaque);
						System.out.println("O "+primeiro.getPokemons().get(0).getNome()+ " de "+
						primeiro.getNome()+" causou "+
						dano+
						" de dano ao "+ segundo.getPokemons().get(0).getNome()+" de "+
						segundo.getNome()+" que está agora com "+segundo.getPokemons().get(0).getHp()+
						" de vida devido ao ataque "+ primeiro.getPokemons().get(0).
						getAtaques().get(escolhaAtaque).getNome());
					}else if(verificaAtaque == false){
						System.out.println("seu pokemon errou, "+primeiro.getNome());
					}
				}else if(escolhaAcao == 2) {
					int escolhaPokemon;
					System.out.println(primeiro.getNome()+", seu pokemon atual é "
							+ primeiro.getPokemons().get(0).getNome()+
							". Para qual pokemon Você quer trocar?");
					
					System.out.println(batalha.escolhaPokemonTroca(primeiro));
					
					escolhaPokemon = sc.nextInt();
					
					batalha.trocarPokemon(escolhaPokemon, primeiro);
				} else if (escolhaAcao == 0) {
					break;
				}
			}
			
			Player primeiroViraSegundo = primeiro;
			primeiro = segundo;
			segundo = primeiroViraSegundo;
		}
		
		System.out.println(batalha.anunciarVitoria(player1, player2));
		sc.close();
	}

}
