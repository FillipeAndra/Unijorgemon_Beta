package com.unijorge.pokemon;
import com.unijorge.tipos.TipoPlanta;

public class Sceptile extends Pokemon implements TipoPlanta{
	private String nome = "Sceptile";
	
	@Override
	public String toString() {
		return this.nome; 
	}
}
