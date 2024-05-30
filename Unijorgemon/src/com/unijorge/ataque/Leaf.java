package com.unijorge.ataque;

import com.unijorge.tipos.TipoPlanta;

public class Leaf extends Ataque implements TipoPlanta {
	private static String nome = "Leaf Storm";
	private static int dano = 20;
	
	public Leaf() {
		super(nome, dano);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return this.nome;
	}
}
