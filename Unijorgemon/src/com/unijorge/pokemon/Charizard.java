package com.unijorge.pokemon;
import java.util.ArrayList;
import java.util.Arrays;
import com.unijorge.ataque.*;
import com.unijorge.tipos.TipoFogo;

public class Charizard extends Pokemon implements TipoFogo{
	
	private final String nome = "Charizard";
	private final int hp = 100;
	
	private Magma magma;
	private Pledge pledge;
	private Tackle tackle;
	private Body body;
	
	private final ArrayList<Ataque> ataques = new ArrayList<Ataque>((Arrays.asList(pledge, magma, tackle, body )));
	
	@Override
	public String toString() {
		return this.nome; 
	}
	
}
