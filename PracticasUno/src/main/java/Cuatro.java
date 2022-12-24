
import java.util.Scanner;

public class Cuatro {
    
    
    public static void main(String[] args){
        
        Scanner Lector = new Scanner(System.in);
        
        int num1;
        float num2, suma,resta,multiplicacion, division,resto;
        
        System.out.println("Digite un numero");
        num1 = Lector.nextInt();
        System.out.println("Digite otro numero");
        num2 = Lector.nextFloat();
        
        suma = num1 + num2;
        resta = num1 - num2;
        multiplicacion=num1*num2;
        division = num1 / num2;
        resto=num1% num2;
        
        System.out.println("la suma es: "+suma);
        System.out.println("la resta es: "+resta);
        System.out.println("la multiplicacion es: "+multiplicacion);
        System.out.println("la divison es: "+division);
        System.out.println("el resto es: "+resto);
    
    }
}
