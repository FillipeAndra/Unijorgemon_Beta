package com.unijorge.pokemon;
import com.unijorge.ataque.*;
import com.unijorge.tipos.TipoAgua;
import java.util.ArrayList;
import java.util.Arrays;

public class Blastoise extends Pokemon implements TipoAgua{
	
	private final String nome = "Blastoise";
	private final int hp = 100;
	
	private Bubble bubble;
	private Hydro hydro;
	private Boom boom;
	private Tackle tackle;
	
	private final ArrayList<Ataque> ataques = new ArrayList<Ataque>((Arrays.asList(bubble, hydro, tackle, boom )));
	
	
	@Override
	public String toString() {
		return this.nome; 
		
	}
}
