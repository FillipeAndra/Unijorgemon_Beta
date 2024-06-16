/*declaração do pacote*/
package com.unijorge.player;

/*importação da classe pokemon*/
import com.unijorge.pokemon.Pokemon;

/*importação da classe lista*/
import java.util.List;

/*importação da classe arraylist*/
import java.util.ArrayList;

/*criação da classe player*/
public class Player {

	/* declaração dos atributos */
	private String nome;
	private ArrayList<Pokemon> pokemons = new ArrayList<Pokemon>();

	/* método construtor player vazio */
	public Player() {

	}

	/* método construtor player comparãmetros nome, e array list de pokemons */
	public Player(String nome, ArrayList<Pokemon> pokemon) {
		this.nome = nome;
		for (int i = 0; i <= 5; i++) {
			this.pokemons.add(pokemon.get(i));
		}
	}

	/* método de retorno getNome */
	public String getNome() {
		return nome;
	}

	/* método setNome */
	public void setNome(String nome) {
		this.nome = nome;
	}

	/* método de retorno getPokemons */
	public List<Pokemon> getPokemons() {
		return pokemons;
	}

	/* método setPokemons */
	public void setPokemons(ArrayList<Pokemon> pokemon) {
		for (int i = 0; i <= 5; i++) {
			if (pokemons.get(i) == null) {
				pokemons.add(i, pokemon.get(i));
			}
		}
	}

	/* método de retorno getAtaquesPokemon */
	public ArrayList<String> getAtaquesPokemon(ArrayList<Pokemon> pokemon) {
		ArrayList<String> nomesAtaques = new ArrayList<String>();
		for (int i = 0; i <= pokemon.size(); i++) {
			for (int j = 0; j <= (pokemon.get(i).getAtaques().size()); j++) {
				nomesAtaques.add(pokemon.get(i).getAtaques().get(j).getNome());
			}
		}
		return nomesAtaques;
	}
	
	/*método de retorno getAtaquesPokemon*/
	public ArrayList<String> getAtaquesPokemon(Pokemon pokemon) {
		ArrayList<String> nomesAtaques = new ArrayList<String>();
		for (int i = 0; i <= pokemon.getAtaques().size(); i++) {

			nomesAtaques.add(pokemon.getAtaques().get(i).getNome());
		}
		return nomesAtaques;
	}
	
	/*método de retorno getTypePokemonByClass*/
	public String getTypePokemonByClass(Pokemon pokemon) {
		return "O tipo do pokemon é" + pokemon.getClass().getInterfaces();
	}

}
