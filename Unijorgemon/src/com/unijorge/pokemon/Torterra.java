package com.unijorge.pokemon;
import com.unijorge.tipos.TipoPlanta;

public class Torterra extends Pokemon implements TipoPlanta {
	private String nome = "Torterra";
	
	@Override
	public String toString() {
		return this.nome; 
	}
}
