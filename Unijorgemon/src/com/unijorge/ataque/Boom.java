package com.unijorge.ataque;

import com.unijorge.tipos.TipoNormal;

public class Boom extends Ataque implements TipoNormal {
	private static String nome = "Boom Burst";
	private static int dano = 30;
	
	public Boom() {
		super(nome, dano);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return this.nome;
	}
}
