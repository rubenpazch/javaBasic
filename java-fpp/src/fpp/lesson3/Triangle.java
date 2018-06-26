package lesson3;

final public class Triangle {
	private double base;
	private double heigth;
	public Triangle()
	{
		
	}
	public Triangle(double base, double heigth)
	{
		this.base= base;
		this.heigth=heigth;
	}
	public double computeArea() {
		return (this.base*this.heigth)/2;
	}
	/**
	 * @return the base
	 */
	public double getBase() {
		return base;
	}

	/**
	 * @return the heigth
	 */
	public double getHeigth() {
		return heigth;
	}
	
}
