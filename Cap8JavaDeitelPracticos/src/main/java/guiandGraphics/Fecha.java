package guiandGraphics;

public class Fecha {
    private int mes;
    private int dia;
    private int anio;

    public Fecha(int mes, int dia, int anio) {
        this.mes = comprobarMes(mes);
        this.dia = comprobarDia(dia);
        this.anio = anio;
    }

    private int comprobarMes(int mesPrueba) {
        if (mesPrueba >= 1 && mesPrueba <= 12) {
            return mesPrueba;
        }
        return 1; // Mes inválido
    }

    private int comprobarDia(int diaPrueba) {
        int diasPorMes[] = { 0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
        if (diaPrueba > 0 && diaPrueba <= diasPorMes[mes]) {
            return diaPrueba;
        }
        return 1; // Día inválido
    }

    // Método para incrementar el día
    public void siguienteDia() {
        int diasPorMes[] = { 0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
        dia++;
        if (dia > diasPorMes[mes]) {
            dia = 1;
            mes++;
            if (mes > 12) {
                mes = 1;
                anio++;
            }
        }
    }

    public String toString() {
        return mes + "/" + dia + "/" + anio;
    }
}

