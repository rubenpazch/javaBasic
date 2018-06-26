package Day7;

/*
 * Sol 3
 * Thread safe
 * Eager initialization
 */
enum  TestSingleton{
	   INSTANCE; // It is a not a keyword. Works like a private constructor.
	int i;
	public void printHello() {
   		System.out.println("i = " + i);
	   }
}

//See how it works
public class SingletonAsEnum {
	   public static void main(String[] args) {
		   TestSingleton ob1 = TestSingleton.INSTANCE;
		   ob1.i = 10;
	  
		   TestSingleton ob2 = TestSingleton.INSTANCE;
		   ob2.i = 15;
		  
		   TestSingleton ob3 = TestSingleton.INSTANCE;
		   ob3.i = 20;
		 	  ob1.printHello();
			 ob2.printHello();
 			ob3.printHello();

	   	   
	}
}