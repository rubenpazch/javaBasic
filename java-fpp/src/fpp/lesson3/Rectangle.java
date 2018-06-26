package lesson3;

final public class Rectangle {
	
	private double width;
	private double height;
	
	public Rectangle()
	{
		
	}
	public Rectangle(double width, double height)
	{
		this.width=width;
		this.height=height;
	}
	public double computeArea() {
		
		return this.width*this.height;
	}
	/**
	 * @return the width
	 */
	public double getWidth() {
		return width;
	}
	/**
	 * @return the length
	 */
	public double getLength() {
		return height;
	}

}
