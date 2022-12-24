
package Menu;

import java.util.Scanner;


public class main {
    
    public static void main(String[] args){
    
    Scanner Lector = new Scanner(System.in);
    
    Numeros op;
    
        float n1;
        float n2;
        int opcion;
    
        do{

            System.out.println("Menu:");
            System.out.println("1. Sumar dos numeros complejos");
            System.out.println("2. Multiplicar 2 numeros complejos");
            System.out.println("3. comparar dos numeros complejos");
            System.out.println("4. Multiplicar un numero complejo");
            System.out.println("5. Salir");
            opcion = Lector.nextInt();
            
            
            switch(opcion){
                
                    
                case 1:System.out.println("Escriba el prmer numero ");
                           n1 = Lector.nextFloat();
                        System.out.println("Escriba el prmer dos ");
                           n2 = Lector.nextFloat();
                            op = new Numeros(n1,n2);
                    
                        System.out.println("la suma de los dos numeros es: ");
                        System.out.println(op.getSuma());break;
                        
                case 2:System.out.println("Escriba el prmer numero ");
                           n1 = Lector.nextFloat();
                        System.out.println("Escriba el prmer dos ");
                           n2 = Lector.nextFloat();
                            op = new Numeros(n1,n2);
                            
                        System.out.println("la multiplicacion de los dos numeros es: ");
                        System.out.println(op.getMultiplicar());break;
                        
                case 3:System.out.println("Escriba el prmer numero ");
                           n1 = Lector.nextFloat();
                        System.out.println("Escriba el prmer dos ");
                           n2 = Lector.nextFloat();
                            op = new Numeros(n1,n2);
                            
                            if(n1>n2){
                                System.out.println(n1 +"es mayor que "+ n2);
                            }else if(n2>n1){
                                System.out.println(n2 +"es mayor que "+ n1);
                            }else{
                                System.out.println(n1 +"es igaul a "+ n2);
                            }
                            
                        ;break;
                
                case 4:
            }
        
        
        
        }while(opcion != 5);
    }
    
    
}
