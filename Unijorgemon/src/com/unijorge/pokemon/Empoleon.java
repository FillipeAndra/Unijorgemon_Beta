package com.unijorge.pokemon;
import com.unijorge.ataque.*;
import com.unijorge.tipos.TipoAgua;
import java.util.Arrays;
import java.util.ArrayList;


public class Empoleon extends Pokemon implements TipoAgua{
	
	private final String nome = "Empoleon";
	private final int hp = 100;

	private Hydro hydro;
	private MuddyWater muddyWater;
	private Boom boom;
	private Body body;
	
	private final ArrayList<Ataque> ataques = new ArrayList<Ataque>((Arrays.asList(muddyWater, hydro, body, boom )));
	@Override
	public String toString() {
		return this.nome; 
	}
}
