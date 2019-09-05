// Recibir 10 calificaiones e imprimirlas, además tendrás que decir cual fue la
// clificaión mayor y cual es la menor.
package ciclos;

import javax.swing.JOptionPane;

public class EjercicioWhile {
    public static void main(String[] args)
    {
        int c = 1;
        double califacionActual, mayor = 0, menor = 10;
        
        while( c <= 10)
        {
            califacionActual = Double.parseDouble(JOptionPane.showInputDialog("Ingresa la calificaión " + c));
            
            if(califacionActual > mayor)
            {
                mayor = califacionActual;
            }
            
            if(califacionActual < menor)
            {
                menor = califacionActual;
            }
            
            System.out.println("Calificaión " + c + ": " + califacionActual);
            
            c++;
        }
        
        System.out.println("La calificación mayor es: " + mayor);
        System.out.println("La calificación menor es: " + menor);
    }
}
