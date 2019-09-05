// Recibir 10 calificaiones e imprimirlas, además tendrás que decir cual fue la
// clificaión mayor y cual es la menor y tambien tendrá que estar validado en 
// calificaiones entre 0 y 10.
package ciclos;

import javax.swing.JOptionPane;

public class EjercicioDoWhile {
    public static void main(String[] args)
    {
        int c = 1;
        double califacionActual, mayor = 0, menor = 10;
        
        while( c <= 10)
        {
            do
            {
                califacionActual = Double.parseDouble(JOptionPane.showInputDialog("Ingresa la calificaión " + c));
                
                if(califacionActual <= -1 || califacionActual >= 11)
                {
                    JOptionPane.showMessageDialog(null, "ERROR, La calificación que ingresaste no es valida.\n"
                            + "Tienes que ingresar valores entre 0 y 10.");
                }
            }while(califacionActual <= -1 || califacionActual >= 11);
            
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
