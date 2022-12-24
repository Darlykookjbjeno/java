
import java.util.Scanner;

public class trece {
  
    public static void main(String[] args){
    
        Scanner Lector = new Scanner(System.in);
        double a,b,resultado1,resultado2;
        double c;
        
        System.out.println("Digite el Numero para a");
        a = Lector.nextDouble();
        
        System.out.println("Digite el Numero para b");
        b = Lector.nextDouble();
        
        System.out.println("Digite el Numero para c");
        c = Lector.nextDouble();
        
        resultado1 = -b + Math.sqrt(Math.pow(b, 2)-(4*a*c))/2*a;
        
        resultado2 = -b - Math.sqrt(Math.pow(b, 2)-(4*a*c))/2*a;
        
        System.out.println("El rusultado es:"+resultado1);
        System.out.println("El rusultado es:"+resultado2);
    
    }
}
