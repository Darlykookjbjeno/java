
package Cuadrado;

import java.util.Scanner;


public class main {
   
    public static void main(String[] args){
    
        Scanner Lector= new Scanner(System.in);
        Cuadrilatero c1;
        
        float lado1= Lector.nextFloat();
        float lado2= Lector.nextFloat();
        
        if(lado1 == lado2){
            c1 = new Cuadrilatero(lado1);
            
        
        }else{
            c1 = new Cuadrilatero(lado1, lado2);
        }
        
        System.out.println("el perimetro es "+ c1.setPerimetro());
        System.out.println("el area es "+c1.setArea());
        
    
    }
}
