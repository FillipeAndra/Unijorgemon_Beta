package com.unijorge.pokemon;
import com.unijorge.tipos.TipoAgua;
import com.unijorge.ataque.*;
import java.util.Arrays;
import java.util.ArrayList;
public class Swampert extends Pokemon implements TipoAgua {
	private final String nome = "Swampert";
	private final int hp = 100;
	
	private MuddyWater muddyWater;
	private Hydro hydro;
	private Body body;
	private Boom boom;
	
	private final ArrayList<Ataque> ataques = new ArrayList<Ataque>((Arrays.asList(muddyWater, hydro, body, boom)));
	
	@Override
	public String toString() {
		return this.nome; 
	}
}
