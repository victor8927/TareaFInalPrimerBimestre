package guiandGraphics;

public class Racional {
    private int numerador;
    private int denominador;

    // Constructor con numerador y denominador
    public Racional(int numerador, int denominador) {
        if (denominador == 0) {
            throw new IllegalArgumentException("El denominador no puede ser 0.");
        }
        int gcd = obtenerMCD(numerador, denominador);
        this.numerador = numerador / gcd;
        this.denominador = denominador / gcd;
    }

    // Constructor sin argumentos
    public Racional() {
        this.numerador = 0;
        this.denominador = 1;
    }

    // Obtener el Máximo Común Divisor (MCD)
    private int obtenerMCD(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    // Sumar fracciones
    public Racional sumar(Racional otra) {
        int nuevoNumerador = this.numerador * otra.denominador + this.denominador * otra.numerador;
        int nuevoDenominador = this.denominador * otra.denominador;
        return new Racional(nuevoNumerador, nuevoDenominador);
    }

    // Restar fracciones
    public Racional restar(Racional otra) {
        int nuevoNumerador = this.numerador * otra.denominador - this.denominador * otra.numerador;
        int nuevoDenominador = this.denominador * otra.denominador;
        return new Racional(nuevoNumerador, nuevoDenominador);
    }

    // Multiplicar fracciones
    public Racional multiplicar(Racional otra) {
        int nuevoNumerador = this.numerador * otra.numerador;
        int nuevoDenominador = this.denominador * otra.denominador;
        return new Racional(nuevoNumerador, nuevoDenominador);
    }

    // Dividir fracciones
    public Racional dividir(Racional otra) {
        int nuevoNumerador = this.numerador * otra.denominador;
        int nuevoDenominador = this.denominador * otra.numerador;
        return new Racional(nuevoNumerador, nuevoDenominador);
    }

    // Imprimir como fracción
    public void imprimir() {
        System.out.println(numerador + "/" + denominador);
    }

    // Imprimir en formato de punto flotante
    public void imprimirDecimal() {
        System.out.println((double) numerador / denominador);
    }
}
