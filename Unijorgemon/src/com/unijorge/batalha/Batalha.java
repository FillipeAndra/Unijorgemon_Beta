package com.unijorge.batalha;
import com.unijorge.pokemon.Pokemon;
import com.unijorge.player.Player;

public class Batalha {
	private boolean ataque;
	
	
	public boolean verificarAtaque() {
		int testAtaquePlayer =(int) (Math.random()*20+1);
		int testOutroPlayer =(int) (Math.random()*20+1);
		if (testAtaquePlayer >= testOutroPlayer) {
			this.ataque =true;
			return true;
		}else {
			this.ataque = false; 
			return false;
		}
	}
	// toda vez que um pokemon é selecionado seu index na lista vira zero pois muda de posição 
	public int aplicarDano(Player player1,  Player player2,  int indexAtaque) {
		int dano;
		if(this.ataque == true) {
			dano = player1.getPokemons().get(0).getAtaques()
					.get((indexAtaque-1)).getDano();
			
			Pokemon pokemon2 = player2.getPokemons().get(0);
			pokemon2.setHp(pokemon2.getHp()-dano);
			return dano;
		}else {
			return dano = 0;
		}
		
	}
	
	public String anunciarVitoria(Player player1, Player player2) {
		int contDerrota = 0;
		for(int i = 0; i <= player1.getPokemons().size(); i++ ) {
			if(player1.getPokemons().get(i).getHp() == 0) {
				contDerrota += contDerrota;
			}
		}
		if(contDerrota == player1.getPokemons().size()) {
			return "O campeão desse duelo pokemon foi "+player2.getNome();
		}else {
			return "O campeão desse duelo pokemon foi "+player1.getNome();
		}
	}
}
