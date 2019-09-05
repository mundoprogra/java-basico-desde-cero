package ciclos;

public class SintaxisWhile {
    /**
     * 
     * while(condicion(es))
     * {
     *      instrucciones;
     * }
     * 
     */
    
    public static void main(String arg[])
    {
        int c = 1;
        
        while(c <= 10)
        {
            System.out.println("Hola Mundo " + c);
            c++;
        }
    }
}
