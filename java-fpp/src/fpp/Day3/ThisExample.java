package lesson3democode;

class Rectangle {
    private int x, y;
    private int width, height;
        
    public Rectangle() {
    	//x=10; First statement should be constructor calling
    	this(15, 10, 15, 10);
       // Rectangle(10,5,10,5);//Constructor called only using this.
        
    }
    public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	public Rectangle(int x, int y, int width, int height) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }
    
    public void display()
    {
             System.out.print(" \nThe sides of Rectangle is " + x + "  " + y + "  "+ width + "  "+ height);	
    	
    }
}
public class ThisExample {
	// Demo code for calling constructor using this.
	public static void main(String args[]) {
		Rectangle r1 = new Rectangle();
		r1.display();
		Rectangle r2 = new Rectangle(5, 10, 5, 10);
		r2.display();
	}
}
