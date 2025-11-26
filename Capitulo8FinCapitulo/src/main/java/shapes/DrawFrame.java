package shapes;

import java.awt.Graphics;
import java.awt.Point;

import javax.swing.JFrame;

public class DrawFrame extends JFrame 
{
	@Override
	public void paint(Graphics g)
	{
		super.paint(g);
		Shape[] shapes = {
		
		new Rectangle(new Point (50,150), 25, 50),
		new Circle(new Point (175,100),100),
		new EquilateralTriangle(new Point(250,80), 80) 
		};
		
		for (Shape s : shapes) {
		    if (s instanceof Drawable d) {
		        d.draw(g);
		    }
		}
	}
		
		
		
	public static void main(String[] args)
	{
		DrawFrame frame = new DrawFrame();
		frame.setTitle("Lots of shapes....");
		frame.setSize(400,400);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
	
	
}
