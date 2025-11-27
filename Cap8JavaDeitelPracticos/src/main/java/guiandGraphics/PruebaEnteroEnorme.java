package guiandGraphics;

public class PruebaEnteroEnorme {
    public static void main(String[] args) {
        EnteroEnorme numero1 = new EnteroEnorme();
        numero1.entrada("1234567890123456789012345678901234");

        EnteroEnorme numero2 = new EnteroEnorme();
        numero2.entrada("9876543210987654321098765432109876");

        System.out.print("Número 1: ");
        numero1.salida();
        System.out.print("Número 2: ");
        numero2.salida();

        EnteroEnorme suma = numero1.sumar(numero2);
        System.out.print("Suma: ");
        suma.salida();

        System.out.println("¿Son iguales? " + numero1.esIgualA(numero2));
    }
}
