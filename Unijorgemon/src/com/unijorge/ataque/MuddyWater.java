package com.unijorge.ataque;

import com.unijorge.tipos.TipoAgua;

public class MuddyWater extends Ataque implements TipoAgua {
	private final String nome = "Muddy Watter";
	private final int dano = 20;

	@Override
	public String toString() {
		return this.nome;
	}
}
