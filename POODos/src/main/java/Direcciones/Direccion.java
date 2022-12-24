
package Direcciones;

public class Direccion {
   
    //atributos
    
    private int x;
    private int y;
    
    public Direccion(int x, int y){
        this.x=x;
        this.y=y;
    }
    

    public void moverArriba(int incremento){
        y = y+ incremento;
    }
    
    public void moverAbajo( int incremento){
        y = y - incremento;
    }
    
    public void moverDerecha(int incremento){
        x = x + incremento;
    }
    
    public void moverIzquierda(int incremento){
        x = x - incremento;
    }

    
    public int getX(){
        return x;
    }
    
    public int getY(){
        return y;
    }
}
