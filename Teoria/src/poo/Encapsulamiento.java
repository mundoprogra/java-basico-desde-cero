package poo;

public class Encapsulamiento {
    private double numeroDecimal;
    private int numeroEntero;
    private char caracter;
    
    public Encapsulamiento(){
        numeroDecimal = 10.5;
        numeroEntero = 5;
        caracter = 'a';
    }

    public double getNumeroDecimal() {
        return numeroDecimal;
    }

    public void setNumeroDecimal(double numeroDecimal) {
        this.numeroDecimal = numeroDecimal;
    }

    public int getNumeroEntero() {
        return numeroEntero;
    }

    public void setNumeroEntero(int numeroEntero) {
        this.numeroEntero = numeroEntero;
    }

    public char getCaracter() {
        return caracter;
    }

    public void setCaracter(char caracter) {
        this.caracter = caracter;
    }
    
    
}
