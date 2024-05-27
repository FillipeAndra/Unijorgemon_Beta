package com.unijorge.ataque;

import com.unijorge.tipos.TipoPlanta;

public class Leaf extends Ataque implements TipoPlanta {
	private final String nome = "Leaf Storm";
	private final int dano = 20;

	@Override
	public String toString() {
		return this.nome;
	}
}
