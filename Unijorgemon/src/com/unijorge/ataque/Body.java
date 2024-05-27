package com.unijorge.ataque;

import com.unijorge.tipos.TipoNormal;

public class Body extends Ataque implements TipoNormal {
	private final String nome = "Body Slam";
	private final int dano = 20;
	
	@Override
	public String toString() {
		return this.nome;
	}
}
