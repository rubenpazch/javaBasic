package lesson3;
import java.math.*;

final public class Circle {
	private double radius;
	
	public Circle()
	{
		
	}
	public Circle(double radius)
	{
		this.radius=radius;
	}
	/**
	 * @return the radius
	 */
	public double getRadius() {
		return radius;
	}
	
	public double computeArea() {
		
		return this.radius*this.radius*Math.PI;
	}
}
