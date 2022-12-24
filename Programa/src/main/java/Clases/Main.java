
package Clases;

import java.util.Scanner;


public class Main {
   
    public static void main(String[] args){
        
            Scanner Lector = new Scanner(System.in);
            String Nombre = Lector.next();
            int edad =Lector.nextInt();
            
    
        Persona p1 = new Persona(Nombre,edad);
        
        p1.MostrarDatos();
    }
    
}
