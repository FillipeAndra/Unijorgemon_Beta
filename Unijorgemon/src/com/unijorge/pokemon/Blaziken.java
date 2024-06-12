/*declaração do pacote*/
package com.unijorge.pokemon;

/*importação da interface tipo fogo*/
import com.unijorge.tipos.TipoFogo;

/*importação de todos as classes do package ataque*/
import com.unijorge.ataque.*;

/*importação da classe array*/
import java.util.Arrays;

/*importação da classe arraylist*/
import java.util.ArrayList;

/*criação da classe sceptile filha de pokemon implementando classe tipo fogo*/
public class Blaziken extends Pokemon implements TipoFogo {
	
	/*declaração dos atributos da classe*/
	private static String nome = "Blaziken";
	private static int hp = 100;
	
	private static Ember ember = new Ember();
	private static Magma magma = new Magma();
	private static Boom boom = new Boom();
	private static Body body = new Body();
	
	private static ArrayList<Ataque> ataques = new ArrayList<Ataque>(Arrays.asList(ember,magma,boom,body));

	/*método construtor usando o da classe Pokemon*/ 
	public Blaziken() {
		super(nome, ataques,hp);

	}
	
	/*sobrescrição do método toString para imprimir o atributo nome*/
	@Override
	public String toString() {
		return this.nome;
	}
}
