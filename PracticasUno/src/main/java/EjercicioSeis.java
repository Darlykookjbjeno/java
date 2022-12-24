
import javax.swing.JOptionPane;


public class EjercicioSeis {
    
    public static void main(String[] args){
    
        float num1 ,num;
        
        num1 = Float.parseFloat(JOptionPane.showInputDialog("Digite el primer numero"));
        num = Float.parseFloat(JOptionPane.showInputDialog("Digite el segundo numero"));
        
        
        
      
         
        if((num1%2=0)&&(num%2=0)){
        
            JOptionPane.showMessageDialog(null, "losdos son pares");
            
        }else if((num1%2!=0)&&(num%2!=0)){

            JOptionPane.showMessageDialog(null, "los dos son impares"); 
            
        }else if((num1%2=0)&&(num%2!=0)){
            
            JOptionPane.showMessageDialog(null, num1+" es par y "+num+" es impar");
            
        }else if((num1%2 != 0)&&(num%2=0)){
        JOptionPane.showMessageDialog(null, num1+" es impar "+num+" es par");
        }else{
        
        JOptionPane.showMessageDialog(null, "no se encuentra entre los parametros");
        }
     
    }
}
