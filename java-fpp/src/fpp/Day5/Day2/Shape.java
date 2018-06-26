package lesson7democode1;
interface ClosedCurve {
	 double computeArea();
	 
}

final class Triangle implements ClosedCurve {
	/* we require height <= base */
	final double base;
	final double height;
   /* we require side1 <= side2 <= side3 */
	final double side1, side2, side3;
Triangle(double base, double height){
		if (height <= base) {
			this.base = base;
			this.height = height;
		} 
		else {
			this.base = height;
			this.height = base;
		}
		side1 = height;
		side2 = base;
		side3 = Math.sqrt(base * base + height * height);

	}	
public double computeArea() {
		return (0.5 * base * height);
	}
}
final class Square implements ClosedCurve{
	final double side;
	Square(double side) {
		this.side = side;
	}
	public double computeArea() {
		return(side*side);
	}
}
final class Circle implements ClosedCurve{
	final double radius;
	Circle(double radius) {
		this.radius = radius;
	}
	public double computeArea() {
		return (Math.PI * radius * radius);
			}
		}

public class Shape {

	public static void main(String[] args) {

		Object[] objects = {new Triangle(5,5),
										 new Square(3),
										 new Circle(3)};
		//compute areas
		for(Object o : objects) {
			if(o instanceof Triangle) {
				System.out.println("The name of the class is : " + o.getClass().getSimpleName());
				Triangle t = (Triangle)o;
				System.out.println("Area of Triangle : " + t.computeArea()); 
			}
			if(o instanceof Square) {
				System.out.println("The name of the class is : " + o.getClass().getName());
				Square s = (Square)o;
				
System.out.println("Area of Rectangle : " + s.computeArea());
			}
if(o instanceof Circle) {
				Circle c = (Circle)o;
				System.out.println("The name of the class is : " + o.getClass());
System.out.println("Area of Circle : " + c.computeArea());
			}
		}
 }
}
