
package ClasesyObjetos;

import java.util.Scanner;

public class Main {
    
    public static void main(String[] args){
        
       Scanner Lector = new Scanner(System.in);
       
       int n1 = Lector.nextInt();
       int n2 = Lector.nextInt();
       
       Operacion op = new Operacion();
       int Suma = op.Suma(n1, n2);
       int Resta = op.Resta(n1, n2);
       int Division= op.Multiplicacion(n1, n2);
       int Multiplicacion= op.Division(n1, n2);
       
        /*System.out.println("la suma es "+Suma);
        System.out.println("la resta es "+Resta);
        System.out.println("la Division es "+Division);
        System.out.println("la Multiplicacion es "+Multiplicacion);*/
        
        op.Imprimir(Suma, Resta, Division, Multiplicacion);
    } 
}
