package com.unijorge.pokemon;
import java.util.ArrayList;
import java.util.Arrays;

import com.unijorge.ataque.*;
import com.unijorge.tipos.TipoFogo;

public class Infernape extends Pokemon implements TipoFogo {
	
	private static String nome = "Infernape";
	private static int hp = 100;
	
	private static Ember ember = new Ember();
	private static Pledge pledge = new Pledge();
	private static Body body = new Body();
	private static Tackle tackle = new Tackle();
	
	private static ArrayList<Ataque> ataques = new ArrayList<Ataque>(Arrays.asList(ember, pledge, tackle, body));
	
	public Infernape() {
		super(nome, ataques,hp);

	}
	
	@Override
	public String toString() {
		return this.nome; 
	}
}
