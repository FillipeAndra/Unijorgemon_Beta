package com.unijorge.ataque;

public abstract class Ataque {
	
	private String nome;
    private int dano;
    
    public String getNome(){
        return this.nome;
    }
    
    public void setNome(String n){
        this.nome = n;
    }
    
    public int getDano(){
        return this.dano;
    }
    
    public void setDano(int d){
        this.dano = d;
    }

}
