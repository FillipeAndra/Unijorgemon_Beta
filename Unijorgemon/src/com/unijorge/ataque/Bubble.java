package com.unijorge.ataque;
import com.unijorge.tipos.*;

public class Bubble extends Ataque implements TipoAgua {
	private static String nome = "Bubble Beam";
	private static int dano = 10;

	public Bubble() {
		super(nome, dano);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public String toString() {
		return this.nome;
	}
}
