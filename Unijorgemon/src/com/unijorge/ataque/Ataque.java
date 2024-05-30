package com.unijorge.ataque;

public abstract class Ataque {
	
	protected String nome;
    protected int dano;
    
    public Ataque(String n, int d) {
    	this.nome = n;
    	this.dano = d;
    }
    
    public String getNome(){
        return this.nome;
    }
    
    protected void setNome(String n){
        this.nome = n;
    }
    
    public int getDano(){
        return this.dano;
    }
    
    protected void setDano(int d){
        this.dano = d;
    }

}
