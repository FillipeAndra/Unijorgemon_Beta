/*declaração do pacote*/
package com.unijorge.ataque;

/*importação da inteface tipo normal*/
import com.unijorge.tipos.TipoNormal;

/*criação da classe Body filha de ataque e que implementa a interface tipo normal*/
public class Tackle extends Ataque implements TipoNormal{
	
	/*declaração dos atributos da classe*/
	private static String nome = "Tackle";
	private static int dano = 10;
	
	/*método construtor usando o da classe Ataque*/ 
	public Tackle() {
		super(nome, dano);
	}
	
	/*sobrescrição do método toString para imprimir o atributo nome*/
	@Override
	public String toString() {
		return this.nome;
	}
}
