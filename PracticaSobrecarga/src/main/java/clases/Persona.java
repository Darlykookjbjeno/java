
package clases;

public class Persona {
    
   String Nombre;
   int edad;
   int km;
    
   //constructor
   public Persona(String nombre, int Edad){
       this.Nombre=nombre;
       this.edad=Edad;
   }
   public Persona(int km){
       this.km=km;
   }
   
   //metodos
   public void Correr(){
       System.out.println("hola soy "+Nombre+ " tengo " + edad + " años ");
   }
   
   public void Correr(int km){
       System.out.println("he recorrido " +km+ " klimetros");
   }
   
}
