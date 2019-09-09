import clases.Suma;
import javax.swing.JOptionPane;

public class Principal {
    public static void main(String[] args){
        Suma suma = new Suma();
        
        JOptionPane.showMessageDialog(null, suma.sumar());
        
        
        suma.setNumeroUno(20);
        suma.setNumeroDos(5);
        JOptionPane.showMessageDialog(null, suma.sumar());
    }
}
