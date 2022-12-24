
import java.util.Scanner;

public class ocho {
    
    public static void main(String[] args){
    
        Scanner Lector = new Scanner(System.in);
        
        float guillermo,luis,juan, resultado, suma;
        
        
        System.out.println("¿Cual es la cantidad de dinero que tiene Guillermo?");
        guillermo = Lector.nextFloat();
        
        luis = guillermo/2;
        suma = guillermo + luis;
        juan = suma/2;
        resultado= luis+juan+guillermo;
        
        System.out.println("Entre los tres tienen: "+resultado);
        
    }
    
}
