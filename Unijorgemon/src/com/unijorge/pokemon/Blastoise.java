/*declaração do pacote*/
package com.unijorge.pokemon;

/*importação da interface tipo água*/
import com.unijorge.tipos.TipoAgua;

/*importação de todos as classes do package ataque*/
import com.unijorge.ataque.*;

/*importação da classe array*/
import java.util.Arrays;

/*importação da classe arraylist*/
import java.util.ArrayList;

/*criação da classe sceptile filha de pokemon implementando classe tipo água*/
public class Blastoise extends Pokemon implements TipoAgua{
	
	/*declaração dos atributos da classe*/
	private static String nome = "Blastoise";
	private static int hp = 100;
	
	private static Bubble bubble = new Bubble();
	private static Hydro hydro = new Hydro();
	private static Boom boom = new Boom();
	private static Tackle tackle = new Tackle();
	
	private static ArrayList<Ataque> ataques = new ArrayList<Ataque>(Arrays.asList(bubble,hydro,boom,tackle));
	
	/*método construtor usando o da classe Pokemon*/ 
	public Blastoise() {
		super("Blastoise", ataques,100);
		
	}
	
	/*sobrescrição do método toString para imprimir o atributo nome*/
	@Override
	public String toString() {
		return this.nome; 
		
	}
}
