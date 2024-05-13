package com.unijorge.pokemon;
import com.unijorge.tipos.TipoFogo;

public class Infernape extends Pokemon implements TipoFogo {
	private String nome = "Infernape";
	
	@Override
	public String toString() {
		return this.nome; 
	}
}
