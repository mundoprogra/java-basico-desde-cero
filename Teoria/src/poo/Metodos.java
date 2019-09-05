package poo;

import javax.swing.JOptionPane;

/**
 * 
 * METODOS
 * 
 * No solicitan parametros y no retorna valores
 * 
 * public void nombre()
   {
       instrucciones;
   }
 * 
 * No solicitan parametros y retornan valores
 * 
 * public tipodato nombre()
   {
       instrucciones;
   }
 * 
 * Solicitan parametros y no retornan valores
 * 
 * public void nombre(tipodato par1, tipodato par2, tipodato par3, ...)
   {
       instrucciones;
   }
 * 
 * Solicitan parametros y retornan valores
 * 
 */

public class Metodos {
    public static void main(String args[])
    {
        double numero1, numero2;
        
        for(int c = 1; c <= 5; c++)
        {
            numero1 = Double.parseDouble(JOptionPane.showInputDialog("Ingresa el primer numero de la suma " + c));
            numero2 = Double.parseDouble(JOptionPane.showInputDialog("Ingresa el segundo numero de la suma " + c));
            
            sumaDosNumero(numero1, numero2, c);
        }
    }
    
    public static void sumaDosNumero(double numero1, double numero2, int numeroSuma)
    {
        JOptionPane.showMessageDialog(null, "El valor de la suma " + numeroSuma + " es: " + (numero1 + numero2));
    }
    
//    public static double sumaDosNumeros()
//    {
//        double numero1, numero2;
//        
//        numero1 = Double.parseDouble(JOptionPane.showInputDialog("Ingresa el primer numero"));
//        numero2 = Double.parseDouble(JOptionPane.showInputDialog("Ingresa el segundo numero"));
//        
//        return numero1 + numero2;
//    }
    
//    public static void sumaDosNumeros()
//    {
//        double numero1, numero2;
//        
//        numero1 = Double.parseDouble(JOptionPane.showInputDialog("Ingresa el primer numero"));
//        numero2 = Double.parseDouble(JOptionPane.showInputDialog("Ingresa el segundo numero"));
//        JOptionPane.showMessageDialog(null, "El valor de la suma es: " + (numero1 + numero2));
//    }
}
