
import java.util.Scanner;

public class once {
    
    public static void main(String[] args){
    
        Scanner Lector = new Scanner(System.in);
        
        float a,b,resultado;
    
        System.out.println("Digite el primer valor (a)");
        a = Lector.nextFloat();
        System.out.println("Digite el segundo valor (b)");
        b = Lector.nextFloat();
        
        resultado = ((float)Math.pow(a, 2)) + 2*a*b + ((float)Math.pow(b, 2));
        
        System.out.println(resultado);
    
    }
    
}
