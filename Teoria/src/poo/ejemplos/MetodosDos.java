package poo.ejemplos;

import javax.swing.JOptionPane;

public class MetodosDos {
    public static void main(String[] args)
    {
        double catetoOpuesto, catetoAdyacente;
        
        catetoOpuesto = Double.parseDouble(JOptionPane.showInputDialog("Ingresa el valor del cateto opuesto"));
        catetoAdyacente = Double.parseDouble(JOptionPane.showInputDialog("Ingresa el valor del cateto adyacente"));
        
        JOptionPane.showMessageDialog(null, "El valor de la hipotenusa es: " + calculoHipotenusa(catetoOpuesto, catetoAdyacente));
    }
    
    public static double calculoHipotenusa(double co, double ca)
    {
        return Math.sqrt(Math.pow(co, 2) + Math.pow(ca, 2));
    }
}
