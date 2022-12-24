
import javax.swing.JOptionPane;


public class EjercicioDos {
    
    public static void main(String[] args){
    
        int num1, num2;
        
        num1 = Integer.parseInt(JOptionPane.showInputDialog("Escriba el primer numero"));
        num2 = Integer.parseInt(JOptionPane.showInputDialog("Escriba el segundo numero"));
        
        if(num1 > num2){
            
            JOptionPane.showMessageDialog(null, num1+" es mayor que "+num2);
            
        }else if(num2 > num1){
        
            JOptionPane.showMessageDialog(null,num2+" es mayor que "+num1);
        
        }else{
            
            
            JOptionPane.showMessageDialog(null, "los numero son iguales");
        
        
        }
    
    }
    
}
