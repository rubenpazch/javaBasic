package lesson5;

public class Prog1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shape rc1 = new Rectangle("red", 100, 200);
		Shape rc2 = new Rectangle("blue", 30, 60);
		Shape rc3 = new Rectangle("orange", 10, 90);
		Shape rc4 = new Rectangle("yellow", 30, 190);
		Shape rc5 = new Rectangle("black", 50, 190);
		
		Shape cc1 = new Circle("purple", 10);
		Shape cc2 = new Circle("purple", 30);
		Shape cc3 = new Circle("purple", 40);
		Shape cc4 = new Circle("purple", 50);
		Shape cc5 = new Circle("purple", 60);
		
		Shape sq1 = new Square("brown", 20);
		Shape sq2 = new Square("brown", 30);
		Shape sq3 = new Square("brown", 40);
		Shape sq4 = new Square("brown", 50);
		Shape sq5 = new Square("brown", 60);
			
		
		Shape[] arr = new Shape [15];
		arr[0]=rc1;
		arr[1]=rc2;
		arr[2]=rc3;
		arr[3]=rc4;
		arr[4]=rc5;
		
		arr[5]=cc1;
		arr[6]=cc2;
		arr[7]=cc3;
		arr[8]=cc4;
		arr[9]=cc5;
		
		arr[10]=sq1;
		arr[11]=sq2;
		arr[12]=sq3;
		arr[13]=sq4;
		arr[14]=sq5;
		
		printTotal(arr);
	}
	public static void printTotal(Shape[] shapes)
	{ 
		// Implement your code
		double total=0;
		for (Shape shape : shapes) {
			total =+ shape.CalculateArea();
		}
		System.out.println("totall all areas : " + total );
	}
}
