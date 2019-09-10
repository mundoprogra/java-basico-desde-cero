package poo;

import javax.swing.JOptionPane;

public class Clase {
    // Atributos
    private int attr, attr2, attr3;
    private double attr4, attr5, attr6, attr7;
    private String attr8;
    
    // Constructor
    public Clase(){
        
    }
    
    public Clase(int attr, double attr4){
        this.attr = attr;
        this.attr4 = attr4;
    }
    
    public Clase(int attr2, double attr5, String attr8){
        this.attr2 = attr2;
        this.attr5 = attr5;
        this.attr8 = attr8;
    }
    
    // Metodos
    public void metodoUno(){
        JOptionPane.showMessageDialog(null, "Mensaje desde una clase externa.");
    }
    
    public double metodoUno(double numero){
        return this.attr7 + numero;
    }
    
    public double MetodoDos(double parm1){
        return parm1;
    }
    
    // Getter y Setters

    public int getAttr() {
        return attr;
    }

    public void setAttr(int attr) {
        this.attr = attr;
    }

    public double getAttr7() {
        return attr7;
    }

    public void setAttr7(double attr7) {
        this.attr7 = attr7;
    }
}
