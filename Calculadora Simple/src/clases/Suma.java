package clases;

public class Suma {
    private double numeroUno, numeroDos;
    
    public Suma(){
       this.numeroUno = 10;
       this.numeroDos = 20;
    }
    
    public Suma(double numeroUno, double numeroDos){
       this.numeroUno = numeroUno;
       this.numeroDos = numeroDos;
    }
    
    public double sumar(){
        return this.numeroUno + this.numeroDos;
    }

    
    // Getters and Setters
    public double getNumeroUno() {
        return numeroUno;
    }

    public void setNumeroUno(double numeroUno) {
        this.numeroUno = numeroUno;
    }

    public double getNumeroDos() {
        return numeroDos;
    }

    public void setNumeroDos(double numeroDos) {
        this.numeroDos = numeroDos;
    }
    
    
}
