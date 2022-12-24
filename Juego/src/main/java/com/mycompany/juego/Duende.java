
package com.mycompany.juego;


public class Duende extends Personaje implements ataqueEspecial,ataqueAdistancia{

    public Duende() {
    }
    
    
    @Override
    protected int atacar() {
        System.out.println("duende ataca con un juguete ");
        return ataque*5;
    }

    @Override
    protected void daño(int vida) {
        this.vida -=vida;
    }

    @Override
    public int ataqueEspecial() {
        System.out.println("Duende uso ataque especial super carbon");
        return ataque*10;
    }

    @Override
    public int ataqueAdistancia() {
        System.out.println("Duende  lanza un regalo");
        return ataqueDistancia*5;
    }
    
}
