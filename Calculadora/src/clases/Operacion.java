package clases;

public class Operacion {
    private double numero, numeroDos;
    
    // Constructores
    public Operacion(){
        this.numero = 0;
        this.numeroDos = 0;
    }
    
    public Operacion(double numero, double numeroDos){
        this.numero = numero;
        this.numeroDos = numeroDos;
    }
    // Fin Constructores
    
    // Métodos
    public double sumar(){
        return this.numero + this.numeroDos;
    }
    
    public double restar(){
        return this.numero - this.numeroDos;
    }
    
    public double multipicar(){
        return this.numero * this.numeroDos;
    }
    
    public double dividir(){
        return this.numero / this.numeroDos;
    }
    // Fin Métodos

    // Métodos Getters and Setters
    public double getNumero() {
        return numero;
    }

    public void setNumero(double numero) {
        this.numero = numero;
    }

    public double getNumeroDos() {
        return numeroDos;
    }

    public void setNumeroDos(double numeroDos) {
        this.numeroDos = numeroDos;
    }
    // Fin Métodos Getters and Setters
    
    
}
