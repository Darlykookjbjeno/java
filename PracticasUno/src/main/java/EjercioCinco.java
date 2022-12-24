
import javax.swing.JOptionPane;


public class EjercioCinco {
    
    public static void main(String[] args){
    
        int horas,horasU,horasD;
        float salarioTotal;
        
        horas = Integer.parseInt(JOptionPane.showInputDialog("Digite las horas que trabaja semanalmente"));
        
        if(horas > 40 ){
            
            horasD = horas - 40;
            horasD *= 20;
            salarioTotal=(40 * 16)+horasD;
            
            JOptionPane.showMessageDialog(null, "Su salario total es de: "+salarioTotal);
        
        }else{
        
            
            horasU = horas*16;
        
            JOptionPane.showMessageDialog(null, "sulario es de: "+horasU);
        }
    
    }
}
