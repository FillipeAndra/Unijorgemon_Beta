package com.unijorge.pokemon;
import com.unijorge.tipos.TipoFogo;
import java.util.Arrays;
import java.util.ArrayList;
import com.unijorge.ataque.*;

public class Typhlosion extends Pokemon implements TipoFogo {
	
	private static String nome = "Typhlosion";
	private static int hp = 100;
	
	private static Pledge pledge = new Pledge();
	private static Magma magma = new Magma();
	private static Tackle tackle = new Tackle();
	private static Body body = new Body();
	
	private static ArrayList<Ataque> ataques = new ArrayList<Ataque>(Arrays.asList(pledge, magma, body, tackle));
    
	public Typhlosion() {
		super(nome, ataques,hp);
		// TODO Auto-generated constructor stub

	}
	
	@Override
	public String toString() {
		return this.nome; 
	}
}
