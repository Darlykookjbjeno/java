
package com.mycompany.juego;

public abstract class Personaje {
    protected String nombre;
    protected int ataque ;
    protected int defensa ;
    protected int ataqueDistancia ;
    protected int vida;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getAtaque() {
        return ataque;
    }

    public void setAtaque(int ataque) {
        this.ataque = ataque;
    }

    public int getDefensa() {
        return defensa;
    }

    public void setDefensa(int defensa) {
        this.defensa = defensa;
    }

    public int getAtaqueDistancia() {
        return ataqueDistancia;
    }

    public void setAtaqueDistancia(int ataqueDistancia) {
        this.ataqueDistancia = ataqueDistancia;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }
    
    
    
    
    protected abstract int atacar();
    protected abstract void daño(int vida);
}

