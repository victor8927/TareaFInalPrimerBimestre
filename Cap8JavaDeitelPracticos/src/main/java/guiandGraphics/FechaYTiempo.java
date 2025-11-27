package guiandGraphics;

public class FechaYTiempo {
    private Fecha fecha;
    private Tiempo2 tiempo;

    public FechaYTiempo(int mes, int dia, int anio, int hora, int minuto, int segundo) {
        fecha = new Fecha(mes, dia, anio);
        tiempo = new Tiempo2(hora, minuto, segundo);
    }

    public void siguienteDia() {
        fecha.siguienteDia();
    }

    public void tictac() {
        tiempo.tictac();
        if (tiempo.obtenerHora() == 0 && tiempo.obtenerMinuto() == 0 && tiempo.obtenerSegundo() == 0) {
            siguienteDia();
        }
    }

    public String obtenerFechaYHora() {
        return fecha + " " + tiempo.obtenerTiempo();
    }
}

