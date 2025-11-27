package guiandGraphics;

enum LuzSemaforo {
    ROJO(60),
    VERDE(45),
    AMARILLO(5);

    private int duracion;

    LuzSemaforo(int duracion) {
        this.duracion = duracion;
    }

    public int getDuracion() {
        return duracion;
    }
}


