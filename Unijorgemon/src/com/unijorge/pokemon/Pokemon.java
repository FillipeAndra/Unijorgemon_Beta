package com.unijorge.pokemon;
import java.util.ArrayList;
import com.unijorge.ataque.Ataque;

public abstract class Pokemon {
	private String nome;
	private ArrayList<Ataque> ataques = new ArrayList<Ataque>();
	private int hp;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public ArrayList<Ataque> getAtaques() {
		return this.ataques;
	}
	
	
	
	protected void setAtaques(ArrayList<Ataque> ataque) {
		for(int i=0;i<=3;i++) {
			if (ataques.get(i) == null) {
				ataques.add(i,ataque.get(i));
			}
			
		}
		
	}
	public int getHp() {
		return hp;
	}
	public void setHp(int hp) {
		this.hp = hp;
	}
	
	
}

