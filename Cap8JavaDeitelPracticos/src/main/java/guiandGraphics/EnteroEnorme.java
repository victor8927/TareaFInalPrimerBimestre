package guiandGraphics;

public class EnteroEnorme {
    private int[] digitos;

    public EnteroEnorme() {
        digitos = new int[40];
    }

    // Método para establecer el número
    public void entrada(String numero) {
        if (numero.length() > 40) {
            throw new IllegalArgumentException("El número es demasiado grande.");
        }
        for (int i = 0; i < numero.length(); i++) {
            digitos[i] = numero.charAt(numero.length() - 1 - i) - '0';
        }
    }

    // Método para imprimir el número
    public void salida() {
        boolean inicio = true;
        for (int i = digitos.length - 1; i >= 0; i--) {
            if (digitos[i] != 0 || !inicio) {
                System.out.print(digitos[i]);
                inicio = false;
            }
        }
        if (inicio) {
            System.out.print(0); // En caso de ser 0
        }
        System.out.println();
    }

    // Sumar otro EnteroEnorme
    public EnteroEnorme sumar(EnteroEnorme otro) {
        EnteroEnorme resultado = new EnteroEnorme();
        int acarreo = 0;
        for (int i = 0; i < 40; i++) {
            int suma = this.digitos[i] + otro.digitos[i] + acarreo;
            resultado.digitos[i] = suma % 10;
            acarreo = suma / 10;
        }
        return resultado;
    }

    // Comparar si dos EnteroEnorme son iguales
    public boolean esIgualA(EnteroEnorme otro) {
        for (int i = 0; i < 40; i++) {
            if (this.digitos[i] != otro.digitos[i]) {
                return false;
            }
        }
        return true;
    }
}

