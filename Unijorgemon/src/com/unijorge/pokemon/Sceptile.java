package com.unijorge.pokemon;
import com.unijorge.tipos.TipoPlanta;
import com.unijorge.ataque.*;
import java.util.Arrays;
import java.util.ArrayList;

public class Sceptile extends Pokemon implements TipoPlanta{
	
	private static String nome = "Sceptile";
	private static int hp = 100;
	
	private static Leaf leaf = new Leaf();
	private static BulletSeed bulletSeed = new BulletSeed();
	private static Boom boom = new Boom();
	private static Tackle tackle = new Tackle();
	
	private static ArrayList<Ataque> ataques = new ArrayList<Ataque>(Arrays.asList(leaf, bulletSeed, tackle, boom));
	
	public Sceptile() {
		super(nome, ataques,hp);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public String toString() {
		return this.nome; 
	}
}
