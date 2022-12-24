
package Direcciones;

import java.util.Scanner;
public class main {
    
    public static void main(String[] args){
        
        Scanner Lector = new Scanner(System.in);
        
        Direccion op;
        
        int x, y, incremento=0, opcion;
        
        System.out.println("Escriba lacordenada x");
        x = Lector.nextInt();
        System.out.println("Escriba la cordenada y");
        y = Lector.nextInt();
        
        op = new Direccion(x,y);
        
        do{
            System.out.println("menu:");
            System.out.println("1.Mover hacia arriba");
            System.out.println("2.Mover hacia abajo");
            System.out.println("3. Mover hacia la derecho");
            System.out.println("4. Mover hace la izquierda");
            System.out.println("5.salir");
            System.out.println("Digite la opcion");
            
            opcion = Lector.nextInt();
            
            
            if(opcion != 5 ){
                System.out.println("Digite la cantida de espacios que quiere moverse");
                incremento = Lector.nextInt();       
            }
               
                switch(opcion){
                case 1: op.moverArriba(incremento);break;
                case 2: op.moverAbajo(incremento);break;
                case 3: op.moverDerecha(incremento);break;
                case 4: op.moverIzquierda(incremento);break;
                case 5: break;
                default : System.out.println("Error"); break;
            }
            System.out.println("Posicion Actual ("+ op.getX()+" "+ op.getY()+")"); 

        }while(opcion != 5 );
        
    }
    
}
