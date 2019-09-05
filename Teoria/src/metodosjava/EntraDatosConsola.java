package metodosjava;

import java.util.Scanner;

public class EntraDatosConsola {
    public static void main(String args[])
    {
        Scanner entrada = new Scanner(System.in);
        String nombre;
        int nacimiento, edad;
        
        System.out.println("Ingresa tu nombre: ");
        nombre = entrada.nextLine();
        System.out.println("Ingresa tu año de nacimiento: ");
        nacimiento = entrada.nextInt();
        
        edad = 2016 - nacimiento;
        
        System.out.println("Hola, " + nombre + " el año de nacimiento es: " + nacimiento + ", tu edad es: " + edad);
    }
}
