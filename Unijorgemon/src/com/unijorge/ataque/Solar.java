package com.unijorge.ataque;

import com.unijorge.tipos.TipoPlanta;

public class Solar extends Ataque implements TipoPlanta {
	private static String nome = "Solar Beam";
	private static int dano = 30;
	
	public Solar() {
		super(nome, dano);

	}

	@Override
	public String toString() {
		return this.nome;
	}
}
