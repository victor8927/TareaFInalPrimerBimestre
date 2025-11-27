package Practicos;

// Fig. 9.6: EmpleadoBaseMasComision.java
// La clase EmpleadoBaseMasComision representa a un empleado que recibe
// un salario base, además de la comisión.

public class EmpleadoBaseMasComision {
    private String primerNombre;
    private String apellidoPaterno;
    private String numeroSeguroSocial;
    private double ventasBrutas; // ventas totales por semana
    private double tarifaComision; // porcentaje de comisión
    private double salarioBase; // salario base por semana

    // Constructor con seis argumentos
    public EmpleadoBaseMasComision(String nombre, String apellido,
                                   String nss, double ventas, double tarifa, double salario) {
        primerNombre = nombre;
        apellidoPaterno = apellido;
        numeroSeguroSocial = nss;
        establecerVentasBrutas(ventas); // valida y almacena las ventas brutas
        establecerTarifaComision(tarifa); // valida y almacena la tarifa de comisión
        establecerSalarioBase(salario); // valida y almacena el salario base
    } // fin del constructor de EmpleadoBaseMasComision con seis argumentos

    // Establece el primer nombre
    public void establecerPrimerNombre(String nombre) {
        primerNombre = nombre;
    } // fin del método establecerPrimerNombre

    // Devuelve el primer nombre
    public String obtenerPrimerNombre() {
        return primerNombre;
    } // fin del método obtenerPrimerNombre

    // Establece el apellido paterno
    public void establecerApellidoPaterno(String apellido) {
        apellidoPaterno = apellido;
    } // fin del método establecerApellidoPaterno

    // Devuelve el apellido paterno
    public String obtenerApellidoPaterno() {
        return apellidoPaterno;
    } // fin del método obtenerApellidoPaterno

    // Establece el número de seguro social
    public void establecerNumeroSeguroSocial(String nss) {
        numeroSeguroSocial = nss; // debe validar el formato del NSS si es necesario
    } // fin del método establecerNumeroSeguroSocial

    // Devuelve el número de seguro social
    public String obtenerNumeroSeguroSocial() {
        return numeroSeguroSocial;
    } // fin del método obtenerNumeroSeguroSocial

    // Establece el monto de ventas brutas
    public void establecerVentasBrutas(double ventas) {
        ventasBrutas = (ventas < 0.0) ? 0.0 : ventas;
    } // fin del método establecerVentasBrutas

    // Devuelve el monto de ventas brutas
    public double obtenerVentasBrutas() {
        return ventasBrutas;
    } // fin del método obtenerVentasBrutas

    // Establece la tarifa de comisión
    public void establecerTarifaComision(double tarifa) {
        tarifaComision = (tarifa > 0.0 && tarifa < 1.0) ? tarifa : 0.0; // tarifa válida entre 0 y 1
    } // fin del método establecerTarifaComision

    // Devuelve la tarifa de comisión
    public double obtenerTarifaComision() {
        return tarifaComision;
    } // fin del método obtenerTarifaComision

    // Establece el salario base
    public void establecerSalarioBase(double salario) {
        salarioBase = (salario > 0.0) ? salario : 0.0; // salario base no puede ser negativo
    } // fin del método establecerSalarioBase

    // Devuelve el salario base
    public double obtenerSalarioBase() {
        return salarioBase;
    } // fin del método obtenerSalarioBase

    // Método para calcular el salario total (salario base + comisión)
    public double obtenerSalarioTotal() {
        return salarioBase + (ventasBrutas * tarifaComision); // salario base + comisión
    }

    // Representación en formato de cadena (toString)
    public String toString() {
        return String.format("%s %s\nNSS: %s\nVentas Brutas: $%.2f\nSalario Base: $%.2f\nComisión: %.2f%%\nTotal: $%.2f",
                             primerNombre, apellidoPaterno, numeroSeguroSocial,
                             ventasBrutas, salarioBase, tarifaComision * 100, obtenerSalarioTotal());
    }
}

