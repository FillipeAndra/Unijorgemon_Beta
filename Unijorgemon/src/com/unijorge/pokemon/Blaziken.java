package com.unijorge.pokemon;

import java.util.ArrayList;
import java.util.Arrays;
import com.unijorge.ataque.*;
import com.unijorge.tipos.TipoFogo;

public class Blaziken extends Pokemon implements TipoFogo {

	private static String nome = "Blaziken";
	private static int hp = 100;
	
	private static Ember ember = new Ember();
	private static Magma magma = new Magma();
	private static Boom boom = new Boom();
	private static Body body = new Body();
	
	private static ArrayList<Ataque> ataques = new ArrayList<Ataque>(Arrays.asList(ember,magma,boom,body));

	
	public Blaziken() {
		super(nome, ataques,hp);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public String toString() {
		return this.nome;
	}
}
