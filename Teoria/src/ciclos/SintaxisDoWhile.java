package ciclos;

public class SintaxisDoWhile {
    /**
     * 
     * do
     * {
     *      instrucciones;
     * }while(condicion(es));
     * 
     */
    public static void main(String[] args)
    {
        int c = 1;
        
        do
        {
            System.out.println("Hola Mundo " + c);
            c++;
        }while(c <= 10);
    }
}
