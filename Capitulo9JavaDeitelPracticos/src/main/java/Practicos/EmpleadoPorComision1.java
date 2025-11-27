package Practicos;

public class EmpleadoPorComision1 {
    private String nombre;
    private String numeroSeguroSocial;
    private double ventasBrutas; // ventas en un período
    private double tarifaComision; // porcentaje de comisión

    public EmpleadoPorComision1(String nombre, String numeroSeguroSocial, double ventasBrutas, double tarifaComision) {
        this.nombre = nombre;
        this.numeroSeguroSocial = numeroSeguroSocial;
        this.ventasBrutas = ventasBrutas;
        this.tarifaComision = tarifaComision;
    }

    public double ganarComision() {
        return ventasBrutas * tarifaComision;
    }

    public String obtenerNombre() {
        return nombre;
    }

    public String obtenerNumeroSeguroSocial() {
        return numeroSeguroSocial;
    }

    public double obtenerVentasBrutas() {
        return ventasBrutas;
    }

    public double obtenerTarifaComision() {
        return tarifaComision;
    }
}
