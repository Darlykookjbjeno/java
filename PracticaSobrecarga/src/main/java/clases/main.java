
package clases;

import java.util.Scanner;

public class main {
   
   public static void main(String[] args){
       
       Scanner Lector = new Scanner(System.in);
       String nombre = Lector.next();
       int edad = Lector.nextInt();
       
       Persona op1 = new Persona(nombre , edad);
       op1.Correr();
       
       int km= Lector.nextInt();
       Persona op2 = new Persona(km);
       op2.Correr(km);
   
   }  
}
