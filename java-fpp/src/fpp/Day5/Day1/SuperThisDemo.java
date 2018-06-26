package lesson7democode;
class First
{
	String name;
	int score;
	First()
	{
		System.out.println("Super Class Constructor");
	}
	 First(String s, int sc)
	{
		name = s;
		score = sc;
		
	}
	 void print()
	 {
		 System.out.println("Name : " + name);
		 System.out.println("Score :" + score);
		 
	 }
}

class Second extends First
{
	int ec;
	Second()
	{
		System.out.println("Sub Class Constructor");
	}
	Second(String s1, int m1, int ec)
	{
		super(s1,m1);	
		this.ec=ec;
						
	}
	public void print()
	{
		super.print();
		System.out.println("Extra Score : "+ec);
		System.out.println("Total Score : " + (score + ec));
	}
}

public class SuperThisDemo {
 // Demo code to call constructors and other methods using super
	public static void main(String[] args) {
		Second s = new Second();
		First ft = new First("Banu",80);
		ft.print();
		Second sd = new Second("Aruna", 85, 10);
        sd.print();
	}
}
