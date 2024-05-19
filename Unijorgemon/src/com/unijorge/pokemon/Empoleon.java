package com.unijorge.pokemon;
import com.unijorge.tipos.TipoAgua;

public class Empoleon extends Pokemon implements TipoAgua{
	private String nome = "Empoleon";
	
	@Override
	public String toString() {
		return this.nome; 
	}
}
