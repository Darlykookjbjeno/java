
package Direccion;


public class Direccion {
    
    //atributo
    
    private int x;
    private int y;
    
    //metodo constructor 
    
    public Direccion(int x, int y){
        this.x= x;
        this.y= y;
    }
    
    public void moverArriba(int incremento){
        y += incremento;
    }
    
    public void moverAbajo(int incremento){
        y -= incremento;
    }
    
    public void moverDerecho(int incremento){
        x += incremento;
    }
    
    public void moverIzquierda(int incremento){
        x -= incremento;
    }
    
    public void setX(int x){
        this.x = x;
    }
    
    public int getX(){
        return x;
    }
    
    public void setY(int y){
        this.y= y;
    }
    
    public int getY(){
        return y;
    }
}

