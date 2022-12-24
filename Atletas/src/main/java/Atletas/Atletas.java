
package Atletas;

public class Atletas {
    
    private int codigo;
    private String nombre;
    private float tiempo;
    
    public Atletas(int Codigo, String Nombre,float Tiempo){
        this.codigo=Codigo;
        this.nombre=Nombre;
        this.tiempo=Tiempo;
    }
    
    public float getTiempo(){
        return tiempo;
    }
    
    public String getDatos(){
        return "Codigo: "+codigo+"Nombre: "+nombre+"Tiempo: "+tiempo;
    }
    
}
