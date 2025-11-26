package inheritancePolymorphismandInterfaces;

import java.awt.Graphics;
import java.awt.Point;

public class Circle extends OneDimensionalShape {

	public Circle(Point Location, int height) {
		super(Location, height);
	}
	
	
    @Override
    public double getArea() {
    	return(Math.PI * (Math.pow(this.getDimension(),2.0)));
    }


	@Override
	public void draw(Graphics g) 
	{
		g.fillOval(getLocation() .x, getLocation() .y, getDimension(), getDimension());
	}

}

