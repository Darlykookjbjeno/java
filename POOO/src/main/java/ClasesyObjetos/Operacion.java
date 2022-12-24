
package ClasesyObjetos;

import java.util.Scanner;

public class Operacion {
    
 

    public int Suma(int numero1,int num2){     
     int suma = numero1 + num2;
     
     return suma;
    }
    
    public int Resta(int numero1 , int num2){
        int resta=numero1-num2;
        return resta;
    }
    
    public int Division(int numero1,int num2){
        int division=numero1/num2;
        return division;
    }
    
    public int Multiplicacion(int numero1, int num2){
        int multiplicacion = numero1*num2;
        return multiplicacion;
    }
    
    
    public void Imprimir(int suma,int resta, int division, int multiplicacion){
        System.out.println("la suma es : "+suma);
        System.out.println("la resta es: "+resta);
        System.out.println("la division es : "+division);
        System.out.println("la multiplicacion es : "+multiplicacion);
        
    }
    
    
}
