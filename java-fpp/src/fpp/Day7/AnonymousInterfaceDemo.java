package Day7;
interface Printable{
	void print(String msg);
	String Concate(String s1, String s2);
}
abstract class test{
	abstract void display();
	test()
	{
		System.out.println("Test Demo");
	}
	void print(String arg)
	{
		System.out.println("Hello " + arg);
	}
}

public class AnonymousInterfaceDemo {

	public static void main (String[] args){
		// Anonymous Interface Implementation
		Printable printer = new Printable() {
			public void print(String msg) {
				System.out.println(msg);
			}
			public String Concate(String s1, String s2)
			{
				return s1 + " " + s2;
			}
		};
		printer.print("Anonymous Interface Demo");
		System.out.println(printer.Concate("Inner", "Class"));
		test obj = new test(){
			void display()
			{
				System.out.println("Anonymous Abstarct Demo");
			}

		};
		obj.display();
		obj.print("Renuka");
	}
}
