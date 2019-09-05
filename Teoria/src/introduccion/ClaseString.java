package introduccion;

public class ClaseString {
    public static void main(String args[])
    {
        int num;
        
        String variable = "ESTOY PROGRAMADO EN JAVA, ME PARECE MUY DIVERTIDO";
        
        System.out.println(variable);
        System.out.println("El texto tiene " + variable.length() + " letras.");
        System.out.println("La frase comienza con la letra " + variable.charAt(0));
        System.out.println("La frase termina con la letra " + variable.charAt(variable.length() - 1));
    }
}
