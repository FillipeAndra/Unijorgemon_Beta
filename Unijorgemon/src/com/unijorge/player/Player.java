package com.unijorge.player;
import com.unijorge.pokemon.Pokemon;
import java.util.List;
import java.util.ArrayList;

public class Player {
	private String nome;
	private List<Pokemon> pokemons = new ArrayList<Pokemon>();
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public List<Pokemon> getPokemons() {
		return pokemons;
	}
	public void setPokemons(Pokemon pokemon1, Pokemon pokemon2, Pokemon pokemon3) {
		if (pokemons.isEmpty()) {
			pokemons.add(pokemon1);
			pokemons.add(pokemon2);
			pokemons.add(pokemon3);
		}
	}
	
	
}
