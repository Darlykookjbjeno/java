
import java.util.Scanner;

public class siete {
   
    public static void main(String[] args){
        
        Scanner Lector = new Scanner(System.in);
        
        float horasSemanales,SalarioHora, salarioSemanal;
        
        System.out.println("Ingrese el salario por hora");
        SalarioHora = Lector.nextFloat();
        
        System.out.println("Ingrese las cantidad de horas que trabaja por semana");
        horasSemanales = Lector.nextFloat();
        
        salarioSemanal =SalarioHora * horasSemanales;
        
        System.out.println("Su salario semanal es: "+ salarioSemanal);
        
    
    
    }
    
}
