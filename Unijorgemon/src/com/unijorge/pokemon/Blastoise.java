package com.unijorge.pokemon;
import com.unijorge.tipos.TipoAgua;

public class Blastoise extends Pokemon implements TipoAgua{
	private String nome = "Blastoise";
	
	@Override
	public String toString() {
		return this.nome; 
	}
}
