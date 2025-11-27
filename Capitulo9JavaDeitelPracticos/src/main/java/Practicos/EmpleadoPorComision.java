package Practicos;

// Fig. 9.4: EmpleadoPorComision.java
// La clase EmpleadoPorComision representa a un empleado por comisión.

public class EmpleadoPorComision {
    private String primerNombre;
    private String apellidoPaterno;
    private String numeroSeguroSocial;
    private double ventasBrutas; // ventas semanales totales
    private double tarifaComision; // porcentaje de comisión

    // Constructor con cinco argumentos
    public EmpleadoPorComision(String nombre, String apellido, String nss,
                                double ventas, double tarifa) {
        primerNombre = nombre;
        apellidoPaterno = apellido;
        numeroSeguroSocial = nss;
        establecerVentasBrutas(ventas); // valida y almacena las ventas brutas
        establecerTarifaComision(tarifa); // valida y almacena la tarifa de comisión
    } // fin del constructor de EmpleadoPorComision con cinco argumentos

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
        numeroSeguroSocial = nss; // Se puede agregar validación del NSS aquí
    } // fin del método establecerNumeroSeguroSocial

    // Devuelve el número de seguro social
    public String obtenerNumeroSeguroSocial() {
        return numeroSeguroSocial;
    } // fin del método obtenerNumeroSeguroSocial

    // Establece el monto de ventas totales del empleado por comisión
    public void establecerVentasBrutas(double ventas) {
        ventasBrutas = (ventas < 0.0) ? 0.0 : ventas; // Si las ventas son negativas, se asigna 0
    } // fin del método establecerVentasBrutas

    // Devuelve el monto de ventas totales del empleado por comisión
    public double obtenerVentasBrutas() {
        return ventasBrutas;
    } // fin del método obtenerVentasBrutas

    // Establece la tarifa del empleado por comisión
    public void establecerTarifaComision(double tarifa) {
        tarifaComision = (tarifa > 0.0 && tarifa < 1.0) ? tarifa : 0.0; // Tarifa debe estar entre 0 y 1
    } // fin del método establecerTarifaComision

    // Devuelve la tarifa del empleado por comisión
    public double obtenerTarifaComision() {
        return tarifaComision;
    } // fin del método obtenerTarifaComision

    // Calcula el salario del empleado por comisión
    public double ingresos() {
        return tarifaComision * ventasBrutas; // Comisión basada en ventas
    } // fin del método ingresos

    // Devuelve representación String del objeto EmpleadoPorComision
    public String toString() {
        return String.format("%s: %s %s\n%s: %s\n%s: %.2f\n%s: %.2f",
                             "Empleado por comisión", primerNombre, apellidoPaterno,
                             "Número de Seguro Social", numeroSeguroSocial,
                             "Ventas Brutas", ventasBrutas,
                             "Tarifa de Comisión", tarifaComision);
    } // fin del método toString
}

 