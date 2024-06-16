/*declaração do pacote*/
package com.unijorge.ataque;

/*importação da inteface tipo água*/
import com.unijorge.tipos.TipoAgua;

/*criação da classe Body filha de ataque e que implementa a interface tipo água*/
public class MuddyWater extends Ataque implements TipoAgua {
	
	/*declaração dos atributos da classe*/
	private static String nome = "Muddy Watter";
	private static int dano = 20;
	
	/*método construtor usando o da classe Ataque*/ 
	public MuddyWater() {
		super(nome, dano);
	}

	/*sobrescrição do método toString para imprimir o atributo nome*/
	@Override
	public String toString() {
		return this.nome;
	}
}
