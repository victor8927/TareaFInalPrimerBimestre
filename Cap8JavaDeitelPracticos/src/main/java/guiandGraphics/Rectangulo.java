package guiandGraphics;

public class Rectangulo {
    private double longitud;
    private double anchura;

    // Constructor sin argumentos con valores predeterminados
    public Rectangulo() {
        longitud = 1.0;
        anchura = 1.0;
    }

    // Métodos establecer (con validación)
    public void establecerLongitud(double longitud) {
        if (longitud > 0.0 && longitud < 20.0) {
            this.longitud = longitud;
        } else {
            System.out.println("Longitud inválida. Debe ser mayor que 0 y menor que 20.");
        }
    }

    public void establecerAnchura(double anchura) {
        if (anchura > 0.0 && anchura < 20.0) {
            this.anchura = anchura;
        } else {
            System.out.println("Anchura inválida. Debe ser mayor que 0 y menor que 20.");
        }
    }

    // Métodos obtener
    public double obtenerLongitud() {
        return longitud;
    }

    public double obtenerAnchura() {
        return anchura;
    }

    // Métodos para calcular el perímetro y el área
    public double calcularPerimetro() {
        return 2 * (longitud + anchura);
    }

    public double calcularArea() {
        return longitud * anchura;
    }
}
