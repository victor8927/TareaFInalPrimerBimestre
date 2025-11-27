package guiandGraphics;

public class Complejo {
    private double real;
    private double imaginario;

    // Constructor
    public Complejo(double real, double imaginario) {
        this.real = real;
        this.imaginario = imaginario;
    }

    // Sumar
    public Complejo sumar(Complejo otro) {
        return new Complejo(this.real + otro.real, this.imaginario + otro.imaginario);
    }

    // Restar
    public Complejo restar(Complejo otro) {
        return new Complejo(this.real - otro.real, this.imaginario - otro.imaginario);
    }

    // Imprimir
    public void imprimir() {
        System.out.println(this.real + " + " + this.imaginario + "i");
    }
}
