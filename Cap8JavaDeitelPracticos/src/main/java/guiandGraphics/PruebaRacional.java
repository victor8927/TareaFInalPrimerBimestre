package guiandGraphics;

public class PruebaRacional {
    public static void main(String[] args) {
        Racional r1 = new Racional(2, 4);
        Racional r2 = new Racional(3, 5);

        Racional suma = r1.sumar(r2);
        Racional resta = r1.restar(r2);
        Racional multiplicacion = r1.multiplicar(r2);
        Racional division = r1.dividir(r2);

        System.out.print("Suma: ");
        suma.imprimir();
        System.out.print("Resta: ");
        resta.imprimir();
        System.out.print("Multiplicación: ");
        multiplicacion.imprimir();
        System.out.print("División: ");
        division.imprimir();

        System.out.print("Suma en decimal: ");
        suma.imprimirDecimal();
    }
}

