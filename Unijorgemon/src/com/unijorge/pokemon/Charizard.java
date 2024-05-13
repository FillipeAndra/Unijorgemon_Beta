package com.unijorge.pokemon;

import com.unijorge.tipos.TipoFogo;

public class Charizard extends Pokemon implements TipoFogo{
	private String nome = "Charizard";
	
	@Override
	public String toString() {
		return this.nome; 
	}
	
}
