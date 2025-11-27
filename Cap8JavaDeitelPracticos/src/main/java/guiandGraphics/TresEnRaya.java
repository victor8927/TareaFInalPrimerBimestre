package guiandGraphics;

public class TresEnRaya {
    private int[][] tablero;
    private int jugador;

    public TresEnRaya() {
        tablero = new int[3][3]; // Tablero de 3x3
        jugador = 1; // Empieza el jugador 1
    }

    // Realiza un movimiento
    public boolean realizarMovimiento(int fila, int columna) {
        if (tablero[fila][columna] == 0) {
            tablero[fila][columna] = jugador;
            jugador = (jugador == 1) ? 2 : 1;
            return true;
        }
        return false; // Casilla ocupada
    }

    // Comprobar si hay ganador
    public int comprobarGanador() {
        // Comprobación filas, columnas y diagonales
        for (int i = 0; i < 3; i++) {
            if (tablero[i][0] != 0 && tablero[i][0] == tablero[i][1] && tablero[i][0] == tablero[i][2]) {
                return tablero[i][0]; // Ganador
            }
            if (tablero[0][i] != 0 && tablero[0][i] == tablero[1][i] && tablero[0][i] == tablero[2][i]) {
                return tablero[0][i]; // Ganador
            }
        }
        if (tablero[0][0] != 0 && tablero[0][0] == tablero[1][1] && tablero[0][0] == tablero[2][2]) {
            return tablero[0][0]; // Ganador
        }
        if (tablero[0][2] != 0 && tablero[0][2] == tablero[1][1] && tablero[0][2] == tablero[2][0]) {
            return tablero[0][2]; // Ganador
        }
        return 0; // No hay ganador aún
    }

    // Mostrar el tablero
    public void mostrarTablero() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print((tablero[i][j] == 0 ? "-" : tablero[i][j] == 1 ? "X" : "O") + " ");
            }
            System.out.println();
        }
    }
}

