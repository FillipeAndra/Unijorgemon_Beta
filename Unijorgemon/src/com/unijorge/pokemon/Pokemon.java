/*declaração do pacote*/
package com.unijorge.pokemon;

/*importação da classe arraylist*/
import java.util.ArrayList;

/*importação da classe ataque*/
import com.unijorge.ataque.Ataque;


/*criação da classe abstrata pokemon*/
public abstract class Pokemon {
	
	/*delcaração dos atributos*/
	private String nome;
	private ArrayList<Ataque> ataques = new ArrayList<Ataque>();
	private int hp;
	
	/*método construtor de pokemon*/
	public Pokemon(String n,ArrayList a, int h) {
		this.nome = n;
		this.hp = h;
		this.ataques = a;
	}
	
	/*método de retorno getNome*/
	public String getNome() {
		return this.nome;
	}
	
	/*método setNome*/
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	
	/*método de retorno getAtaques (para retorno dos atques)*/
	public ArrayList<Ataque> getAtaques() {
		return this.ataques;
	}
	
	/*método setAtaques com parâmetro de arraylist*/
	protected void setAtaques(ArrayList<Ataque> ataque) {
		for(int i=0;i<=3;i++) {
			if (ataques.get(i) == null) {
				ataques.add(i,ataque.get(i));
			}
		}
	}
		
	/*polimorfismo por sobrecarga de setAtaques com 4 ataques no parâmetro*/
	protected ArrayList<Ataque> setAtaques(Ataque a1,Ataque a2,Ataque a3, 
			Ataque a4) {
		for(int i=0;i<=3;i++) {
			if (ataques.get(i) == null && i ==0) {
				ataques.add(i,a1);
			}else if (ataques.get(i) == null && i ==1) {
				ataques.add(i,a2);
			}else if (ataques.get(i) == null && i ==2) {
				ataques.add(i,a3);
			}else if (ataques.get(i) == null && i ==3) {
				ataques.add(i,a4);
			}		
		}
		return this.ataques;
	}
	
	/*método de retorno getHp*/
	public int getHp() {
		return hp;
	}
	
	/*método setHp*/
	public void setHp(int hpParaValidar) {
		if(hpParaValidar >=0) {
			this.hp = hpParaValidar;
		}else {
			this.hp = 0;
		}	
	}
	
	
	
}

