package com.unijorge.pokemon;
import com.unijorge.tipos.TipoFogo;
import java.util.Arrays;
import java.util.ArrayList;
import com.unijorge.ataque.*;

public class Typhlosion extends Pokemon implements TipoFogo {
	
	private final String nome = "Typhlosion";
	private final int hp = 100;
	
	private Pledge pledge;
	private Magma magma;
	private Tackle boom;
	private Body body;
	
	private final ArrayList<Ataque> ataques = new ArrayList<Ataque>((Arrays.asList(pledge, magma, body, boom)));
	@Override
	public String toString() {
		return this.nome; 
	}
}
