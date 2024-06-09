package com.unijorge.ataque;

import com.unijorge.tipos.TipoAgua;

public class Hydro extends Ataque implements TipoAgua {
	private static String nome = "Hydro Cannon";
	private static int dano = 30;

	public Hydro() {
		super(nome, dano);

	}
	
	@Override
	public String toString() {
		return this.nome;
	}
	
}
