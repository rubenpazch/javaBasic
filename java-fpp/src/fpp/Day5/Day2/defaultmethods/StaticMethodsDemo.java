package interfacedemo.defaultmethods;
interface FPP
{
  static String CourseID(){
       return "CS390";
}
}

public class StaticMethodsDemo {
	public static void main(String args[])
	{
		System.out.println("Course ID for FPP is : " + FPP.CourseID());
	}
}
