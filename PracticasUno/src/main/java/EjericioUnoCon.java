
import javax.swing.JOptionPane;


public class EjericioUnoCon {
    
    public static void main(String[] args){
    
        int num;
        
        num = Integer.parseInt(JOptionPane.showInputDialog("Escria un numero"));
        
        if(num % 10 == 0){
        
        JOptionPane.showMessageDialog(null, "El numero es multiplo de diez");
        
        }else{
            JOptionPane.showMessageDialog(null, "El Numero no es multiplo de diez");
        
        
        }
    
    }
    
}
