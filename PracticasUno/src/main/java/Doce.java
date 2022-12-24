
import java.util.Scanner;

public class Doce {
    
    public static void main(String[] args){
    
        
        Scanner Lector = new Scanner(System.in);
        
        int horasTotales, horas, semanas,dias;
        
        System.out.println("Ingresa la cantidad de horas");
        horas = Lector.nextInt();
        
        semanas = horas/168;
        
        
        dias = (horas % 168)/24;
        horasTotales = (horas % 24);
        
        
        
        System.out.println(semanas+" semanas");
        System.out.println(dias+" dias");
        System.out.println(horasTotales+" horas");
    }
}
