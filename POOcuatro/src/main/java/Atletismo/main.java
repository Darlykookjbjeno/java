
package Atletismo;

import java.util.Scanner;

public class main {
    
    public static int masRapido(Atletas op[]){
        float tiempo;
        int indice=0;
        
        tiempo = op[0].getTiempo();
        
        for(int i=0;i<op.length;i++){
            if(op[i].getTiempo()<tiempo){
                tiempo = op[i].getTiempo();
                indice = i;
            }
        }
       return indice;
        
    }    
    
    
    public static void main(String[] args){
        Scanner Lector = new Scanner(System.in);
        
        int codigo;
        float tiempo;
        String nombre;
        int cantidad;
        int masRapido;
        
        System.out.println("Cantida de atletas que participaron");
        cantidad = Lector.nextInt();
        
        Atletas op[]=new Atletas[cantidad];
        
        for(int i=0;i<cantidad;i++){
            System.out.println("Atleta #"+(i+1));
            System.out.println("Codigo: ");
            codigo=Lector.nextInt();
            System.out.println("Nombre: ");
            nombre = Lector.next();
            System.out.println("Tiempo: ");
            tiempo = Lector.nextFloat();
            
            op[i]= new Atletas(codigo,nombre,tiempo);
        }
        
        masRapido = masRapido(op);
        System.out.println("El atleta mas rapido es: ");
        System.out.println(op[masRapido].getDatos());
    }
    
}
