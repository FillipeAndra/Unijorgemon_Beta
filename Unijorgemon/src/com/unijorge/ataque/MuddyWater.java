package com.unijorge.ataque;

import com.unijorge.tipos.TipoAgua;

public class MuddyWater extends Ataque implements TipoAgua {
	private static String nome = "Muddy Watter";
	private static int dano = 20;
	
	public MuddyWater() {
		super(nome, dano);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return this.nome;
	}
}
