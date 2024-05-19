package com.unijorge.pokemon;
import com.unijorge.tipos.TipoPlanta;
import com.unijorge.ataque.*;
import java.util.Arrays;
import java.util.ArrayList;

public class Sceptile extends Pokemon implements TipoPlanta{
	
	private final String nome = "Sceptile";
	private final int hp = 100;
	
	private Leaf leaf;
	private BulletSeed bulletSeed;
	private Boom boom;
	private Tackle tackle;
	
	private final ArrayList<Ataque> ataques = new ArrayList<Ataque>((Arrays.asList(leaf, bulletSeed, tackle, boom)));
	
	@Override
	public String toString() {
		return this.nome; 
	}
}
