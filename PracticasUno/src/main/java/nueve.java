
import java.util.Scanner;


public class nueve {


    public static void main(String[] args){
    
        Scanner Lector = new Scanner(System.in);
        
        int comision=150,carros ;
        float salario = 1000000;
        float VentaPorCarro,porciento,SumaPorCarro,resultado,comisionPorCarro;
        
        System.out.println("Cuantos carros vendio");
        carros = Lector.nextInt();
        comisionPorCarro = comision * carros;
        
        System.out.println("Cual fue la venta por carro");
        VentaPorCarro = Lector.nextFloat();
        
        porciento=(VentaPorCarro * 5)/100;
        
        SumaPorCarro =porciento*carros;
        
        resultado = comisionPorCarro + salario + SumaPorCarro;
        
        System.out.println("Su salario Mensual Total es: "+resultado);
    }
    
}
