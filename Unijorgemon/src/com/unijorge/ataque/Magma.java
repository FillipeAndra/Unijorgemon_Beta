package com.unijorge.ataque;

import com.unijorge.tipos.TipoFogo;

public class Magma extends Ataque implements TipoFogo {
	private final String nome = "Magma Storm";
	private final int dano = 30;

	@Override
	public String toString() {
		return this.nome;
	}
}
