/*declaração do pacote*/
package com.unijorge.ataque;

/*importação da inteface tipo fogo*/
import com.unijorge.tipos.TipoFogo;

/*criação da classe Body filha de ataque e que implementa a interface tipo fogo*/
public class Magma extends Ataque implements TipoFogo {
	
	/*declaração dos atributos da classe*/
	private static String nome = "Magma Storm";
	private static int dano = 30;
	
	/*método construtor usando o da classe Ataque*/ 
	public Magma() {
		super(nome, dano);
	}
	
	/*sobrescrição do método toString para imprimir o atributo nome*/
	@Override
	public String toString() {
		return this.nome;
	}
}
