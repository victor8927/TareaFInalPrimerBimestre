package guiandGraphics;

public class Tiempo2 {
    private int segundosDesdeMedianoche;

    public Tiempo2(int hora, int minuto, int segundo) {
        segundosDesdeMedianoche = hora * 3600 + minuto * 60 + segundo;
    }

    // Método tictac (incrementar un segundo)
    public void tictac() {
        segundosDesdeMedianoche++;
    }

    // Método para incrementar minuto
    public void incrementarMinuto() {
        segundosDesdeMedianoche += 60;
    }

    // Método para incrementar hora
    public void incrementarHora() {
        segundosDesdeMedianoche += 3600;
    }

    // Métodos obtener hora, minuto, segundo
    public int obtenerHora() {
        return segundosDesdeMedianoche / 3600;
    }

    public int obtenerMinuto() {
        return (segundosDesdeMedianoche % 3600) / 60;
    }

    public int obtenerSegundo() {
        return segundosDesdeMedianoche % 60;
    }

    // Método para mostrar el tiempo
    public String obtenerTiempo() {
        return String.format("%02d:%02d:%02d", obtenerHora(), obtenerMinuto(), obtenerSegundo());
    }
}


