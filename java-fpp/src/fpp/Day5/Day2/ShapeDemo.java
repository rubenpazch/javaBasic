package interfacedemo;
interface Measurable
{
/** Returns the perimeter. */
public double getPerimeter();
/** Returns the area. */
public double getArea();
}
class Rectangle implements Measurable
{
private double myWidth;
private double myHeight;
public Rectangle(double width, double height)
{
myWidth = width;
myHeight = height;
}
public double getPerimeter()
{
return 2 * (myWidth + myHeight);
}
public double getArea()
{
return myWidth * myHeight;
}
}
class Circle implements Measurable
{
private double myRadius;
public Circle(double radius)
{
myRadius = radius;
}
public double getPerimeter()
{
return 2 * Math.PI * myRadius;
}
public double getArea()
{
return Math.PI * myRadius * myRadius;
}
}
public class ShapeDemo {
	
		public static void main(String[] args) {
		Rectangle obj = new Rectangle(10.5,15.7);
		Circle obj1 = new Circle(10);
		System.out.println("Area of a Rectangle :" + obj.getArea());
		System.out.println("Perimeter of a Rectangle :" + obj.getPerimeter());
		
		System.out.println("\nArea of a circle :" + obj1.getArea());
		System.out.println("Perimeter of a Circle :" + obj1.getPerimeter());
	}

}
