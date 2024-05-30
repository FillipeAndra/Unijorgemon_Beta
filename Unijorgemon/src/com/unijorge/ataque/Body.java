package com.unijorge.ataque;

import com.unijorge.tipos.TipoNormal;

public class Body extends Ataque implements TipoNormal {
	
	private static String nome = "Body Slam";
	private static int dano = 20;
	
	public Body() {
		super(nome, dano);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public String toString() {
		return this.nome;
	}
}
