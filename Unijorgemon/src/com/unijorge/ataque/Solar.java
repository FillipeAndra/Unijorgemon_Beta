package com.unijorge.ataque;

import com.unijorge.tipos.TipoPlanta;

public class Solar extends Ataque implements TipoPlanta {
	private final String nome = "Solar Beam";
	private final int dano = 30;

	@Override
	public String toString() {
		return this.nome;
	}
}
