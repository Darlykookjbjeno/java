
package Clases;


public class Persona {
  
    //atributos
    
    String Nombre;
    int edad;
    

    //metodo constructor
    
    public Persona(String nombre, int Edad){
        Nombre = nombre;
        edad = Edad;
    }
    
      //metodos
    public void MostrarDatos(){
        System.out.println("el nombre es: "+Nombre);
        System.out.println("LA EDAD ES: "+edad);
    }
    
}
