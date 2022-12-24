
package CalculoCuadrado;


public class Cuadrado {
    
    private float lado1;
    private float lado2;
    
    //metodos 
    
    
    //metodo constructor par rectangulo
    public Cuadrado(float Lado1, float Lado2){
        this.lado1=Lado1;
        this.lado2=Lado2;
    }
    
    
    //metodo constructorparacuadrado
    public Cuadrado(float Lado1){
        this.lado1=Lado1;
    }
    
    
    public float getPerimetro(){
    
        float perimetro= 2*(lado1 + lado2);
        return perimetro;
    }
    
    public float getArea(){
        float area = lado1 * lado2;
        return area;
    }
    
    
    
}
