package com.unijorge.pokemon;
import com.unijorge.tipos.TipoPlanta;

public class Venusaur extends Pokemon implements TipoPlanta {
	private String nome = "Venusaur";
	
	@Override
	public String toString() {
		return this.nome; 
	}
}
