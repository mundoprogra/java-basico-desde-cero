// Crear un arreglo de frutas y recorrelo imprimiendo sus valores.

package ciclos;

import javax.swing.JOptionPane;

public class EjercicioFor {
    // Matrices, Arreglos o Arrays
    public static void main(String[] args)
    {
        int totalFrutas;

//        String frutas[] = new String[8];
//        String frutas[] = {"Manzana", "Pera", "Melón", "Cereza", "Uva"};

//        frutas[0] = "Manzana";
//        frutas[1] = "Pera";
//        frutas[2] = "Melón";
//        frutas[3] = "Cereza";
//        frutas[4] = "Uva";
//        frutas[5] = "Toronja";
//        frutas[6] = "Mango";
//        frutas[7] = "Durazno";
//        frutas[8] = "Piña";
//        frutas[9] = "Mandarina";
        
        
//        for(int c = 0; c < frutas.length; c++)
//        {
//            System.out.println(frutas[c]);
//        }
        
        do
        {
            totalFrutas = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el total de frutas que quiere almacenar"));
            if(totalFrutas <= 0)
            {
                JOptionPane.showMessageDialog(null, "ERROR\nIngresa un valor mayor a 0.");
            }
        }while(totalFrutas <= 0);
        
        String frutas[] = new String[totalFrutas];
        
        for(int c = 0; c < frutas.length; c++)
        {
            frutas[c] = JOptionPane.showInputDialog("Ingresa el nombre de la fruta " + (c+1));
        }
        
        for(String fruta:frutas)
        {
            System.out.println(fruta);
        }
        
    }
}
