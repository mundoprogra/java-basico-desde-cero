import clases.Operacion;
import javax.swing.JOptionPane;

public class Principal {
    public static void main(String[] args){
        Operacion ope = new Operacion();
        
        ope.setNumero(10);
        ope.setNumeroDos(20);
        JOptionPane.showMessageDialog(null, "La suma es: " + ope.sumar()
                + "\nLa resta es: " + ope.restar()
                + "\nLa multiplicación es: " + ope.multipicar()
                + "\nLa división es: " + ope.dividir());
    }
}
