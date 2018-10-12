/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora;

import javax.swing.JOptionPane;

/**
 *
 * @author CESDE
 */
public class Resta {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        float num1,num2;
        float resultado=0;
        
        try {
            
            JOptionPane.showMessageDialog(null, "RESTA");
            
            num1=Integer.parseInt(JOptionPane.showInputDialog("PRIMER NUMERO"));
            num2=Integer.parseInt(JOptionPane.showInputDialog("SEGUNDO NUMERO"));
            
            resultado=num1-num2;
            
            JOptionPane.showMessageDialog(null, "RESULTADO\n"+resultado);
        } catch (Exception e) {
        }
    }
    
}
