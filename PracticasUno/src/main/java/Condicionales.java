
import javax.swing.JOptionPane;



public class Condicionales {
    
    public static void main(String[] args){
        
        int numero, dato=5;
        
        //numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero"));
        
        /*if(numero == dato){
            
            JOptionPane.showMessageDialog(null, "El numero es igual a 5");
        
        
        }
            else{
    
            JOptionPane.showMessageDialog(null, "El numero no es igual a 5");
        
        }*/
        
        
        
        int datos;
        
        datos = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero entre 1-5")) ;
        
        
        switch(datos){
        
            case 1: JOptionPane.showMessageDialog(null, "Es el numero uno");
            break;
            
            case 2: JOptionPane.showMessageDialog(null, "Es el numero dos");
            break;
            
            case 3: JOptionPane.showMessageDialog(null, "Es el numero tres");
            break;
            
            case 4: JOptionPane.showMessageDialog(null, "El numero es cuatro");
            break;
            
            case 5: JOptionPane.showMessageDialog(null, "Es el numero 5");
            break;
            
            default:JOptionPane.showMessageDialog(null,"no esta entre los parametros");
        
        }
        
        
     }
        
        
    
    
}
