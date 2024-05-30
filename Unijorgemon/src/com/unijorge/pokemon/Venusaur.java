package com.unijorge.pokemon;
import com.unijorge.tipos.TipoPlanta;
import java.util.Arrays;
import java.util.ArrayList;
import com.unijorge.ataque.*;

public class Venusaur extends Pokemon implements TipoPlanta {
	private static String nome = "Venusaur";
	private static int hp = 100;
	
	private static Solar solar = new Solar();
	private static BulletSeed bulletSeed = new BulletSeed();
	private static Tackle tackle = new Tackle();
	private static Boom boom = new Boom();
	
	private static ArrayList<Ataque> ataques = new ArrayList<Ataque>(Arrays.asList(solar, bulletSeed, tackle, boom));
	
	public Venusaur() {
		super(nome, ataques,hp);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public String toString() {
		return this.nome; 
	}
}
