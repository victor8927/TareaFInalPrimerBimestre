package guiandGraphics;

public class PruebaLuzSemaforo {
    public static void main(String[] args) {
        for (LuzSemaforo luz : LuzSemaforo.values()) {
            System.out.println(luz + " dura " + luz.getDuracion() + " segundos.");
        }
    }
}
