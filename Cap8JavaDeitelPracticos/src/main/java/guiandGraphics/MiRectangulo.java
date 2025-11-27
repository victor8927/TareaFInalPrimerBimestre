package guiandGraphics;

import java.awt.Color;

public class MiRectangulo {
    private int x1, y1, x2, y2;
    private Color color;
    private boolean relleno;

    // Constructor con argumentos para inicializar todas las variables
    public MiRectangulo(int x1, int y1, int x2, int y2, Color color, boolean relleno) {
        establecerX1(x1);
        establecerY1(y1);
        establecerX2(x2);
        establecerY2(y2);
        this.color = color;
        this.relleno = relleno;
    }

    // Constructor sin argumentos que establece valores por defecto
    public MiRectangulo() {
        this(0, 0, 0, 0, Color.BLACK, false);
    }

    // Métodos establecer
    public void establecerX1(int x1) {
        this.x1 = (x1 >= 0) ? x1 : 0;
    }

    public void establecerY1(int y1) {
        this.y1 = (y1 >= 0) ? y1 : 0;
    }

    public void establecerX2(int x2) {
        this.x2 = (x2 >= 0) ? x2 : 0;
    }

    public void establecerY2(int y2) {
        this.y2 = (y2 >= 0) ? y2 : 0;
    }

    public void establecerColor(Color color) {
        this.color = color;
    }

    public void establecerRelleno(boolean relleno) {
        this.relleno = relleno;
    }

    // Métodos obtener
    public int obtenerXSupIzq() {
        return Math.min(x1, x2);
    }

    public int obtenerYSupIzq() {
        return Math.min(y1, y2);
    }

    public int obtenerAnchura() {
        return Math.abs(x2 - x1);
    }

    public int obtenerAltura() {
        return Math.abs(y2 - y1);
    }

    public Color obtenerColor() {
        return color;
    }

    public boolean esRelleno() {
        return relleno;
    }
}

