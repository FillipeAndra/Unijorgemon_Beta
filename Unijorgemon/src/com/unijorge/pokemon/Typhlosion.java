package com.unijorge.pokemon;
import com.unijorge.tipos.TipoFogo;

public class Typhlosion extends Pokemon implements TipoFogo {
	private String nome = "Typhlosion";
	
	@Override
	public String toString() {
		return this.nome; 
	}
}
