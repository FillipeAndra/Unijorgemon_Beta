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
public class Charizard extends Pokemon implements TipoFogo{

	/*método construtor usando o da classe Pokemon*/ 
	private static String nome = "Charizard";
	private static int hp = 100;
	
	private static Magma magma = new Magma();
	private static Pledge pledge = new Pledge();
	private static Tackle tackle = new Tackle();
	private static Body body = new Body();
	
	private static ArrayList<Ataque> ataques = new ArrayList<Ataque>(Arrays.asList(magma,pledge,tackle,body));
	
	/*método construtor usando o da classe Pokemon*/ 
	public Charizard() {
		super(nome,ataques, hp);
	}
	
	/*sobrescrição do método toString para imprimir o atributo nome*/
	@Override
	public String toString() {
		return this.nome; 
	}
	
}
