import java.util.Scanner;

public class Dies {
  
    public static void main(String[] args){
    
        Scanner Lector = new Scanner(System.in);
        
        float participacion,primerExamenParcial,segundoExamenParcial,examenFinal,notaFinal;
        
        System.out.println("Escriba la Nota de participación");
        participacion = Lector.nextFloat();
        System.out.println("Escriba la Nota del primer Examen Parcial");
        primerExamenParcial = Lector.nextFloat();
        System.out.println("Escriba la Nota del segundo Examen Parcial");
        segundoExamenParcial = Lector.nextFloat();
        System.out.println("Escriba la Nota del examen Final");
        examenFinal = Lector.nextFloat();
        
        participacion *= 0.10;
        primerExamenParcial *= 0.25;
        segundoExamenParcial *= 0.25;
        examenFinal *= 0.40;
        
        notaFinal = participacion+primerExamenParcial+segundoExamenParcial+examenFinal;
        
        System.out.println("Tu nota final es: "+notaFinal);
        
    }
            
}
