package com.unijorge.arena;
import com.unijorge.player.Player;
import com.unijorge.pokemon.*;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;
import com.unijorge.batalha.Batalha;

public class Arena {
	
	public static void main(String args[]) {
		Locale.setDefault(Locale.US);
		Batalha batalha = new Batalha();
		Player player1 = new Player();
		Player player2 = new Player();
		Scanner sc = new Scanner(System.in);
		String nome;
		ArrayList<Pokemon> pokemon = new ArrayList<Pokemon>();
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
		
		for(int i = 0; i < 2; i++) {
			System.out.println("Apresente-se treinador (digite seu nome) ");
			nome = sc.next();
			
		
			for(int j = 0; j < 6; j++) {
				while(true) {
					System.out.println("Quais são seus 6 pokemons "+nome+ "? (digite o número do pokemon escolhido)"
							+ "\n 1 - Blastoise\n 2 - Blaziken \n 3 - Charizard\n 4 - Empoleon\n"
							+ " 5 - Feraligatr\n 6 - Infernape\n 7 - Meganium\n 8 - Sceptile\n"
							+ " 9 - Swampert\n 10 - Torterra\n 11 - Typhlosion\n 12 - Venusaur");
					
					int numeroPokemon = sc.nextInt();
					switch(numeroPokemon) {
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
							System.out.printf("Erro você digitou um número não opicional");
								
					}
					if(numeroPokemon <= 12 && numeroPokemon>=1) {
						break;
					}
				}
			}
			switch(i) {
				case 0:
					player1 = new Player(nome,pokemon);
					pokemon.clear();
					break;
				case 1:
					player2 = new Player(nome,pokemon);
					break;
			}	
		}
		System.out.println("Lista de pokemons de "+player1.getNome()+": ");
		for(int i = 0; i < player1.getPokemons().size(); i++) {
			System.out.println(player1.getPokemons().get(i).getNome()+" ");
		}
		System.out.println("Lista de pokemons de "+player2.getNome()+": ");
		for(int i = 0; i < player2.getPokemons().size(); i++) {
			System.out.println(player2.getPokemons().get(i).getNome()+" ");
		}
		//while (batalha.anunciarVitoria(player1, player2) == null) {
			
		//}
		sc.close();
	}
	
}
