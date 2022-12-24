
import javax.swing.JOptionPane;


public class EjercicioTres {
    
    public static void main(String[] args){
        
        char letra;
        
        letra = JOptionPane.showInputDialog("Digite un Caracter").charAt(0);
        
        if(Character.isUpperCase(letra)){
        
            JOptionPane.showMessageDialog(null, "El caracter es una mayuscula");
        
        }else{
        
            JOptionPane.showMessageDialog(null, "El caracter es una minuscula");
        
        }
        
        
    
    }
}
