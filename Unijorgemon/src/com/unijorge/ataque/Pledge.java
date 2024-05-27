package com.unijorge.ataque;

import com.unijorge.tipos.TipoFogo;

public class Pledge extends Ataque implements TipoFogo {
	private final String nome = "Fire Pledge";
	private final int dano = 20;

	@Override
	public String toString() {
		return this.nome;
	}
}
