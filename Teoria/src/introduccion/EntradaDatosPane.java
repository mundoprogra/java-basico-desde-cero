package introduccion;

import javax.swing.JOptionPane;

public class EntradaDatosPane {
    public static void main(String[] args)
    {
        String nombre;
        int edad, nacimiento;
        
        // 123 ---> "123" ---> 123
        
        nombre = JOptionPane.showInputDialog("Ingresa tu nombre");
        nacimiento = Integer.parseInt(JOptionPane.showInputDialog("Ingresa tu fecha de nacimiento"));
        
        edad = 2017 - nacimiento;
        
        JOptionPane.showMessageDialog(null, "Hola, " + nombre + " el año de nacimiento es: " + nacimiento + ", tu edad es: " + edad);
    }
}
