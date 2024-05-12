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
	
	//para anunciar vitória ele verifcia se todos os pokemons de um player estão caídos
	public String anunciarVitoria(Player player1, Player player2) {
		int contDerrota1 = 0;
		int contDerrota2 = 0;
		for(int i = 0; i < player1.getPokemons().size(); i++ ) {
			if(player1.getPokemons().get(i).getHp() == 0) {
				contDerrota1 += 1;
			}
			if(player2.getPokemons().get(i).getHp() == 0) {
				contDerrota2 += 1;
			}
		}
		if(contDerrota1 == player1.getPokemons().size()) {
			return "O campeão desse duelo pokemon foi "+player2.getNome();
		}else if(contDerrota2 == player2.getPokemons().size()){
			return "O campeão desse duelo pokemon foi "+player1.getNome();
		}else{
			return null;
		}
	}
}
