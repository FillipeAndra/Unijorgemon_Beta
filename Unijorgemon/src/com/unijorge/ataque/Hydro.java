/*declaração do pacote*/
package com.unijorge.ataque;

/*importação da inteface tipo água*/
import com.unijorge.tipos.TipoAgua;

/*criação da classe Body filha de ataque e que implementa a interface tipo água*/
public class Hydro extends Ataque implements TipoAgua {
	
	/*declaração dos atributos da classe*/
	private static String nome = "Hydro Cannon";
	private static int dano = 30;
	
	/*método construtor usando o da classe Ataque*/ 
	public Hydro() {
		super(nome, dano);
	}
	
	/*sobrescrição do método toString para imprimir o atributo nome*/
	@Override
	public String toString() {
		return this.nome;
	}
	
}
