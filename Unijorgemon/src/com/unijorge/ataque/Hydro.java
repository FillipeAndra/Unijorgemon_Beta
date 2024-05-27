package com.unijorge.ataque;

import com.unijorge.tipos.TipoAgua;

public class Hydro extends Ataque implements TipoAgua {
	private final String nome = "Hydro Cannon";
	private final int dano = 30;

	@Override
	public String toString() {
		return this.nome;
	}
	
}
