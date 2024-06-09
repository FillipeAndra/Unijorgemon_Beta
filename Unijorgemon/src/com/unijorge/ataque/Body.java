package com.unijorge.ataque;

import com.unijorge.tipos.TipoNormal;

public class Body extends Ataque implements TipoNormal {
	
	private static String nome = "Body Slam";
	private static int dano = 20;
	
	public Body() {
		super(nome, dano);

	}
	
	@Override
	public String toString() {
		return this.nome;
	}
}
