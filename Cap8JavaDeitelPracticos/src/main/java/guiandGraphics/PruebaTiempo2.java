package guiandGraphics;

public class PruebaTiempo2 {
    public static void main(String[] args) {
        Tiempo2 tiempo = new Tiempo2(11, 59, 59);
        System.out.println("Hora inicial: " + tiempo.obtenerTiempo());

        // Incrementar un segundo
        tiempo.tictac();
        System.out.println("Después de tictac: " + tiempo.obtenerTiempo());

        // Incrementar un minuto
        tiempo.incrementarMinuto();
        System.out.println("Después de incrementar un minuto: " + tiempo.obtenerTiempo());

        // Incrementar una hora
        tiempo.incrementarHora();
        System.out.println("Después de incrementar una hora: " + tiempo.obtenerTiempo());
    }
}

