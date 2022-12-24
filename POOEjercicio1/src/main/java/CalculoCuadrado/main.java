
package CalculoCuadrado;

import java.util.Scanner;


public class main {
    
    public static void main(String[] args){
        
        Scanner Lector = new Scanner(System.in);
        Cuadrado c1;
        //Cuadrado rectangulo = new Cuadrado(ladoUno);
        
        System.out.println("Escriba en lado uno");
        float ladoUno = Lector.nextFloat();
        System.out.println("Escriba ellado dos");
        float ladoDos = Lector.nextFloat();
        
        if(ladoUno == ladoDos){//es un cuadrado
            c1 = new Cuadrado(ladoUno);
            
        }else{
            c1 = new Cuadrado(ladoUno,ladoDos);
            
        }
        
        System.out.println("el perimetro es " + c1.getPerimetro());
        System.out.println("El area es "+ c1.getArea());
    }
}
