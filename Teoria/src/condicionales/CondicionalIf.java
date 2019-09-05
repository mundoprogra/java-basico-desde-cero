package condicionales;

import javax.swing.JOptionPane;

public class CondicionalIf {
    public static void main(String args[])
    {
        int edad;
        
        edad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese su edad"));
        
        if(edad >= 20 && edad <= 34)
        {
            JOptionPane.showMessageDialog(null, "Eres una persona joven.");
        }
        else if(edad >= 35)
        {
            JOptionPane.showMessageDialog(null, "Eres una persona adulta.");
        }
        else
        {
            JOptionPane.showMessageDialog(null, "Tu categoria no existe.");
        }
    }
}
