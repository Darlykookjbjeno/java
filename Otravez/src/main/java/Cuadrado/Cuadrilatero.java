
package Cuadrado;


public class Cuadrilatero {
   
    private float lado1;
    private float lado2;
    
    public Cuadrilatero(float Lado1, float Lado2){
        this.lado1= Lado1;
        this.lado2=Lado2;
    }
    
    public Cuadrilatero(float Lado1){
        this.lado1=Lado1;
    }
    
    public void setLado1(float Lado1){
        this.lado1=Lado1;
    }
    
    public float getLado1(){
        return lado1;
    }

    public void setLado2(float lado2) {
        this.lado2 = lado2;
    }
    
    public float getLado2() {
        return lado2;
    }

    public float setPerimetro(){
        float perimetro = 2*(lado1+lado2);
        return perimetro;
    }
    
    public float setArea(){
        float area= lado1 * lado2;
        return area;
    }
    
}
