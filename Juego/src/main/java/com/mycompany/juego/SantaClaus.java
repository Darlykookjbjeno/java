
package com.mycompany.juego;


public class SantaClaus extends Personaje implements ataqueEspecial,ataqueAdistancia {

    public SantaClaus() {
    }
    
    
    @Override
    protected int atacar() {
        System.out.println("santa claus golpeo con su saco de juguetes"); 
        return ataque*5;  
    }


    @Override
    protected void daño(int vida) {
        this.vida -=vida;
    }

    @Override
    public int ataqueEspecial() {
        System.out.println("Santa Claus uso ataque especial lista negra");
        return ataque*10;
    }

    @Override
    public int ataqueAdistancia() {
        System.out.println("Santa claus lanza un baston de caramelo");
        return ataqueDistancia*5;
    }
    
}

