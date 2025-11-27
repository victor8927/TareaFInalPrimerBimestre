package guiandGraphics;
import javax.swing.*;
import java.awt.*;
import java.util.Random;

public class PanelDibujo extends JPanel {
    private MiRectangulo[] rectangulos;
    private MiOvalo[] ovalos;
    private Random rand = new Random();

    public PanelDibujo() {
        // Longitudes aleatorias entre 1 y 5 para cada tipo de figura
        int numRectangulos = rand.nextInt(5) + 1;
        int numOvalos = rand.nextInt(5) + 1;

        rectangulos = new MiRectangulo[numRectangulos];
        ovalos = new MiOvalo[numOvalos];

        // Llenamos los arreglos con figuras aleatorias
        for (int i = 0; i < numRectangulos; i++) {
            rectangulos[i] = new MiRectangulo(
                rand.nextInt(300), rand.nextInt(300), rand.nextInt(300), rand.nextInt(300),
                new Color(rand.nextInt(256), rand.nextInt(256), rand.nextInt(256)),
                rand.nextBoolean()
            );
        }

        for (int i = 0; i < numOvalos; i++) {
            ovalos[i] = new MiOvalo(
                rand.nextInt(300), rand.nextInt(300), rand.nextInt(300), rand.nextInt(300),
                new Color(rand.nextInt(256), rand.nextInt(256), rand.nextInt(256)),
                rand.nextBoolean()
            );
        }
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        // Dibujar rectángulos
        for (MiRectangulo rect : rectangulos) {
            g.setColor(rect.obtenerColor());
            if (rect.esRelleno()) {
                g.fillRect(rect.obtenerXSupIzq(), rect.obtenerYSupIzq(),
                           rect.obtenerAnchura(), rect.obtenerAltura());
            } else {
                g.drawRect(rect.obtenerXSupIzq(), rect.obtenerYSupIzq(),
                           rect.obtenerAnchura(), rect.obtenerAltura());
            }
        }

        // Dibujar óvalos
        for (MiOvalo ovo : ovalos) {
            g.setColor(ovo.obtenerColor());
            if (ovo.esRelleno()) {
                g.fillOval(ovo.obtenerXSupIzq(), ovo.obtenerYSupIzq(),
                           ovo.obtenerAnchura(), ovo.obtenerAltura());
            } else {
                g.drawOval(ovo.obtenerXSupIzq(), ovo.obtenerYSupIzq(),
                           ovo.obtenerAnchura(), ovo.obtenerAltura());
            }
        }
    }
}
	 
	 
	 