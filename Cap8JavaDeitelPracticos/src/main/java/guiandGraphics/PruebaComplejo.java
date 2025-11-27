package guiandGraphics;

public class PruebaComplejo {
    public static void main(String[] args) {
        Complejo c1 = new Complejo(2, 3);
        Complejo c2 = new Complejo(1, 4);

        Complejo suma = c1.sumar(c2);
        Complejo resta = c1.restar(c2);

        suma.imprimir();
        resta.imprimir();
    }
}

