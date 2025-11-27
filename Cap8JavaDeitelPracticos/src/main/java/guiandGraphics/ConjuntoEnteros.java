package guiandGraphics;

public class ConjuntoEnteros {
    private boolean[] conjunto;

    public ConjuntoEnteros() {
        conjunto = new boolean[101];  // Los valores van de 0 a 100
    }

    public void insertarElemento(int k) {
        if (k >= 0 && k <= 100) {
            conjunto[k] = true;
        }
    }

    public void eliminarElemento(int m) {
        if (m >= 0 && m <= 100) {
            conjunto[m] = false;
        }
    }

    public ConjuntoEnteros union(ConjuntoEnteros otro) {
        ConjuntoEnteros resultado = new ConjuntoEnteros();
        for (int i = 0; i < conjunto.length; i++) {
            if (this.conjunto[i] || otro.conjunto[i]) {
                resultado.insertarElemento(i);
            }
        }
        return resultado;
    }

    public ConjuntoEnteros interseccion(ConjuntoEnteros otro) {
        ConjuntoEnteros resultado = new ConjuntoEnteros();
        for (int i = 0; i < conjunto.length; i++) {
            if (this.conjunto[i] && otro.conjunto[i]) {
                resultado.insertarElemento(i);
            }
        }
        return resultado;
    }

    public String aStringConjunto() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < conjunto.length; i++) {
            if (conjunto[i]) {
                sb.append(i).append(" ");
            }
        }
        return sb.length() > 0 ? sb.toString() : "---";
    }

    public boolean esIgualA(ConjuntoEnteros otro) {
        for (int i = 0; i < conjunto.length; i++) {
            if (this.conjunto[i] != otro.conjunto[i]) {
                return false;
            }
        }
        return true;
    }
}
