package com.unijorge.pokemon;
import com.unijorge.ataque.*;
import com.unijorge.tipos.TipoAgua;
import java.util.ArrayList;
import java.util.Arrays;

public class Blastoise extends Pokemon implements TipoAgua{

	private static String nome = "Blastoise";
	private static int hp = 100;
	
	private static Bubble bubble = new Bubble();
	private static Hydro hydro = new Hydro();
	private static Boom boom = new Boom();
	private static Tackle tackle = new Tackle();
	
	private static ArrayList<Ataque> ataques = new ArrayList<Ataque>(Arrays.asList(bubble,hydro,boom,tackle));
	
	
	public Blastoise() {
		super("Blastoise", ataques,100);
		
	}
	
	
	@Override
	public String toString() {
		return this.nome; 
		
	}
}
