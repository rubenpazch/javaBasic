package lesson7democode;
 class student
{
	protected int mark = 80;
	public String bonus;
	private int id = 9860;
	void display()
	{
	System.out.println("Your Score is " +  mark);
	System.out.println("Normal Student");
	}
	int getid()
	{
		return id;
	}
    
 }
class student1 extends student
{
	int bonus;
	void get(int x)
	  {
		bonus = x;
		System.out.println("Your Score is " + (bonus + mark));
		
		System.out.println("Excellent Student");	
		System.out.println(getid());
		}
			
	}

public class SimpleStudent {

	
	public static void main(String[] args) {
		student1 s1 = new student1();
		System.out.println("Student1 Object");
		s1.display();
		//s1.get(10);
					
		student s2=s1;//upcasting
		System.out.println("Student2 Object");
		s2.display();
		System.out.println("Student2 Object calling get method by casting");
		((student1) s2).get(12);
		System.out.println(s2 instanceof student);
			
	}

}
