
package com.mycompany.juegos;


public class MuñecoDeNieve extends Personaje implements ataqueEspecial,ataqueAdistancia{

    public MuñecoDeNieve() {
    }
    
    

    @Override
    protected int atacar() {
        System.out.println("el muñeco de nieve lanza bolas de nieve");
        return ataque*5;
    }

    @Override
    protected void daño(int vida) {
        this.vida -=vida;
    }

    @Override
    public int ataqueEspecial() {
        System.out.println("Muñeco de nieve uso ataque especial gran bola de nieve ");
        return ataque*10;
    }

    @Override
    public int ataqueAdistancia() {
        System.out.println("el muñeco de nieve lanza bolas de nieve");
        return ataqueDistancia*5;
    }
    
}
