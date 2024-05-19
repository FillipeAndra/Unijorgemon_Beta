package com.unijorge.pokemon;

import java.util.ArrayList;
import java.util.Arrays;
import com.unijorge.ataque.*;
import com.unijorge.tipos.TipoFogo;

public class Blaziken extends Pokemon implements TipoFogo {

	private final String nome = "Blaziken";
	private final int hp = 100;
	
	private Ember ember;
	private Magma magma;
	private Boom boom;
	private Body body;
	
	private final ArrayList<Ataque> ataques = new ArrayList<Ataque>((Arrays.asList(ember, magma, boom, body)));

	@Override
	public String toString() {
		return this.nome;
	}
}
