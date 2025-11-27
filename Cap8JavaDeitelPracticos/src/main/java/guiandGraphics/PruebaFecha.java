package guiandGraphics;

public class PruebaFecha {
    public static void main(String[] args) {
        Fecha fecha = new Fecha(12, 31, 2023);
        System.out.println("Fecha inicial: " + fecha);
        for (int i = 0; i < 10; i++) {
            fecha.siguienteDia();
            System.out.println("Fecha después de siguienteDia: " + fecha);
        }
    }
}
