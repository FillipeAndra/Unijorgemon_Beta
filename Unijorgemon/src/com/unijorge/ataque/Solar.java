/*declaração do pacote*/
package com.unijorge.ataque;

/*importação da inteface tipo planta*/
import com.unijorge.tipos.TipoPlanta;

/*criação da classe Body filha de ataque e que implementa a interface tipo planta*/
public class Solar extends Ataque implements TipoPlanta {
	
	/*declaração dos atributos da classe*/
	private static String nome = "Solar Beam";
	private static int dano = 30;
	
	/*método construtor usando o da classe Ataque*/ 
	public Solar() {
		super(nome, dano);
	}

	/*sobrescrição do método toString para imprimir o atributo nome*/
	@Override
	public String toString() {
		return this.nome;
	}
}
