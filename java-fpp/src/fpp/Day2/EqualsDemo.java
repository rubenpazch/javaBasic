package lesson2democode;

public class EqualsDemo {

		public static void main(String[] args) {
			String obj1 = new String("xyz");
			String obj2 = new String("xyz");
			String obj3="xyz";
			System.out.println(obj1==obj3);
			if(obj1 == obj2) // Compares the memory location
			   System.out.println("obj1==obj2 is TRUE");
			else
			  System.out.println("obj1==obj2 is FALSE");
			System.out.println(obj1.equals(obj2)); // to compare the contents of 2 objects
			String s1 = "hai";
			String s2 = "hai";
			String s3 = "Welcome";
		    System.out.println("S1 and S2 are Equal or not : " + (s1==s2));
			System.out.println(s1.equals(s2));
			System.out.println("S1 and S2 are Equal or not : " + (s1==s3));
			String str1 = "Hello";
					String str2 = "Hello";
					String str3 = new String("Hello");
					String str4 = new String("Hello");
					System.out.println(str1==str2);
					System.out.println(str2==str3);	
					System.out.println(str3==str4);
					
		}
}
