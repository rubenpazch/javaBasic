package lesson5;

public class Square extends Rectangle{
	private  double side;
	
	public Square (String Color,double Side)
	{
		super(Color, Side, Side);
		this.side = Side;
	}
	@Override
	public double CalculateArea()
	{
		return this.side=this.side*this.side;
	}
	@Override
	public double CalculatePerimeter()
	{
		return this.side*4;
	}
}
