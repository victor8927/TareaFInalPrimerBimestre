package guiandGraphics;

public class PruebaRectangulo {
    public static void main(String[] args) {
        Rectangulo rect = new Rectangulo();

        // Establecer valores
        rect.establecerLongitud(15.5);
        rect.establecerAnchura(8.0);

        // Mostrar resultados
        System.out.println("Longitud: " + rect.obtenerLongitud());
        System.out.println("Anchura: " + rect.obtenerAnchura());
        System.out.println("Perímetro: " + rect.calcularPerimetro());
        System.out.println("Área: " + rect.calcularArea());
    }
}

