package lesson7democode.temp;


public class InstanceofDemo {
		public static void main(String[] args) {
		// Checking instanceof for String class
		String s1 = "Hello";
		String s2 = null;
		if (s1 instanceof String)
			System.out.println("True");
		else
			System.out.println("False");

		if (s2 instanceof java.lang.String)
			System.out.println("True");
		else
			System.out.println("False");
		
		// Checking instanceof for Number class
		
		Object[] stuff = {"Java", 10.11,12,13,16.11,20,"Hi"};
		double sum = 0;
		for(int i=0;i<stuff.length;i++){
		if(stuff[i] instanceof Number) // checking instance
		{
		Number next = (Number)stuff[i]; // Down casting
		sum+=next.doubleValue();
		}
		}
		System.out.println("Sum of Doubles = " + sum);

	}

}
