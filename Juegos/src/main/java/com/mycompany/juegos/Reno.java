
package com.mycompany.juegos;


public class Reno extends Personaje implements ataqueEspecial,ataqueAdistancia {

    public Reno() {
    }
    
    
    @Override
    protected int atacar() {
        System.out.println("el reno uso sus cuernos para atacar");
        return ataque*5;
    }

    @Override
    protected void daño(int vida) {
        this.vida -=vida;
    }

    @Override
    public int ataqueEspecial() {
        System.out.println("Reno uso ataque especial golpe con trineo");
        return ataque*10;
    }

    @Override
    public int ataqueAdistancia() {
        System.out.println("Reno lanza las herraduras de sus patas");
        return ataqueDistancia*5;
    }
    
}
