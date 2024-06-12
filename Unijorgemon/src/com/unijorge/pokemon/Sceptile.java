/*declaração do pacote*/
package com.unijorge.pokemon;

/*importação da interface tipo planta*/
import com.unijorge.tipos.TipoPlanta;

/*importação de todos as classes do package ataque*/
import com.unijorge.ataque.*;

/*importação da classe array*/
import java.util.Arrays;

/*importação da classe arraylist*/
import java.util.ArrayList;

/*criação da classe sceptile filha de pokemon implementando classe tipo planta*/ 
public class Sceptile extends Pokemon implements TipoPlanta{
	
	/*declaração dos atributos da classe*/
	private static String nome = "Sceptile";
	private static int hp = 100;
	
	private static Leaf leaf = new Leaf();
	private static BulletSeed bulletSeed = new BulletSeed();
	private static Boom boom = new Boom();
	private static Tackle tackle = new Tackle();
	
	private static ArrayList<Ataque> ataques = new ArrayList<Ataque>(Arrays.asList(leaf, bulletSeed, tackle, boom));
	
	/*método construtor usando o da classe Pokemon*/ 
	public Sceptile() {
		super(nome, ataques,hp);

	}
	
	/*sobrescrição do método toString para imprimir o atributo nome*/
	@Override
	public String toString() {
		return this.nome; 
	}
}
