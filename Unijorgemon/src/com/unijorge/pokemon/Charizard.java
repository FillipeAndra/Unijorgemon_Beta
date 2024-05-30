package com.unijorge.pokemon;
import java.util.ArrayList;
import java.util.Arrays;
import com.unijorge.ataque.*;
import com.unijorge.tipos.TipoFogo;

public class Charizard extends Pokemon implements TipoFogo{
	
	

	private static String nome = "Charizard";
	private static int hp = 100;
	
	private static Magma magma = new Magma();
	private static Pledge pledge = new Pledge();
	private static Tackle tackle = new Tackle();
	private static Body body = new Body();
	
	private static ArrayList<Ataque> ataques = new ArrayList<Ataque>(Arrays.asList(magma,pledge,tackle,body));
	
	public Charizard() {
		super(nome,ataques, hp);
		// TODO Auto-generated constructor stub
				
	}
	
	@Override
	public String toString() {
		return this.nome; 
	}
	
}
