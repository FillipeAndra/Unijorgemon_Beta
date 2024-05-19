package com.unijorge.pokemon;
import com.unijorge.tipos.TipoPlanta;
import com.unijorge.ataque.*;
import java.util.Arrays;
import java.util.ArrayList;

public class Torterra extends Pokemon implements TipoPlanta {
	
	private final String nome = "Torterra";
	private final int hp = 100;
	
	private Solar solar;
	private Leaf leaf;
	private Boom boom;
	private Body body;
	
	private final ArrayList<Ataque> ataques = new ArrayList<Ataque>((Arrays.asList(solar, leaf, body, boom)));
	
	@Override
	public String toString() {
		return this.nome; 
	}
}
