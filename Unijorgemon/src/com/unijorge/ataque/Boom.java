package com.unijorge.ataque;

import com.unijorge.tipos.TipoNormal;

public class Boom extends Ataque implements TipoNormal {
	private final String nome = "Boom Burst";
	private final int dano = 30;
	
	@Override
	public String toString() {
		return this.nome;
	}
}
