package com.unijorge.pokemon;
import java.util.List;
import java.util.ArrayList;
import com.unijorge.ataque.Ataque;

public abstract class Pokemon {
	private String nome;
	private List<Ataque> ataques = new ArrayList<Ataque>();
	private int hp;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public List<Ataque> getAtaques() {
		return this.ataques;
	}
	
	public void setAtaques(Ataque ataque1, Ataque ataque2) {
		
		if (ataques.isEmpty() == true) {
			this.ataques.add(ataque1);
			this.ataques.add(ataque2);
		}
	}
	public int getHp() {
		return hp;
	}
	public void setHp(int hp) {
		this.hp = hp;
	}
	
	
	
}
///al = new al (new LIghtbolt(123), new Surf (1,2,3) )
/// Pichachu p = new Picachu(new LightBolt(1,2,3),
//Pichachu p = new Picachu(al
