
package Triangulos;

public class TriangulosIsoceles {

    private float ladoRepetido;
    private float base;
    private float altura;

    public TriangulosIsoceles(float ladoRepetido, float base, float Altura) {
        this.ladoRepetido = ladoRepetido;
        this.base = base;
        this.altura=Altura;
    }
    
    
    
    public float getPerimetro(){
        float perimetro = ((ladoRepetido *2)+ base);
        return perimetro;
    }
    
    public float getArea(){
        float area = (base * altura)/2;
        return area;
    }

    public float getLadoRepetido() {
        return ladoRepetido;
    }

    public void setLadoRepetido(float ladoRepetido) {
        this.ladoRepetido = ladoRepetido;
    }

    public float getBase() {
        return base;
    }

    public void setBase(float base) {
        this.base = base;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }
    
    
    public String getDatos(){
    
    return " medida del anglo igual: " +ladoRepetido+" base: "+base+" altura: "+altura;
    }
   
    
   
    
    
}
