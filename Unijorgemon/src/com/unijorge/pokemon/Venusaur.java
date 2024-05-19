package com.unijorge.pokemon;
import com.unijorge.tipos.TipoPlanta;
import java.util.Arrays;
import java.util.ArrayList;
import com.unijorge.ataque.*;

public class Venusaur extends Pokemon implements TipoPlanta {
	private final String nome = "Venusaur";
	private final int hp = 100;
	
	private Solar solar;
	private BulletSeed bulletSeed;
	private Tackle tackle;
	private Boom boom;
	
	private final ArrayList<Ataque> ataques = new ArrayList<Ataque>((Arrays.asList(solar, bulletSeed, tackle, boom)));
	@Override
	public String toString() {
		return this.nome; 
	}
}
