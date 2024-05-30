package com.unijorge.pokemon;
import com.unijorge.tipos.TipoPlanta;
import com.unijorge.ataque.*;
import java.util.Arrays;
import java.util.ArrayList;

public class Torterra extends Pokemon implements TipoPlanta {
	
	private static String nome = "Torterra";
	private static int hp = 100;
	
	private static Solar solar = new Solar();
	private static Leaf leaf = new Leaf();
	private static Boom boom = new Boom();
	private static Body body = new Body();
	
	private static ArrayList<Ataque> ataques = new ArrayList<Ataque>(Arrays.asList(solar, leaf, body, boom));
	
	public Torterra() {
		super(nome, ataques,hp);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public String toString() {
		return this.nome; 
	}
}
