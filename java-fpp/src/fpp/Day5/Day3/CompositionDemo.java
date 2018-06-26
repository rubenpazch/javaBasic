package lesson7democode1;

class NameAndAddress
{
private String name;
private String address;
private int zipCode;
//public int k=10;
public NameAndAddress(String nm, String add, int zip)
{
name = nm;
address = add;
zipCode = zip;
}
public void display()
{
System.out.println(name);
System.out.println(address);
System.out.println(zipCode);
}
}
class School
{
private NameAndAddress nameAdd;
private int enrollment;
public School(String name, String add, int zip, int enrolled)
{
nameAdd = new NameAndAddress(name, add, zip);
enrollment = enrolled;
}
public void display()
{
System.out.println("The school information:");
nameAdd.display();
System.out.println("Enrollment ID is " + enrollment);
}
}
public class CompositionDemo {
		public static void main(String[] args) {
			School mySchool = new School
					("Fairfield Elementary",
					"2000 North Court", 52556, 3501);
					mySchool.display();
	}

}
