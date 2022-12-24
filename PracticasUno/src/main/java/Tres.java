
import java.util.Scanner;
import javax.swing.JOptionPane;

public class Tres {
    
    public static void main(String[] args){
        
        String nombre;
        char letra;
        int entero;
        double desimal;
        double desimal1;
        float flotante;
        
        nombre = JOptionPane.showInputDialog("Digite una cadena");
        entero = Integer.parseInt(JOptionPane.showInputDialog("Digite su edad"));
        letra = JOptionPane.showInputDialog("Digite su apellido ").charAt(0);
        desimal = Double.parseDouble(JOptionPane.showInputDialog("Escriba su peso"));
        flotante = Float.parseFloat(JOptionPane.showInputDialog("escriba un numero desimal"));
        desimal1 = Double.parseDouble(JOptionPane.showInputDialog("Escriba su peso"));
        
        desimal =Double.parseDouble(JOptionPane.showInputDialog("escriba un desimal"));
        
        JOptionPane.showMessageDialog(null, "hola"+nombre);
        JOptionPane.showMessageDialog(null, "Tu edad es: "+entero);
        JOptionPane.showMessageDialog(null, "la primera letra de tu apellido es"+letra);
        JOptionPane.showMessageDialog(null,"Tu numero desimales"+desimal);
        JOptionPane.showMessageDialog(null, "tu peso es: "+flotante);
        JOptionPane.showMessageDialog(null, "no molestes");
                
                
    }
}
