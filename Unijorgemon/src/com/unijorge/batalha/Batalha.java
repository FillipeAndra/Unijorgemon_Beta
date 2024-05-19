package com.unijorge.batalha;

import com.unijorge.pokemon.Pokemon;
import com.unijorge.player.Player;
import com.unijorge.tipos.*;

public class Batalha {
	private boolean ataque;

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

	public boolean verificarAtaque() {
		int testAtaquePlayer = (int) (Math.random() * 20 + 1);
		int testOutroPlayer = (int) (Math.random() * 20 + 1);
		if (testAtaquePlayer >= testOutroPlayer) {
			this.ataque = true;
			return true;
		} else {
			this.ataque = false;
			return false;
		}
	}

	public int aplicarDano(Player player1, Player player2, int indexAtaque) {
		int dano;
		if (this.ataque == true) {
			if (TipoPlanta.class.isAssignableFrom(player1.getPokemons().get(0).getClass())
					&& TipoAgua.class.isAssignableFrom(player2.getPokemons().get(0).getClass())) {

				dano = player1.getPokemons().get(0).getAtaques().get((indexAtaque - 1)).getDano();

				Pokemon pokemon2 = player2.getPokemons().get(0);
				pokemon2.setHp(pokemon2.getHp() - (dano + 10));
				return dano;

			} else if (TipoFogo.class.isAssignableFrom(player1.getPokemons().get(0).getClass())
					&& TipoPlanta.class.isAssignableFrom(player2.getPokemons().get(0).getClass())) {

				dano = player1.getPokemons().get(0).getAtaques().get((indexAtaque - 1)).getDano();

				Pokemon pokemon2 = player2.getPokemons().get(0);
				pokemon2.setHp(pokemon2.getHp() - (dano + 10));
				return dano;

			} else if (TipoAgua.class.isAssignableFrom(player1.getPokemons().get(0).getClass())
					&& TipoFogo.class.isAssignableFrom(player2.getPokemons().get(0).getClass())) {

				dano = player1.getPokemons().get(0).getAtaques().get((indexAtaque - 1)).getDano();

				Pokemon pokemon2 = player2.getPokemons().get(0);
				pokemon2.setHp(pokemon2.getHp() - (dano + 10));
				return dano;

			} else if (TipoFogo.class.isAssignableFrom(player1.getPokemons().get(0).getClass())
					&& TipoAgua.class.isAssignableFrom(player2.getPokemons().get(0).getClass())) {

				dano = player1.getPokemons().get(0).getAtaques().get((indexAtaque - 1)).getDano();

				Pokemon pokemon2 = player2.getPokemons().get(0);
				pokemon2.setHp(pokemon2.getHp() - (dano - 10));
				return dano;

			} else if (TipoAgua.class.isAssignableFrom(player1.getPokemons().get(0).getClass())
					&& TipoPlanta.class.isAssignableFrom(player2.getPokemons().get(0).getClass())) {

				dano = player1.getPokemons().get(0).getAtaques().get((indexAtaque - 1)).getDano();

				Pokemon pokemon2 = player2.getPokemons().get(0);
				pokemon2.setHp(pokemon2.getHp() - (dano - 10));
				return dano;

			} else if (TipoPlanta.class.isAssignableFrom(player1.getPokemons().get(0).getClass())
					&& TipoFogo.class.isAssignableFrom(player2.getPokemons().get(0).getClass())) {

				dano = player1.getPokemons().get(0).getAtaques().get((indexAtaque - 1)).getDano();

				Pokemon pokemon2 = player2.getPokemons().get(0);
				pokemon2.setHp(pokemon2.getHp() - (dano - 10));
				return dano;

			} else {
				dano = player1.getPokemons().get(0).getAtaques().get((indexAtaque - 1)).getDano();

				Pokemon pokemon2 = player2.getPokemons().get(0);
				pokemon2.setHp(pokemon2.getHp() - dano);
				return dano;
			}

		} else {
			return dano = 0;
		}

	}

	// para anunciar vitória ele verifcia se todos os pokemons de um player estão
	// caídos
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
			return null;
		}
	}
}
