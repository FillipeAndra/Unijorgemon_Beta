package com.unijorge.pokemon;
import java.util.ArrayList;
import java.util.Arrays;

import com.unijorge.ataque.*;
import com.unijorge.tipos.TipoPlanta;

public class Meganium extends Pokemon implements TipoPlanta {
	
	private static String nome = "Meganium";
	private static int hp = 100;
	
	private static BulletSeed bulletSeed = new BulletSeed();
	private static Leaf leaf = new Leaf();
	private static Body body = new Body();
	private static Tackle tackle = new Tackle();
	
	private static ArrayList<Ataque> ataques = new ArrayList<Ataque>(Arrays.asList(bulletSeed, leaf, tackle, body));
	
	public Meganium() {
		super(nome, ataques,hp);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public String toString() {
		return this.nome; 
	}
}
