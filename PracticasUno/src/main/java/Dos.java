
import java.util.Scanner;

public class Dos {
    
    public static void main(String[] args){
        
        Scanner Lectura = new Scanner(System.in);
        
        String Nombre;
        char Apellido;
        int años=0;
        int Edad;
        
        
        System.out.println("Escriba Su Nombre");
        Nombre = Lectura.nextLine();
        System.out.println("Escriba Su Apellio");
        Apellido = Lectura.next().charAt(0);
        //Apellido = Lectura.next().concat();
        System.out.println("Escriba su año de nacimiento");
        Edad=Lectura.nextInt();
        
        años = 2022-Edad;
        
        System.out.println("Hola "+ Nombre+""+Apellido);
        System.out.println("Tienes "+años+" años");
        
        
        
        
        
     
    
    
    }

    
}
