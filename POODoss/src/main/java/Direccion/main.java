
package Direccion;

import java.util.Scanner;

public class main {
    
    public static void main(String[] args ){
    
    Scanner Lector= new Scanner(System.in);
    
    Direccion op;
    
    int x ,y, incremento=0, opcion;
    
    System.out.println("Escriba la cordenada de x");
    x = Lector.nextInt();
    System.out.println("Escriba la cordenada de y");
    y = Lector.nextInt();
    op = new Direccion(x,y);
    
    do{
        System.out.println("Escoja la opcion:");
        System.out.println("1. Aumentar Arriba");
        System.out.println("2. Aumentar Abajo");
        System.out.println("3. Aumentar Derecha");
        System.out.println("4. Aumentar Izquierda");
        System.out.println("5. salir");
        
        opcion = Lector.nextInt();
        
        if(opcion !=5 ){
            
            System.out.println("Escriba la cantidad que quiere gregar");
            incremento = Lector.nextInt();

        }
        
        
        
        switch(opcion){
               
               case 1: op.moverArriba(incremento); break;
               case 2: op.moverAbajo(incremento); break;
               case 3: op.moverDerecho(incremento); break;
               case 4: op.moverIzquierda(incremento); break;
               case 5: System.out.println("salir");
               default : System.out.println("error");
               
           }
           
            System.out.println("La nueva coordenada es: ("+ op.getX()+","+op.getY()+")");
    
 
    }while( opcion != 5);
            
    
    
    
    }
    
}
