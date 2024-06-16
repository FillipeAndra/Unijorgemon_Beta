/*declaração de pacote*/
package com.unijorge.main;

/*importação da classe player*/
import com.unijorge.player.Player;

/*importação de todos os pokemons*/
import com.unijorge.pokemon.*;

/*importação do arraylist*/
import java.util.ArrayList;

/*importação do InputMismatchException*/
import java.util.InputMismatchException;

/*importação do locale*/
import java.util.Locale;

/*importação da classe scanner*/
import java.util.Scanner;

/*importação da classe batalha*/
import com.unijorge.batalha.Batalha;


public class Main {

	public static void main(String args[]) {
		
		/*para aceitar número real com ponto invés de vírgula*/
		Locale.setDefault(Locale.US);
		
		/*criação do objeto batalha*/
		Batalha batalha = new Batalha();
		
		/*criação dos objetos dos players*/
		Player player1 = new Player();
		Player player2 = new Player();
		
		/*criação do obejto scanner*/
		Scanner sc = new Scanner(System.in);
		
		/*variavel nome*/
		String nome;
		
		/*boolean para controle do try, catch*/
		boolean controleValido = false;
		
		/*ArrayList para  armazenamento das seleções do pokemons*/
		ArrayList<Pokemon> pokemon = new ArrayList<Pokemon>();
		
		/*ArrayList de números para teste de entrada de pokemons*/
		ArrayList<Integer> numeroPokemonControle = new ArrayList<Integer>();
		
		/*número de escolha de pokemon*/
		int numeroPokemon;
		
		/*loop para criação de players*/
		for (int i = 0; i < 2; i++) {
			
			/*cadastro de nome de player*/
			System.out.println("Apresente-se treinador (digite seu nome) ");
			nome = sc.next();
			
			/*em caso de nome repitido ele modifica para não ficar igual*/
			if (i == 1 && player1.getNome().equals(nome)) {
				nome = nome + "_2";
			}
			
			/*cadastro de pokemons na lista de pokemons*/
			for (int j = 0; j < 6; j++) {
				boolean inputValido = false;
				while (true) {

					numeroPokemon = 0;
					System.out.println("Quais são seus 6 pokemons " + nome + "? (digite o número do pokemon escolhido)"
							+ "\n 1 - Blastoise\n 2 - Blaziken \n 3 - Charizard\n 4 - Empoleon\n"
							+ " 5 - Feraligatr\n 6 - Infernape\n 7 - Meganium\n 8 - Sceptile\n"
							+ " 9 - Swampert\n 10 - Torterra\n 11 - Typhlosion\n 12 - Venusaur");
					
					/*try catch para em caso de letra ou outros tipos diferentes de inteiro*/
					try {

						numeroPokemon = sc.nextInt();
						controleValido = true;
					} catch (InputMismatchException e) {

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
			/*cadastro de players*/
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
		
		/*decisão de quem joga primeiro*/
		Player primeiro = batalha.quemComeca(player1, player2);
		Player segundo;
		if (primeiro == player1) {
			segundo = player2;
		} else {
			segundo = player1;
		}

		/*loop para a batalha pokemon*/
		while (batalha.anunciarVitoria(player1, player2).equals("Os jogadores desistiram da luta")) {
			int escolhaAcao = 0;
			
			/*loop de troca de pokemon forçada quando o selecionado foi derrotado*/
			while (primeiro.getPokemons().get(0).getHp() == 0) {

				int escolhaPokemon = 0;
				System.out
						.println(primeiro.getNome() + ", seu pokemon atual é " + primeiro.getPokemons().get(0).getNome()
								+ ". E ele não aguenta mais batalhar " + "para qual pokemon Você quer trocar?");

				System.out.println(batalha.escolhaPokemonTroca(primeiro));
				
				/*try catch para validação de não quebrar ao receber valores não inteiros
				 * e escolha de outro pokemon*/
				try {

					escolhaPokemon = sc.nextInt();

					int contPokeVivoMax = 0;
					int contPokeVivoMin = 0;
					for (int i = 0; i < primeiro.getPokemons().size(); i++) {

						if (primeiro.getPokemons().get(i).getHp() > 0) {

								contPokeVivoMax = i;

							if (contPokeVivoMin == 0) {

								contPokeVivoMin = i;
							}

						}
					}
					
					if (escolhaPokemon < contPokeVivoMin || escolhaPokemon > contPokeVivoMax 
							|| primeiro.getPokemons().get(escolhaPokemon).getHp() == 0)   {
						System.out.printf("\nErro! Um valor inválido foi digitado. "
								+ "Por favor, digite um dos valores listados\n\n");
					} else {

						batalha.trocarPokemon(escolhaPokemon, primeiro);
						break;

					}

				} catch (InputMismatchException e) {

					System.out.printf("\nErro! Um valor inválido foi digitado. "
							+ "Por favor, digite um dos valores listados\n\n");

					sc.next();

				}

			}
			
			/*realização da luta e suas escolhas com try catch para validação das escolhas*/
			while (primeiro.getPokemons().get(0).getHp() != 0) {

				while (true) {
					System.out.println(primeiro.getNome() + ", o que você escolhe?");

					System.out.println(
							"1) escolher ataque do pokemon\n" + "2)trocar de pokemon \n" + "0) encerrar a batalha");

					try {

						escolhaAcao = sc.nextInt();

						if (escolhaAcao < 0 || escolhaAcao > 2) {
							System.out.printf("\nErro! Um valor inválido foi digitado. "
									+ "Por favor, digite um dos valores listados\n\n");
						} else {

							break;
						}

					} catch (InputMismatchException e) {

						System.out.printf("\nErro! Um valor inválido foi digitado. "
								+ "Por favor, digite um dos valores listados\n\n");

						sc.next();

					}
					;

				}
				
				/*escolha de ataques com try catch*/
				if (escolhaAcao == 1) {
					int escolhaAtaque = 0;
					while (true) {
						System.out.println("Qual o ataque " + primeiro.getPokemons().get(0).getNome() + " vai fazer?");

						System.out.println("1) " + primeiro.getPokemons().get(0).getAtaques().get(0).getNome());
						System.out.println("2) " + primeiro.getPokemons().get(0).getAtaques().get(1).getNome());
						System.out.println("3) " + primeiro.getPokemons().get(0).getAtaques().get(2).getNome());
						System.out.println("4) " + primeiro.getPokemons().get(0).getAtaques().get(3).getNome());

						try {

							escolhaAtaque = sc.nextInt() - 1;

							if (escolhaAtaque < 0 || escolhaAtaque > 3) {
								System.out.printf("\nErro! Um valor inválido foi digitado. "
										+ "Por favor, digite um dos valores listados\n\n");
							} else {

								boolean verificaAtaque = batalha.verificarAtaque();
								if (verificaAtaque == true) {
									int dano = batalha.aplicarDano(primeiro, segundo, escolhaAtaque, verificaAtaque);
									System.out.println("O " + primeiro.getPokemons().get(0).getNome() + " de "
											+ primeiro.getNome() + " causou " + dano + " de dano ao "
											+ segundo.getPokemons().get(0).getNome() + " de " + segundo.getNome()
											+ " que está agora com " + segundo.getPokemons().get(0).getHp()
											+ " de vida devido ao ataque "
											+ primeiro.getPokemons().get(0).getAtaques().get(escolhaAtaque).getNome());
								} else if (verificaAtaque == false) {
									System.out.println("seu pokemon errou, " + primeiro.getNome());
								}
								break;
							}

						} catch (InputMismatchException e) {

							System.out.printf("\nErro! Um valor inválido foi digitado. "
									+ "Por favor, digite um dos valores listados\n\n");

							sc.next();

						}

					}
					
				/*escolha de troca de pokemon com try catch para validação de valores inteiros*/
				} else if (escolhaAcao == 2) {

					int escolhaPokemon = 0;

					while (true) {
						System.out.println(primeiro.getNome() + ", seu pokemon atual é "
								+ primeiro.getPokemons().get(0).getNome() + ". Para qual pokemon Você quer trocar?");

						System.out.println(batalha.escolhaPokemonTroca(primeiro));

						try {

							escolhaPokemon = sc.nextInt();

							int contPokeVivoMax = 0;
							int contPokeVivoMin = 0;
							for (int i = 0; i < primeiro.getPokemons().size(); i++) {

								if (primeiro.getPokemons().get(i).getHp() > 0) {

										contPokeVivoMax = i;

									if (contPokeVivoMin == 0) {

										contPokeVivoMin = i;
									}

								}
							}
							
							if (escolhaPokemon < contPokeVivoMin || escolhaPokemon > contPokeVivoMax 
									|| primeiro.getPokemons().get(escolhaPokemon).getHp() == 0)   {
								System.out.printf("\nErro! Um valor inválido foi digitado. "
										+ "Por favor, digite um dos valores listados\n\n");
							} else {

								batalha.trocarPokemon(escolhaPokemon, primeiro);
								break;

							}

						} catch (InputMismatchException e) {

							System.out.printf("\nErro! Um valor inválido foi digitado. "
									+ "Por favor, digite um dos valores listados\n\n");

							sc.next();

						}

					}
					
				/*quebra do loop das escolhas em caso de desistência*/
				} else if (escolhaAcao == 0) {
					break;
				}
				
				/*mudança do player que fará as escolhas*/
				Player primeiroViraSegundo = primeiro;
				primeiro = segundo;
				segundo = primeiroViraSegundo;
			}
			/*para para o loop da luta inteiria*/
			if (escolhaAcao == 0) {
				break;
			}

		}
		
		/*anunciar resultado da vitoria*/
		System.out.println(batalha.anunciarVitoria(player1, player2));
		sc.close();
	}

}
