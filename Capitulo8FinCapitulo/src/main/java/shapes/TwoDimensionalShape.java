package shapes;

import java.awt.Point;

public class TwoDimensionalShape extends Shape implements Transformable, Rotable {

    public TwoDimensionalShape(Point location, int dimension1, int dimension2) {
        super(location);
        int[] tempArray = {dimension1, dimension2};
        setDimensions(tempArray);
    }

    public int getHeight() { return dimensions[0]; }
    public int getWidth() { return dimensions[1]; }

    @Override
    public void setDimensions(int[] dim) {
        if (dim.length == 2) {
            super.setDimensions(dim);
        }
    }

    @Override
    public void switchDimensions() {
        int temp = dimensions[0];
        dimensions[0] = dimensions[1];
        dimensions[1] = temp;
    }

    @Override
    public void rotate() { switchDimensions(); }
    @Override
    public void rotateAntiClockwise() { switchDimensions(); }
    @Override
    public void rotate180() { }

    @Override
    public double getArea() { return 0; }
}
