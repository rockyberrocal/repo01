package calculadora;

import javax.swing.JOptionPane;

public class Division {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        float divisor,dividendo;
        float resultado=0;
        
        try {
            
            JOptionPane.showMessageDialog(null, "DIVISION");
            
            divisor=Integer.parseInt(JOptionPane.showInputDialog("DIVISOR"));
            dividendo=Integer.parseInt(JOptionPane.showInputDialog("DIVIDENDO"));
            
            resultado=divisor/dividendo;
            
            JOptionPane.showMessageDialog(null, "RESULTADO\n"+resultado);
        } catch (Exception e) {
        }
        
    }
}
    
   
