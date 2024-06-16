/*declaração do pacote*/
package com.unijorge.ataque;

/*criação da classe abstrata ataque*/
public abstract class Ataque {
	
	/*declaração dos atributos*/
	protected String nome;
    protected int dano;
    
    /*método construtor de ataque*/
    public Ataque(String n, int d) {
    	this.nome = n;
    	this.dano = d;
    }
    
    /*método de retorno getNome*/
    public String getNome(){
        return this.nome;
    }
    
    /*método setNome*/
    protected void setNome(String n){
        this.nome = n;
    }
    
    /*método de retorno getDano*/
    public int getDano(){
        return this.dano;
    }
    
    /*método setDano*/
    protected void setDano(int d){
        this.dano = d;
    }

}
