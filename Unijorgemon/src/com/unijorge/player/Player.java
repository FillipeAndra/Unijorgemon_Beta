package com.unijorge.player;
import com.unijorge.pokemon.Pokemon;
import java.util.List;
import java.util.ArrayList;

public class Player {
	private String nome;
	private ArrayList<Pokemon> pokemons = new ArrayList<Pokemon>();
	
	
	public Player() {
		
	}
	public Player(String nome, ArrayList<Pokemon> pokemon) {
		this.nome = nome;
		for(int i =0; i <=5; i++) {
			this.pokemons.add(pokemon.get(i));
		}
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public List<Pokemon> getPokemons() {
		return pokemons;
	}
	
	public void setPokemons(ArrayList<Pokemon> pokemon) {
		for(int i = 0; i <= 5; i++) {
			if(pokemons.get(i) == null) {
				pokemons.add(i, pokemon.get(i));
			}
		}
	}
	
	public ArrayList<String> getAtaquesPokemon(ArrayList <Pokemon> pokemon){
		ArrayList<String> nomesAtaques = new ArrayList<String>();
		for(int i = 0; i <= pokemon.size(); i++) {
			for(int j =0; j <= (pokemon.get(i).getAtaques().size()); j++) {
				nomesAtaques.add(pokemon.get(i).getAtaques().get(j).getNome());
			}
			
		}
		return nomesAtaques;
	}
	
	public ArrayList<String> getAtaquesPokemon(Pokemon pokemon){
		ArrayList<String> nomesAtaques = new ArrayList<String>();
		for(int i = 0; i <= pokemon.getAtaques().size(); i++) {
			
			nomesAtaques.add(pokemon.getAtaques().get(i).getNome());
			
		}
		return nomesAtaques;
	}
	
	public String getTypePokemonByClass(Pokemon pokemon){
		return "O tipo do pokemon é" + pokemon.getClass().getInterfaces();
	}
	
}
