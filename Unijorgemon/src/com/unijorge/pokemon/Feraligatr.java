package com.unijorge.pokemon;
import com.unijorge.tipos.TipoAgua;
import com.unijorge.ataque.*;
import java.util.Arrays;
import java.util.ArrayList;

public class Feraligatr extends Pokemon implements TipoAgua{

	private static String nome = "Feraligatr";
	private static int hp = 100;
	
	private static MuddyWater muddyWater = new MuddyWater();
	private static Hydro hydro = new Hydro();
	private static Tackle tackle = new Tackle();
	private static Boom boom = new Boom();
	
	private static ArrayList<Ataque> ataques = new ArrayList<Ataque>(Arrays.asList(muddyWater, hydro, tackle, boom));
	
	public Feraligatr() {
		super(nome, ataques,hp);

	}
	
	@Override
	public String toString() {
		return this.nome; 
	}
}
