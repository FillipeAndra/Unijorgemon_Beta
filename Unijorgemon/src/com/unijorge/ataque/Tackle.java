package com.unijorge.ataque;
import com.unijorge.tipos.*;

public class Tackle extends Ataque implements TipoNormal{
	private static String nome = "Tackle";
	private static int dano = 10;
	
	public Tackle() {
		super(nome, dano);

	}
	
	@Override
	public String toString() {
		return this.nome;
	}
}
