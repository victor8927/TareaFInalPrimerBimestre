package guiandGraphics;

public class CuentaDeAhorros {
    private static double tasaInteresAnual;
    private double saldoAhorros;

    // Constructor
    public CuentaDeAhorros(double saldo) {
        saldoAhorros = saldo;
    }

    // Método para calcular el interés mensual
    public void calcularInteresMensual() {
        double interesMensual = saldoAhorros * (tasaInteresAnual / 12);
        saldoAhorros += interesMensual;
    }

    // Método estático para modificar la tasa de interés
    public static void modificarTasaInteres(double nuevaTasa) {
        tasaInteresAnual = nuevaTasa;
    }

    // Método para obtener el saldo
    public double obtenerSaldo() {
        return saldoAhorros;
    }
}
