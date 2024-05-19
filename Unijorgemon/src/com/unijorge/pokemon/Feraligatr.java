package com.unijorge.pokemon;
import com.unijorge.tipos.TipoAgua;
import com.unijorge.ataque.*;
import java.util.Arrays;
import java.util.ArrayList;

public class Feraligatr extends Pokemon implements TipoAgua{
	
	private final String nome = "Feraligatr";
	private final int hp = 100;
	
	private MuddyWater muddyWater;
	private Hydro hydro;
	private Tackle tackle;
	private Boom boom;
	
	private final ArrayList<Ataque> ataques = new ArrayList<Ataque>((Arrays.asList(muddyWater, hydro, tackle, boom)));
	
	@Override
	public String toString() {
		return this.nome; 
	}
}
