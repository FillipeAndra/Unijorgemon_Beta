package com.unijorge.pokemon;
import com.unijorge.tipos.TipoAgua;
import com.unijorge.ataque.*;
import java.util.Arrays;
import java.util.ArrayList;
public class Swampert extends Pokemon implements TipoAgua {
	
	private static String nome = "Swampert";
	private static int hp = 100;
	
	private static MuddyWater muddyWater = new MuddyWater();
	private static Hydro hydro = new Hydro();
	private static Body body = new Body();
	private static Boom boom = new Boom();
	
	private static ArrayList<Ataque> ataques = new ArrayList<Ataque>(Arrays.asList(muddyWater, hydro, body, boom));
	
	public Swampert() {
		super(nome, ataques,hp);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public String toString() {
		return this.nome; 
	}
}
