package com.unijorge.ataque;
import com.unijorge.tipos.TipoFogo;

public class Ember extends Ataque implements TipoFogo {
	private static String nome = "ember";
	private static int dano = 10;
	
	public Ember() {
		super(nome, dano);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public String toString() {
		return this.nome;
	}
	
}
