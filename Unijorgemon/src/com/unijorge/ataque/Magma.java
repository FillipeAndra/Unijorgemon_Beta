package com.unijorge.ataque;

import com.unijorge.tipos.TipoFogo;

public class Magma extends Ataque implements TipoFogo {
	private static String nome = "Magma Storm";
	private static int dano = 30;
	
	public Magma() {
		super(nome, dano);

	}

	@Override
	public String toString() {
		return this.nome;
	}
}
