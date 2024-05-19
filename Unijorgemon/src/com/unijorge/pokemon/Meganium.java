package com.unijorge.pokemon;
import com.unijorge.tipos.TipoPlanta;

public class Meganium extends Pokemon implements TipoPlanta {
	private String nome = "Meganium";
	
	@Override
	public String toString() {
		return this.nome; 
	}
}
