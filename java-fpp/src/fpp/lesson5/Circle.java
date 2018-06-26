package lesson5;


public class Circle extends Shape {
	private double radius;
	
	public Circle(String Color, double Radius)
	{
		super(Color);
		this.radius=Radius;
	}
	@Override
	public double CalculateArea()
	{
		return this.radius=this.radius*Math.PI;
	}
	@Override
	public double CalculatePerimeter()
	{
		return this.radius*Math.PI*2;
	}
}
