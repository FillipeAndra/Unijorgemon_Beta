package com.unijorge.pokemon;
import com.unijorge.tipos.TipoAgua;

public class Feraligatr extends Pokemon implements TipoAgua{
	private String nome = "Feraligatr";
	
	@Override
	public String toString() {
		return this.nome; 
	}
}
