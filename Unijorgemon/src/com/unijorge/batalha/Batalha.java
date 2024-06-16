/*delcaração do pacote*/
package com.unijorge.batalha;

/*importação da classe pokemon*/
import com.unijorge.pokemon.Pokemon;

/*importação da classe player*/
import com.unijorge.player.Player;

/*importação de todos os tipos*/
import com.unijorge.tipos.*;

/*declaração da classe batalha*/
public class Batalha {

	/*metodo para determinar quem começa a batalha*/
	public Player quemComeca(Player player1, Player player2) {
		while (true) {
			int testePlayer1 = (int) (Math.random() * 20 + 1);
			int testePlayer2 = (int) (Math.random() * 20 + 1);

			if (testePlayer1 > testePlayer2) {
				return player1;
			} else if (testePlayer2 > testePlayer1) {
				return player2;
			}
		}
	}
	
	/*método de verificar se o ataque acerta com menor chance de esquiva para o atacado*/
	public boolean verificarAtaque() {
		int testAtaquePlayer = (int) (Math.random() * 4 + 1);
		int testOutroPlayer = (int) (Math.random() * 2 + 1);
		if (testAtaquePlayer >= testOutroPlayer) {
			return true;
		} else {
			return false;
		}
	}
	
	/*método para aplicar dano usando a tipagem dos pokemons*/
	public int aplicarDano(Player player1, Player player2, int indexAtaque, boolean ataque) {
		int dano;
		if (ataque == true) {
			if (TipoPlanta.class.isAssignableFrom(player1.getPokemons().get(0).getAtaques()
					.get(indexAtaque).getClass())
					&& TipoAgua.class.isAssignableFrom(player2.getPokemons().get(0).getClass())) {

				dano = ((player1.getPokemons().get(0).getAtaques().get((indexAtaque )).getDano())+10);

				Pokemon pokemon2 = player2.getPokemons().get(0);
				pokemon2.setHp(pokemon2.getHp() - dano);
				return dano;

			} else if (TipoFogo.class.isAssignableFrom(player1.getPokemons().get(0).getAtaques()
					.get(indexAtaque).getClass())
					&& TipoPlanta.class.isAssignableFrom(player2.getPokemons().get(0).getClass())) {

				dano = (player1.getPokemons().get(0).getAtaques().get((indexAtaque )).getDano())+10;

				Pokemon pokemon2 = player2.getPokemons().get(0);
				pokemon2.setHp(pokemon2.getHp() - dano);
				return dano;

			} else if (TipoAgua.class.isAssignableFrom(player1.getPokemons().get(0).getAtaques()
					.get(indexAtaque).getClass())
					&& TipoFogo.class.isAssignableFrom(player2.getPokemons().get(0).getClass())) {

				dano = (player1.getPokemons().get(0).getAtaques().get((indexAtaque )).getDano())+10;

				Pokemon pokemon2 = player2.getPokemons().get(0);
				pokemon2.setHp(pokemon2.getHp() - dano);
				return dano;

			} else if (TipoFogo.class.isAssignableFrom(player1.getPokemons().get(0).getAtaques()
					.get(indexAtaque).getClass())
					&& TipoAgua.class.isAssignableFrom(player2.getPokemons().get(0).getClass())) {

				dano = (player1.getPokemons().get(0).getAtaques().get((indexAtaque )).getDano())-10;

				Pokemon pokemon2 = player2.getPokemons().get(0);
				pokemon2.setHp(pokemon2.getHp() - dano);
				return dano;

			} else if (TipoAgua.class.isAssignableFrom(player1.getPokemons().get(0).getAtaques()
					.get(indexAtaque).getClass())
					&& TipoPlanta.class.isAssignableFrom(player2.getPokemons().get(0).getClass())) {

				dano = (player1.getPokemons().get(0).getAtaques().get((indexAtaque )).getDano())-10;

				Pokemon pokemon2 = player2.getPokemons().get(0);
				pokemon2.setHp(pokemon2.getHp() - dano);
				return dano;

			} else if (TipoPlanta.class.isAssignableFrom(player1.getPokemons().get(0).getAtaques()
					.get(indexAtaque).getClass())
					&& TipoFogo.class.isAssignableFrom(player2.getPokemons().get(0).getClass())) {

				dano = (player1.getPokemons().get(0).getAtaques().get((indexAtaque )).getDano())-10;

				Pokemon pokemon2 = player2.getPokemons().get(0);
				pokemon2.setHp(pokemon2.getHp() - dano );
				return dano;

			} else {
				dano = (player1.getPokemons().get(0).getAtaques().get((indexAtaque )).getDano());

				Pokemon pokemon2 = player2.getPokemons().get(0);
				pokemon2.setHp(pokemon2.getHp() - dano);
				return dano;
			}

		} else {
			return dano = 0;
		}

	}
	/*para anunciar vitória ele verifcia se todos os pokemons de um player estão
	* caídos ou caso eles desistirem da luta*/
	public String anunciarVitoria(Player player1, Player player2) {
		int contDerrota1 = 0;
		int contDerrota2 = 0;
		for (int i = 0; i < player1.getPokemons().size(); i++) {
			if (player1.getPokemons().get(i).getHp() == 0) {
				contDerrota1 += 1;
			}
			if (player2.getPokemons().get(i).getHp() == 0) {
				contDerrota2 += 1;
			}
		}
		if (contDerrota1 == player1.getPokemons().size()) {
			return "O campeão desse duelo pokemon foi " + player2.getNome();
		} else if (contDerrota2 == player2.getPokemons().size()) {
			return "O campeão desse duelo pokemon foi " + player1.getNome();
		} else {
			return "Os jogadores desistiram da luta";
		}
	}
	
