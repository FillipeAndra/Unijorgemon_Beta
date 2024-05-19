package com.unijorge.pokemon;
import java.util.ArrayList;
import java.util.Arrays;

import com.unijorge.ataque.*;
import com.unijorge.tipos.TipoFogo;

public class Infernape extends Pokemon implements TipoFogo {
	
	private final String nome = "Infernape";
	private final int hp = 100;
	
	private Ember ember;
	private Pledge pledge;
	private Body body;
	private Tackle tackle;
	
	private final ArrayList<Ataque> ataques = new ArrayList<Ataque>((Arrays.asList(ember, pledge, tackle, body)));
	@Override
	public String toString() {
		return this.nome; 
	}
}
