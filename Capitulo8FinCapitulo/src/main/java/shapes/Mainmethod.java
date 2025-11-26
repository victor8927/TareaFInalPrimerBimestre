package shapes;

import java.awt.Point;

public class Mainmethod extends OneDimensionalShape{

	
	public Mainmethod(Point location, int dimension) {
		super(location, dimension);
		// TODO Auto-generated constructor stub
	}

	public int getDimension() {
		return dimensions[0];
	}
	
	@Override
	public void setDimensions (int [] dim)
	{
		if (dim.length == 1) {
			super.setDimensions(dim);
		}
	}

	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return 0;
	}	
	}
	

