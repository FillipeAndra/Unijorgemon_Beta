package com.unijorge.pokemon;
import com.unijorge.ataque.*;
import com.unijorge.tipos.TipoAgua;
import java.util.Arrays;
import java.util.ArrayList;


public class Empoleon extends Pokemon implements TipoAgua{
	
	
	private static String nome = "Empoleon";
	private static int hp = 100;

	private static Hydro hydro = new Hydro();
	private static MuddyWater muddyWater = new MuddyWater();
	private static Boom boom = new Boom();
	private static Body body = new Body();
	
	private static ArrayList<Ataque> ataques = new ArrayList<Ataque>(Arrays.asList(muddyWater, hydro, body, boom));
	
	public Empoleon() {
		super(nome, ataques,hp);

	}
	
	@Override
	public String toString() {
		return this.nome; 
	}
}
