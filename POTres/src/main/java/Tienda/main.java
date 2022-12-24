
package Tienda;

import java.util.Scanner;

public class main {
    
    public static int VehiculoMBarato(Vehiculo op[]){
        float precio;
        int indice = 0;
        
        precio = op[0].getPrecio();
        for( int i=0; i<op.length;i++){
            if(op[i].getPrecio() < precio){
                precio = op[i].getPrecio();
                indice = i;
            }
        }
        return indice;
    }
    
    public static void main(String[] args){
        
        Scanner Lector = new Scanner(System.in);
        
        String marca, modelo;
        float precio;
        int cantidad , indiceBarato;
        
        System.out.println("Escriba la cantidad de vehiculos");
        cantidad = Lector.nextInt();
        
       
         //crear objetos
         
         Vehiculo op[] = new Vehiculo[cantidad]; 
        
        for(int i=0;i<cantidad;i++){
            
            System.out.println("vehiculo #"+(i+1));
            System.out.println("Marca: ");
            marca = Lector.next();
            System.out.println("Modelo: ");
            modelo = Lector.next();
            System.out.println("Precio: ");
            precio = Lector.nextFloat();
            
            op[i]=new Vehiculo(marca,modelo,precio);
        } 


        indiceBarato =  VehiculoMBarato(op);
        
        System.out.println("el vehiculo mas barato es: ");
        System.out.println(op[indiceBarato].Datos());
        
        
       
    }
    
    
}
