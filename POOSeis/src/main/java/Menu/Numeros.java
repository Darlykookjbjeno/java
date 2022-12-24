
package Menu;


public class Numeros {
    
    float n1;
    float n2;

    public Numeros(float n1, float n2) {
        this.n1 = n1;
        this.n2 = n2;
    }

    public float getSuma(){
        float suma= n1 +n2;
        return suma;
    }
    
    public float getMultiplicar(){
        float mul = n1 * n2;
        return mul;
    }
    
    public float getN1() {
        return n1;
    }

    public void setN1(float n1) {
        this.n1 = n1;
    }

    public float getN2() {
        return n2;
    }

    public void setN2(float n2) {
        this.n2 = n2;
    }
    
    
    
}
