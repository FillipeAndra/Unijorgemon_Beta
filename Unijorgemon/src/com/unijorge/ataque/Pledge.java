package com.unijorge.ataque;

import com.unijorge.tipos.TipoFogo;

public class Pledge extends Ataque implements TipoFogo {
	private static String nome = "Fire Pledge";
	private static int dano = 20;
	
	public Pledge() {
		super(nome, dano);

	}

	@Override
	public String toString() {
		return this.nome;
	}
}
