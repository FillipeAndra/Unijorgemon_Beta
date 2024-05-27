package com.unijorge.ataque;
import com.unijorge.tipos.*;

public class Bubble extends Ataque implements TipoAgua {
	private final String nome = "Bubble Beam";
	private final int dano = 15;

	@Override
	public String toString() {
		return this.nome;
	}
}