	/*método para demonstrar os pokemons disponíveis para troca*/
	public String escolhaPokemonTroca(Player primeiro) {
		String texto = "";
		for(int i = 1; i <primeiro.getPokemons().size(); i++) {
			if(primeiro.getPokemons().get(i).getHp() > 0 ) {
				String linha = i +")"+ primeiro.getPokemons().get(i).getNome()+"\n";
				texto = texto+linha;
			}
		}
	
		return texto;
	}
	
	/*método para efetivar a troca de pokemons*/
	public String trocarPokemon(int i, Player primeiro) {
		String texto = null;
		if(i>=1 && i<=5) {
			if(primeiro.getPokemons().get(i).getHp()> 0) {
				switch(i) {
				case 1: 
					Pokemon pokemonSelecionado1 = primeiro.getPokemons().get(i);
					primeiro.getPokemons().remove(i);
					primeiro.getPokemons().add(0,pokemonSelecionado1);
					break;
				case 2: 
					Pokemon pokemonSelecionado2 = primeiro.getPokemons().get(i);
					primeiro.getPokemons().remove(i);
					primeiro.getPokemons().add(0,pokemonSelecionado2);
					break;
				case 3:
					Pokemon pokemonSelecionado3 = primeiro.getPokemons().get(i);
					primeiro.getPokemons().remove(i);
					primeiro.getPokemons().add(0,pokemonSelecionado3);
					break;
				case 4:
					Pokemon pokemonSelecionado4 = primeiro.getPokemons().get(i);
					primeiro.getPokemons().remove(i);
					primeiro.getPokemons().add(0,pokemonSelecionado4);
					break;
				case 5: 
					Pokemon pokemonSelecionado5 = primeiro.getPokemons().get(i);
					primeiro.getPokemons().remove(i);
					primeiro.getPokemons().add(0,pokemonSelecionado5);
					break;
				default:
					texto = "Por favor digite um número válido!";
				}
			}
		}else {
			texto = "Por favor digite um número válido!";
		}
		
		return texto;
	}
}
