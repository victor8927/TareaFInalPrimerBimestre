package guiandGraphics;

public class PruebaTresEnRaya {
    public static void main(String[] args) {
        TresEnRaya juego = new TresEnRaya();

        juego.mostrarTablero();
        juego.realizarMovimiento(0, 0); // Jugador 1
        juego.realizarMovimiento(1, 1); // Jugador 2
        juego.realizarMovimiento(0, 1); // Jugador 1
        juego.realizarMovimiento(2, 2); // Jugador 2
        juego.realizarMovimiento(0, 2); // Jugador 1

        juego.mostrarTablero();
        System.out.println("Ganador: Jugador " + juego.comprobarGanador());
    }
}
