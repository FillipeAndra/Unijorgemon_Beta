/*declaração do pacote*/
package com.unijorge.ataque;

/*importação da inteface tipo fogo*/
import com.unijorge.tipos.TipoFogo;

/*criação da classe Body filha de ataque e que implementa a interface tipo fogo*/
public class Ember extends Ataque implements TipoFogo {
	
	/*declaração dos atributos da classe*/
	private static String nome = "ember";
	private static int dano = 10;
	
	/*método construtor usando o da classe Ataque*/ 
	public Ember() {
		super(nome, dano);
	}
	
	/*sobrescrição do método toString para imprimir o atributo nome*/
	@Override
	public String toString() {
		return this.nome;
	}
	
}
