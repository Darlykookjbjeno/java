
import javax.swing.JOptionPane;


public class EjercicioCuatro {
    
    public static void main(String[] args){
    
        float Compra1,Compra, Compras;
        
        Compra1 = Integer.parseInt(JOptionPane.showInputDialog("Digite cuanto se fue en la crompra"));
        
        
        if(Compra1 > 300){
            
            Compras = Compra1 * 0.20f;
            Compra = Compra1 - Compras; 
            
            JOptionPane.showMessageDialog(null, "Por su compra mayor a $300 le queda en: "+Compra);

        
        }else{
            
            JOptionPane.showMessageDialog(null, "Por su compra menor a $300 su compra le quedara igual, por: "+Compra1);
        
        }
        
    }
}
