
import java.util.Scanner;

public class seis {
    
    public static void main(String[] args){
    
        Scanner Lector = new Scanner(System.in);
        
        float cal1,cal2,cal3,suma;
        
        System.out.println("Escriba su primera nota");
        cal1 = Lector.nextFloat();
        
        System.out.println("Escriba su segunda nota");
        cal2 = Lector.nextFloat();
        
        System.out.println("Escriba su segundo numero");
        cal3 = Lector.nextFloat();
        
        suma = cal1+cal2+cal3;
        
        System.out.println("la suma de las tres notas es: "+suma);
    
    }
    
}
