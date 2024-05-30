package com.unijorge.pokemon;
import java.util.ArrayList;
import com.unijorge.ataque.Ataque;

public abstract class Pokemon {
	private String nome;
	private ArrayList<Ataque> ataques = new ArrayList<Ataque>();
	private int hp;
	
	public Pokemon(String n,ArrayList a, int h) {
		this.nome = n;
		this.hp = h;
		this.ataques = a;
	}
	
	public String getNome() {
		return this.nome;
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
	public int getHp() {
		return hp;
	}
	public void setHp(int hpParaValidar) {
		if(hpParaValidar >=0) {
			this.hp = hpParaValidar;
		}else {
			this.hp = 0;
		}	
	}
	
	
	
}

