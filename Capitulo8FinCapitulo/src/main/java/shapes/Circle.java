package shapes;

import java.awt.Graphics;
import java.awt.Point;

public class Circle extends OneDimensionalShape implements Drawable {

	public Circle(Point Location, int height) {
		super(Location, height);
	}
	
	
    @Override
    public double getArea() {
    	return(Math.PI * (Math.pow(this.getDimension(),2.0)));
    }


	@Override
	public void draw(Graphics g) {
		// TODO Auto-generated method stub
		
	}

}
