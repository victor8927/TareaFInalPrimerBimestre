package guiandGraphics;

public class PruebaConjuntoEnteros {
    public static void main(String[] args) {
        ConjuntoEnteros conjunto1 = new ConjuntoEnteros();
        conjunto1.insertarElemento(5);
        conjunto1.insertarElemento(10);
        conjunto1.insertarElemento(20);

        ConjuntoEnteros conjunto2 = new ConjuntoEnteros();
        conjunto2.insertarElemento(10);
        conjunto2.insertarElemento(30);

        ConjuntoEnteros union = conjunto1.union(conjunto2);
        System.out.println("Unión: " + union.aStringConjunto());

        ConjuntoEnteros interseccion = conjunto1.interseccion(conjunto2);
        System.out.println("Intersección: " + interseccion.aStringConjunto());

        System.out.println("¿Son iguales? " + conjunto1.esIgualA(conjunto2));
    }
}
