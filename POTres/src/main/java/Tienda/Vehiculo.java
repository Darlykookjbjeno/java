
package Tienda;

public class Vehiculo {
    
    private String marca;
    private String modelo;
    private float precio;
    
    public Vehiculo(String Marca, String Modelo, float Precio){
        this.marca=Marca;
        this.modelo=Modelo;
        this.precio= Precio;
    }

    
    public void setMarca(String Marca){
        this.marca= Marca;
    }
    
    public String getMarca(){
    return marca;
    }
    
    public void setModelo(String Modelo){
        this.modelo=Modelo;
    }
    public String getModelo(){
        return modelo;
    }
    
    public void setPrecio(float Precio){
        this.precio=Precio;
    }
    
    public float getPrecio(){
        return precio;
    }
    
    public String Datos(){
    return "Marca: "+marca+ " Modelo: "+modelo+" Precio: $"+precio;
    }
}
