package com.unijorge.pokemon;
import java.util.ArrayList;
import java.util.Arrays;

import com.unijorge.ataque.*;
import com.unijorge.tipos.TipoPlanta;

public class Meganium extends Pokemon implements TipoPlanta {
	
	private final String nome = "Meganium";
	private final int hp = 100;
	
	private BulletSeed bulletSeed;
	private Leaf leaf;
	private Body body;
	private Tackle tackle;
	
	private final ArrayList<Ataque> ataques = new ArrayList<Ataque>((Arrays.asList(bulletSeed, leaf, tackle, body)));
	
	@Override
	public String toString() {
		return this.nome; 
	}
}
