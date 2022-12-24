
package Triangulos;

import java.util.Scanner;

public class main {
    
    public static int TrianguloMayor(TriangulosIsoceles op[]){
    
        float perimetro;
        int indice=0;
        
       perimetro = op[0].getPerimetro();
    
        for(int i=0;i<op.length;i++ ){
            if(op[i].getPerimetro()>perimetro){
                perimetro = op[i].getPerimetro();
                indice = i;
            }
        
        }
    return indice;
    }
   
    
    public static void main(String[] args){
    
        Scanner Lector = new Scanner(System.in);
        
        float ladoRepetido,base,altura;
        int cantidad,mayor;
        
        System.out.println("Cuantos triangulos desea ingresar");
        cantidad= Lector.nextInt();
        
        TriangulosIsoceles op[] = new  TriangulosIsoceles[cantidad];
        
        for(int i=0;i<cantidad;i++){
            System.out.println("Triangulo # "+(i+1));
            System.out.println("Lado Igual:");
            ladoRepetido= Lector.nextFloat();
            System.out.println("Base:");
            base = Lector.nextFloat();
            System.out.println("Altura:");
            altura = Lector.nextFloat();
            
            op[i] = new TriangulosIsoceles(ladoRepetido, base, altura);
            
            System.out.println("El perimetro del triandulo # "+op[i].getPerimetro());
           
        }
            
        
        
        mayor = TrianguloMayor(op);
        System.out.println("El trianfulo con mayor superficie es: ");
        System.out.println(op[mayor].getDatos());
        System.out.println("El area es:" +op[mayor].getArea());
        
        
    }
}
