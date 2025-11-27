package guiandGraphics;

public class PruebaCuentaDeAhorros {
    public static void main(String[] args) {
        // Crear instancias de CuentaDeAhorros
        CuentaDeAhorros ahorrador1 = new CuentaDeAhorros(2000.00);
        CuentaDeAhorros ahorrador2 = new CuentaDeAhorros(3000.00);

        // Establecer tasa de interés
        CuentaDeAhorros.modificarTasaInteres(0.04);  // 4% anual

        // Calcular y mostrar interés mensual
        ahorrador1.calcularInteresMensual();
        ahorrador2.calcularInteresMensual();

        System.out.println("Saldo ahorrador 1: " + ahorrador1.obtenerSaldo());
        System.out.println("Saldo ahorrador 2: " + ahorrador2.obtenerSaldo());

        // Modificar tasa de interés
        CuentaDeAhorros.modificarTasaInteres(0.05);  // 5% anual

        // Calcular y mostrar interés mensual nuevamente
        ahorrador1.calcularInteresMensual();
        ahorrador2.calcularInteresMensual();

        System.out.println("Nuevo saldo ahorrador 1: " + ahorrador1.obtenerSaldo());
        System.out.println("Nuevo saldo ahorrador 2: " + ahorrador2.obtenerSaldo());
    }
}

