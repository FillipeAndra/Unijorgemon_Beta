package com.unijorge.ataque;
import com.unijorge.tipos.*;

public class BulletSeed extends Ataque implements TipoPlanta {
	private final String nome = "Bullet Seed";
	private final int dano = 15;
	
	@Override
	public String toString() {
		return this.nome;
	}
}
