package guiandGraphics;

public class PruebaFechaYTiempo {
    public static void main(String[] args) {
        FechaYTiempo fechaYTiempo = new FechaYTiempo(12, 31, 2023, 23, 59, 59);
        System.out.println(fechaYTiempo.obtenerFechaYHora());
        fechaYTiempo.tictac();
        System.out.println(fechaYTiempo.obtenerFechaYHora());
    }
}
