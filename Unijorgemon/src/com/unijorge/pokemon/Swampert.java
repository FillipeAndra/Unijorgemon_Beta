package com.unijorge.pokemon;
import com.unijorge.tipos.TipoAgua;

public class Swampert extends Pokemon implements TipoAgua {
	private String nome = "Swampert";
	
	@Override
	public String toString() {
		return this.nome; 
	}
}
