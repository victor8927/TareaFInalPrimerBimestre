package shapes;

import java.awt.Graphics;
import java.awt.Point;

public class Rectangle extends TwoDimensionalShape implements Drawable {

    public Rectangle(Point location, int height, int width) {
        super(location, height, width);
    }

    @Override
    public double getArea() {
        return this.getHeight() * this.getWidth();
    }

    @Override
    public void draw(Graphics g) {
        g.fillRect(
            getLocation().x,
            getLocation().y,
            getWidth(),
            getHeight()
        );
    }
}
