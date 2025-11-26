package shapes;

import java.awt.Graphics;
import java.awt.Point;

public class EquilateralTriangle extends TwoDimensionalShape implements Drawable{

    public EquilateralTriangle(Point location, int side) {
        super(location, side, side);
    }

    public int getSide() {
        return dimensions[0]; 
    }

    @Override
    public double getArea() {
        int s = getSide();
        return (Math.sqrt(3) / 4) * s * s;
    }

	@Override
	public void draw(Graphics g) {
		
	}

 
    

       
    }
