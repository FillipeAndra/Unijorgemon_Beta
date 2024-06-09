package com.unijorge.ataque;
import com.unijorge.tipos.*;

public class BulletSeed extends Ataque implements TipoPlanta {
	private static String nome = "Bullet Seed";
	private static int dano = 10;
	
	public BulletSeed() {
		super(nome, dano);

	}
	
	@Override
	public String toString() {
		return this.nome;
	}
}
