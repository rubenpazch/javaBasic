package lesson5;

public class Rectangle extends Shape{
	private double width;
	private double height;
	
	public Rectangle(String Color, double Width,double Height)
	{
		super(Color);
		this.width=Width;
		this.height=Height;
	}
	@Override
	public double CalculateArea()
	{
		return this.height*this.width;
	}
	@Override
	public double CalculatePerimeter()
	{
		return 2*this.width+2*this.height;
	}
}
