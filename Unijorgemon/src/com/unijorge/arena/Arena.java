package com.unijorge.arena;
import com.unijorge.player.Player;
import com.unijorge.pokemon.Pokemon;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;
import com.unijorge.batalha.Batalha;

public class Arena {
	
	public static void main(String args[]) {
		Locale.setDefault(Locale.US);
		Player player2;
		Batalha batalha;
		Scanner sc = new Scanner(System.in);
		System.out.println("Apresente-se primeiro treinador (digite seu nome) ");
		String nome = sc.nextLine();
		for(int i = 0; i < 6; i++) {
			System.out.println("Quais são seus 6 pokemons "+nome+ " ?");
			ArrayList<Pokemon> pokemon = new ArrayList<Pokemon>();
		}
		Player player1 = new Player();
		
	}
	
}
