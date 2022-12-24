
package com.mycompany.juego;

import java.util.Scanner;

public class Juego {

    public static void main(String[] args) {
        
        SantaClaus santaClaus = new SantaClaus();
        Duende duende = new Duende();
        Reno reno = new Reno();
        MuñecoDeNieve muñecoDeNieve = new MuñecoDeNieve();
        
        //PJ Santa Claus
        santaClaus.setAtaque(5);
        santaClaus.setDefensa(8);
        santaClaus.setNombre("Santa claus");
        santaClaus.setAtaqueDistancia(5);
        santaClaus.setVida(150);

        //PJ Duende
        duende.setAtaque(4);
        duende.setDefensa(6);
        duende.setNombre("Duende");
        duende.setAtaqueDistancia(15);
        duende.setVida(80);

        //PJ Reno
        reno.setAtaque(8);
        reno.setDefensa(10);
        reno.setNombre("Reno");
        reno.setAtaqueDistancia(5);
        reno.setVida(130);

        //PJ Muñeco de nieve 
        muñecoDeNieve.setAtaque(7);
        muñecoDeNieve.setDefensa(8);
        muñecoDeNieve.setNombre("Muñeco De Nieve");
        muñecoDeNieve.setAtaqueDistancia(12);
        muñecoDeNieve.setVida(100);

            
        Scanner sn = new Scanner (System.in);
        int opcionj1,opcionj2,jugador1,jugador2,variables,seleccion1,seleccion2,vida,daño1,daño2,resistirA;
        jugador1=0;
        jugador2=0;
        seleccion1=0;
        seleccion2=0;
        System.out.println("jugador 1");
        System.out.println("escoja un personaje ");
        System.out.println("1. Santa Claus");
        System.out.println("2. Duende");
        System.out.println("3. Reno");
        System.out.println("4. Muñeco de nieve");
        opcionj1 = sn.nextInt();
        
        switch(opcionj1){
            case 1:
                System.out.println("Santa claus elegido"); 
                jugador1=1;    
                break;
            case 2: 
                System.out.println("Duende elegido");
                jugador1=2;
                break;    
            case 3: 
                System.out.println("Reno elegido");
                jugador1=3;
                break;
            case 4:
                System.out.println("Muñeco de Nieve elegido");
                jugador1=4;
                break;
            default:
                System.out.println("error");
        }
        System.out.println("jugador 2");
        System.out.println("escoja un personaje ");
        System.out.println("1. Santa Claus");
        System.out.println("2. Duende");
        System.out.println("3. Reno");
        System.out.println("4. Muñeco de nieve");
        opcionj2 = sn.nextInt();
        
        switch(opcionj2){
            case 1:
                System.out.println("Santa claus elegido"); 
                jugador2=1;
                break;
            case 2: 
                System.out.println("Duende elegido");
                jugador2=2;
                break;    
            case 3: 
                System.out.println("Reno elegido");
                jugador2=3;
                break;
            case 4:
                System.out.println("Muñeco de Nieve elegido");
                jugador2=4;
                break;
            default:
                System.out.println("error");
        }
        
        variables=0;
        if((jugador1==1)&&(jugador2==2)){
            variables=1;
        }
        else{ 
        }
        if((jugador1==1)&&(jugador2==3)){
            variables=2;
        }
        else{ 
        }
        if((jugador1==1)&&(jugador2==4)){
            variables=3;
        }
        else{ 
        }
        if((jugador1==2)&&(jugador2==1)){
            variables=4;
        }
        else{ 
        }
        if((jugador1==2)&&(jugador2==3)){
            variables=5;
        }
        else{ 
        }
        if((jugador1==2)&&(jugador2==4)){
            variables=6;
        }
        else{ 
        }
        if((jugador1==3)&&(jugador2==1)){
            variables=7;
        }
        else{ 
        }
        if((jugador1==3)&&(jugador2==2)){
            variables=8;
        }
        else{ 
        }
        if((jugador1==3)&&(jugador2==4)){
            variables=9;
        }
        else{ 
        }
        if((jugador1==4)&&(jugador2==1)){
            variables=10;
        }
        else{ 
        }
        if((jugador1==4)&&(jugador2==2)){
            variables=11;
        }
        else{ 
        }
        if((jugador1==4)&&(jugador2==3)){
            variables=12;
        }
        else{ 
        }
        
        switch(variables){
            case 1:
                System.out.println("variable 1");
                do{
                    
                    System.out.println("vida santa "+santaClaus.getVida());
                    System.out.println("vida duende"+duende.getVida());
                                  
                    System.out.println("¿Que debe hacer Santa claus?"); 
                    System.out.println("1. Atacar");
                    System.out.println("2. Ataque a Distancia");
                    System.out.println("3. Ataque especial");
                    seleccion1 = sn.nextInt();
                    
                    switch(seleccion1){
                        case 1:
                            daño1=santaClaus.atacar();
                            duende.daño(daño1);
                            break;
                        case 2:
                            daño1=santaClaus.ataqueAdistancia();
                            duende.daño(daño1);
                            break;
                        case 3:    
                            daño1=santaClaus.ataqueEspecial();
                            duende.daño(daño1);
                            break;
                            
                    }
                    
                    System.out.println("¿Que debe hacer el duende?"); 
                    System.out.println("1. Atacar");
                    System.out.println("2. Ataque a Distancia");
                    System.out.println("3. Ataque especial");
                    seleccion2 = sn.nextInt();
                    
                    switch(seleccion2){
                        case 1:
                            daño2=duende.atacar();
                            santaClaus.daño(daño2);
                            break;
                        case 2:
                            daño2=duende.ataqueAdistancia();
                            santaClaus.daño(daño2);
                            break;
                        case 3:
                            daño2=duende.ataqueEspecial();
                            santaClaus.daño(daño2);
                            break;         
                    }
                    
                    if (santaClaus.getVida()<=0){
                        System.out.println("jugador 2 gano");               
                    }
                    else{
                        if(duende.getVida()<=0){
                            System.out.println("jugadoe 1 gano");
                        }  else{}
                    }
                    
                    
                }while((santaClaus.getVida()>0)&&(duende.getVida()>0));
                
                
                break;
            case 2:
                System.out.println("variable 2");
                do{
                    
                    System.out.println("vida santa "+santaClaus.getVida());
                    System.out.println("vida reno"+reno.getVida());
                                  
                    System.out.println("¿Que debe hacer Santa claus?"); 
                    System.out.println("1. Atacar");
                    System.out.println("2. Ataque a Distancia");
                    System.out.println("3. Ataque especial");
                    seleccion1 = sn.nextInt();
                    
                    switch(seleccion1){
                        case 1:
                            daño1=santaClaus.atacar();
                            reno.daño(daño1);
                            break;
                        case 2:
                            daño1=santaClaus.ataqueAdistancia();
                            reno.daño(daño1);
                            break;
                        case 3:    
                            daño1=santaClaus.ataqueEspecial();
                            reno.daño(daño1);
                            break;
                            
                    }
                    
                    System.out.println("¿Que debe hacer el reno?"); 
                    System.out.println("1. Atacar");
                    System.out.println("2. Ataque a Distancia");
                    System.out.println("3. Ataque especial");
                    seleccion2 = sn.nextInt();
                    
                    switch(seleccion2){
                        case 1:
                            daño2=reno.atacar();
                            santaClaus.daño(daño2);
                            break;
                        case 2:
                            daño2=reno.ataqueAdistancia();
                            santaClaus.daño(daño2);
                            break;
                        case 3:
                            daño2=reno.ataqueEspecial();
                            santaClaus.daño(daño2);
                            break;         
                    }
                    
                    if (santaClaus.getVida()<=0){
                        System.out.println("jugador 2 gano");               
                    }
                    else{
                        if(reno.getVida()<=0){
                            System.out.println("jugadoe 1 gano");
                        }  else{}
                    }
                    
                    
                }while((santaClaus.getVida()>0)&&(reno.getVida()>0));
                
                break;    
            case 3:
                System.out.println("variable 3");
                do{
                    
                    System.out.println("vida santa "+santaClaus.getVida());
                    System.out.println("vida muñeco de nieve"+muñecoDeNieve.getVida());
                                  
                    System.out.println("¿Que debe hacer Santa claus?"); 
                    System.out.println("1. Atacar");
                    System.out.println("2. Ataque a Distancia");
                    System.out.println("3. Ataque especial");
                    seleccion1 = sn.nextInt();
                    
                    switch(seleccion1){
                        case 1:
                            daño1=santaClaus.atacar();
                            muñecoDeNieve.daño(daño1);
                            break;
                        case 2:
                            daño1=santaClaus.ataqueAdistancia();
                            muñecoDeNieve.daño(daño1);
                            break;
                        case 3:    
                            daño1=santaClaus.ataqueEspecial();
                            muñecoDeNieve.daño(daño1);
                            break;
                            
                    }
                    
                    System.out.println("¿Que debe hacer el muñeco de nieve?"); 
                    System.out.println("1. Atacar");
                    System.out.println("2. Ataque a Distancia");
                    System.out.println("3. Ataque especial");
                    seleccion2 = sn.nextInt();
                    
                    switch(seleccion2){
                        case 1:
                            daño2=muñecoDeNieve.atacar();
                            santaClaus.daño(daño2);
                            break;
                        case 2:
                            daño2=muñecoDeNieve.ataqueAdistancia();
                            santaClaus.daño(daño2);
                            break;
                        case 3:
                            daño2=muñecoDeNieve.ataqueEspecial();
                            santaClaus.daño(daño2);
                            break;         
                    }
                    
                    if (santaClaus.getVida()<=0){
                        System.out.println("jugador 2 gano");               
                    }
                    else{
                        if(muñecoDeNieve.getVida()<=0){
                            System.out.println("jugadoe 1 gano");
                        }  else{}
                    }
                    
                    
                }while((santaClaus.getVida()>0)&&(muñecoDeNieve.getVida()>0));
                
                break;
            case 4:
                System.out.println("variable 4");
                do{
                    
                    System.out.println("vida deunde "+duende.getVida());
                    System.out.println("vida santa claus"+santaClaus.getVida());
                                  
                    System.out.println("¿Que debe hacer el duende?"); 
                    System.out.println("1. Atacar");
                    System.out.println("2. Ataque a Distancia");
                    System.out.println("3. Ataque especial");
                    seleccion1 = sn.nextInt();
                    
                    switch(seleccion1){
                        case 1:
                            daño1=duende.atacar();
                            santaClaus.daño(daño1);
                            break;
                        case 2:
                            daño1=duende.ataqueAdistancia();
                            santaClaus.daño(daño1);
                            break;
                        case 3:    
                            daño1=duende.ataqueEspecial();
                            santaClaus.daño(daño1);
                            break;
                            
                    }
                    
                    System.out.println("¿Que debe hacer santa claus?"); 
                    System.out.println("1. Atacar");
                    System.out.println("2. Ataque a Distancia");
                    System.out.println("3. Ataque especial");
                    seleccion2 = sn.nextInt();
                    
                    switch(seleccion2){
                        case 1:
                            daño2=santaClaus.atacar();
                            duende.daño(daño2);
                            break;
                        case 2:
                            daño2=santaClaus.ataqueAdistancia();
                            duende.daño(daño2);
                            break;
                        case 3:
                            daño2=santaClaus.ataqueEspecial();
                            duende.daño(daño2);
                            break;         
                    }
                    
                    if (duende.getVida()<=0){
                        System.out.println("jugador 2 gano");               
                    }
                    else{
                        if(santaClaus.getVida()<=0){
                            System.out.println("jugadoe 1 gano");
                        }  else{}
                    }
                    
                    
                }while((santaClaus.getVida()>0)&&(duende.getVida()>0));
                
                break;
            case 5:
                System.out.println("variable 5");
                do{
                    
                    System.out.println("vida duende "+duende.getVida());
                    System.out.println("vida reno"+reno.getVida());
                                  
                    System.out.println("¿Que debe hacer el duende?"); 
                    System.out.println("1. Atacar");
                    System.out.println("2. Ataque a Distancia");
                    System.out.println("3. Ataque especial");
                    seleccion1 = sn.nextInt();
                    
                    switch(seleccion1){
                        case 1:
                            daño1=duende.atacar();
                            reno.daño(daño1);
                            break;
                        case 2:
                            daño1=duende.ataqueAdistancia();
                            reno.daño(daño1);
                            break;
                        case 3:    
                            daño1=duende.ataqueEspecial();
                            reno.daño(daño1);
                            break;
                            
                    }
                    
                    System.out.println("¿Que debe hacer el reno?"); 
                    System.out.println("1. Atacar");
                    System.out.println("2. Ataque a Distancia");
                    System.out.println("3. Ataque especial");
                    seleccion2 = sn.nextInt();
                    
                    switch(seleccion2){
                        case 1:
                            daño2=reno.atacar();
                            duende.daño(daño2);
                            break;
                        case 2:
                            daño2=reno.ataqueAdistancia();
                            duende.daño(daño2);
                            break;
                        case 3:
                            daño2=reno.ataqueEspecial();
                            duende.daño(daño2);
                            break;         
                    }
                    
                    if (duende.getVida()<=0){
                        System.out.println("jugador 2 gano");               
                    }
                    else{
                        if(reno.getVida()<=0){
                            System.out.println("jugadoe 1 gano");
                        }  else{}
                    }
                    
                    
                }while((duende.getVida()>0)&&(duende.getVida()>0));
                
                break;
            case 6:
                System.out.println("variable 6");
                do{
                    
                    System.out.println("vida duende "+duende.getVida());
                    System.out.println("vida muñeco de nieve"+muñecoDeNieve.getVida());
                                  
                    System.out.println("¿Que debe hacer el duende?"); 
                    System.out.println("1. Atacar");
                    System.out.println("2. Ataque a Distancia");
                    System.out.println("3. Ataque especial");
                    seleccion1 = sn.nextInt();
                    
                    switch(seleccion1){
                        case 1:
                            daño1=duende.atacar();
                            muñecoDeNieve.daño(daño1);
                            break;
                        case 2:
                            daño1=duende.ataqueAdistancia();
                            muñecoDeNieve.daño(daño1);
                            break;
                        case 3:    
                            daño1=duende.ataqueEspecial();
                            muñecoDeNieve.daño(daño1);
                            break;
                            
                    }
                    
                    System.out.println("¿Que debe hacer el muñeco de nieve?"); 
                    System.out.println("1. Atacar");
                    System.out.println("2. Ataque a Distancia");
                    System.out.println("3. Ataque especial");
                    seleccion2 = sn.nextInt();
                    
                    switch(seleccion2){
                        case 1:
                            daño2=muñecoDeNieve.atacar();
                            duende.daño(daño2);
                            break;
                        case 2:
                            daño2=muñecoDeNieve.ataqueAdistancia();
                            duende.daño(daño2);
                            break;
                        case 3:
                            daño2=muñecoDeNieve.ataqueEspecial();
                            duende.daño(daño2);
                            break;         
                    }
                    
                    if (duende.getVida()<=0){
                        System.out.println("jugador 2 gano");               
                    }
                    else{
                        if(muñecoDeNieve.getVida()<=0){
                            System.out.println("jugadoe 1 gano");
                        }  else{}
                    }
                    
                    
                }while((muñecoDeNieve.getVida()>0)&&(duende.getVida()>0));
                
                break;
            case 7:
                System.out.println("variable 7");
                do{
                    
                    System.out.println("vida Reno "+reno.getVida());
                    System.out.println("vida Santa Claus"+santaClaus.getVida());
                                  
                    System.out.println("¿Que debe hacer el Reno?"); 
                    System.out.println("1. Atacar");
                    System.out.println("2. Ataque a Distancia");
                    System.out.println("3. Ataque especial");
                    seleccion1 = sn.nextInt();
                    
                    switch(seleccion1){
                        case 1:
                            daño1=reno.atacar();
                            santaClaus.daño(daño1);
                            break;
                        case 2:
                            daño1=reno.ataqueAdistancia();
                            santaClaus.daño(daño1);
                            break;
                        case 3:    
                            daño1=reno.ataqueEspecial();
                            santaClaus.daño(daño1);
                            break;
                            
                    }
                    
                    System.out.println("¿Que debe hacer Sant Claus?"); 
                    System.out.println("1. Atacar");
                    System.out.println("2. Ataque a Distancia");
                    System.out.println("3. Ataque especial");
                    seleccion2 = sn.nextInt();
                    
                    switch(seleccion2){
                        case 1:
                            daño2=santaClaus.atacar();
                            reno.daño(daño2);
                            break;
                        case 2:
                            daño2=santaClaus.ataqueAdistancia();
                            reno.daño(daño2);
                            break;
                        case 3:
                            daño2=santaClaus.ataqueEspecial();
                            reno.daño(daño2);
                            break;         
                    }
                    
                    if (reno.getVida()<=0){
                        System.out.println("jugador 2 gano");               
                    }
                    else{
                        if(santaClaus.getVida()<=0){
                            System.out.println("jugadoe 1 gano");
                        }  else{}
                    }
                    
                    
                }while((reno.getVida()>0)&&(santaClaus.getVida()>0));
                
                break;
            case 8:
                System.out.println("variable 8");
                 do{
                    
                    System.out.println("vida Reno "+reno.getVida());
                    System.out.println("vida duende"+duende.getVida());
                                  
                    System.out.println("¿Que debe hacer el Reno?"); 
                    System.out.println("1. Atacar");
                    System.out.println("2. Ataque a Distancia");
                    System.out.println("3. Ataque especial");
                    seleccion1 = sn.nextInt();
                    
                    switch(seleccion1){
                        case 1:
                            daño1=reno.atacar();
                            duende.daño(daño1);
                            break;
                        case 2:
                            daño1=reno.ataqueAdistancia();
                            duende.daño(daño1);
                            break;
                        case 3:    
                            daño1=reno.ataqueEspecial();
                            duende.daño(daño1);
                            break;
                            
                    }
                    
                    System.out.println("¿Que debe hacer el duende?"); 
                    System.out.println("1. Atacar");
                    System.out.println("2. Ataque a Distancia");
                    System.out.println("3. Ataque especial");
                    seleccion2 = sn.nextInt();
                    
                    switch(seleccion2){
                        case 1:
                            daño2=duende.atacar();
                            reno.daño(daño2);
                            break;
                        case 2:
                            daño2=duende.ataqueAdistancia();
                            reno.daño(daño2);
                            break;
                        case 3:
                            daño2=duende.ataqueEspecial();
                            reno.daño(daño2);
                            break;         
                    }
                    
                    if (reno.getVida()<=0){
                        System.out.println("jugador 2 gano");               
                    }
                    else{
                        if(duende.getVida()<=0){
                            System.out.println("jugadoe 1 gano");
                        }  else{}
                    }
                    
                    
                }while((reno.getVida()>0)&&(duende.getVida()>0));
                
                break;    
            case 9:
                System.out.println("variable 9");
                do{
                    
                    System.out.println("vida Reno "+reno.getVida());
                    System.out.println("vida muñeco de nieve"+muñecoDeNieve.getVida());
                                  
                    System.out.println("¿Que debe hacer el Reno?"); 
                    System.out.println("1. Atacar");
                    System.out.println("2. Ataque a Distancia");
                    System.out.println("3. Ataque especial");
                    seleccion1 = sn.nextInt();
                    
                    switch(seleccion1){
                        case 1:
                            daño1=reno.atacar();
                            muñecoDeNieve.daño(daño1);
                            break;
                        case 2:
                            daño1=reno.ataqueAdistancia();
                            muñecoDeNieve.daño(daño1);
                            break;
                        case 3:    
                            daño1=reno.ataqueEspecial();
                            muñecoDeNieve.daño(daño1);
                            break;
                            
                    }
                    
                    System.out.println("¿Que debe hacer el muñeco de nieve?"); 
                    System.out.println("1. Atacar");
                    System.out.println("2. Ataque a Distancia");
                    System.out.println("3. Ataque especial");
                    seleccion2 = sn.nextInt();
                    
                    switch(seleccion2){
                        case 1:
                            daño2=muñecoDeNieve.atacar();
                            reno.daño(daño2);
                            break;
                        case 2:
                            daño2=muñecoDeNieve.ataqueAdistancia();
                            reno.daño(daño2);
                            break;
                        case 3:
                            daño2=muñecoDeNieve.ataqueEspecial();
                            reno.daño(daño2);
                            break;         
                    }
                    
                    if (reno.getVida()<=0){
                        System.out.println("jugador 2 gano");               
                    }
                    else{
                        if(muñecoDeNieve.getVida()<=0){
                            System.out.println("jugadoe 1 gano");
                        }  else{}
                    }
                    
                    
                }while((reno.getVida()>0)&&(muñecoDeNieve.getVida()>0));
                
                break;    
            case 10:
                System.out.println("variable 10");
                do{
                    
                    System.out.println("vida muñeco de nieve "+muñecoDeNieve.getVida());
                    System.out.println("vida Santa Claus"+santaClaus.getVida());
                                  
                    System.out.println("¿Que debe hacer el muñeco de nieve?"); 
                    System.out.println("1. Atacar");
                    System.out.println("2. Ataque a Distancia");
                    System.out.println("3. Ataque especial");
                    seleccion1 = sn.nextInt();
                    
                    switch(seleccion1){
                        case 1:
                            daño1=muñecoDeNieve.atacar();
                            santaClaus.daño(daño1);
                            break;
                        case 2:
                            daño1=muñecoDeNieve.ataqueAdistancia();
                            santaClaus.daño(daño1);
                            break;
                        case 3:    
                            daño1=muñecoDeNieve.ataqueEspecial();
                            santaClaus.daño(daño1);
                            break;
                            
                    }
                    
                    System.out.println("¿Que debe hacer Santa Claus?"); 
                    System.out.println("1. Atacar");
                    System.out.println("2. Ataque a Distancia");
                    System.out.println("3. Ataque especial");
                    seleccion2 = sn.nextInt();
                    
                    switch(seleccion2){
                        case 1:
                            daño2=santaClaus.atacar();
                            muñecoDeNieve.daño(daño2);
                            break;
                        case 2:
                            daño2=santaClaus.ataqueAdistancia();
                            muñecoDeNieve.daño(daño2);
                            break;
                        case 3:
                            daño2=santaClaus.ataqueEspecial();
                            muñecoDeNieve.daño(daño2);
                            break;         
                    }
                    
                    if (muñecoDeNieve.getVida()<=0){
                        System.out.println("jugador 2 gano");               
                    }
                    else{
                        if(santaClaus.getVida()<=0){
                            System.out.println("jugadoe 1 gano");
                        }  else{}
                    }
                    
                    
                }while((muñecoDeNieve.getVida()>0)&&(santaClaus.getVida()>0));
                
                break;    
            case 11:
                System.out.println("variable 11");
                do{
                    
                    System.out.println("vida muñeco de nieve "+muñecoDeNieve.getVida());
                    System.out.println("vida duende"+duende.getVida());
                                  
                    System.out.println("¿Que debe hacer el Reno?"); 
                    System.out.println("1. Atacar");
                    System.out.println("2. Ataque a Distancia");
                    System.out.println("3. Ataque especial");
                    seleccion1 = sn.nextInt();
                    
                    switch(seleccion1){
                        case 1:
                            daño1=muñecoDeNieve.atacar();
                            duende.daño(daño1);
                            break;
                        case 2:
                            daño1=muñecoDeNieve.ataqueAdistancia();
                            duende.daño(daño1);
                            break;
                        case 3:    
                            daño1=muñecoDeNieve.ataqueEspecial();
                            duende.daño(daño1);
                            break;
                            
                    }
                    
                    System.out.println("¿Que debe hacer el duende?"); 
                    System.out.println("1. Atacar");
                    System.out.println("2. Ataque a Distancia");
                    System.out.println("3. Ataque especial");
                    seleccion2 = sn.nextInt();
                    
                    switch(seleccion2){
                        case 1:
                            daño2=duende.atacar();
                            muñecoDeNieve.daño(daño2);
                            break;
                        case 2:
                            daño2=duende.ataqueAdistancia();
                            muñecoDeNieve.daño(daño2);
                            break;
                        case 3:
                            daño2=duende.ataqueEspecial();
                            muñecoDeNieve.daño(daño2);
                            break;         
                    }
                    
                    if (muñecoDeNieve.getVida()<=0){
                        System.out.println("jugador 2 gano");               
                    }
                    else{
                        if(duende.getVida()<=0){
                            System.out.println("jugadoe 1 gano");
                        }  else{}
                    }
                    
                    
                }while((duende.getVida()>0)&&(muñecoDeNieve.getVida()>0));
                
                break;    
            case 12:
                System.out.println("variable 12");
                do{
                    
                    System.out.println("vida muñeco de nieve "+muñecoDeNieve.getVida());
                    System.out.println("vida reno"+reno.getVida());
                                  
                    System.out.println("¿Que debe hacer el Reno?"); 
                    System.out.println("1. Atacar");
                    System.out.println("2. Ataque a Distancia");
                    System.out.println("3. Ataque especial");
                    seleccion1 = sn.nextInt();
                    
                    switch(seleccion1){
                        case 1:
                            daño1=muñecoDeNieve.atacar();
                            reno.daño(daño1);
                            break;
                        case 2:
                            daño1=muñecoDeNieve.ataqueAdistancia();
                            reno.daño(daño1);
                            break;
                        case 3:    
                            daño1=muñecoDeNieve.ataqueEspecial();
                            reno.daño(daño1);
                            break;
                            
                    }
                    
                    System.out.println("¿Que debe hacer el muñeco de nieve?"); 
                    System.out.println("1. Atacar");
                    System.out.println("2. Ataque a Distancia");
                    System.out.println("3. Ataque especial");
                    seleccion2 = sn.nextInt();
                    
                    switch(seleccion2){
                        case 1:
                            daño2=reno.atacar();
                            muñecoDeNieve.daño(daño2);
                            break;
                        case 2:
                            daño2=reno.ataqueAdistancia();
                            muñecoDeNieve.daño(daño2);
                            break;
                        case 3:
                            daño2=reno.ataqueEspecial();
                            muñecoDeNieve.daño(daño2);
                            break;         
                    }
                    
                    if (muñecoDeNieve.getVida()<=0){
                        System.out.println("jugador 2 gano");               
                    }
                    else{
                        if(reno.getVida()<=0){
                            System.out.println("jugadoe 1 gano");
                        }  else{}
                    }
                    
                    
                }while((reno.getVida()>0)&&(muñecoDeNieve.getVida()>0));
                
                break;    
                
                
                
        }

    }
}
    
