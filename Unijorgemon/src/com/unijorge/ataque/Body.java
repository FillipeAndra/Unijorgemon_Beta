/*declaração do pacote*/
package com.unijorge.ataque;

/*importação da inteface tipo normal*/
import com.unijorge.tipos.TipoNormal;

/*criação da classe Body filha de ataque e que implementa a interface tipo normal*/
public class Body extends Ataque implements TipoNormal {
	
	/*declaração das variaveis*/
	private static String nome = "Body Slam";
	private static int dano = 20;
	
	/*método construtor usando o da classe Ataque*/ 
	public Body() {
		super(nome, dano);
	}
	
	/*sobrescrição do método toString para imprimir o atributo nome*/
	@Override
	public String toString() {
		return this.nome;
	}
}
