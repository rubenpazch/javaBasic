package fpp.class3;

public class Main {
	public static void main (String [] args) {
		System.out.println("");
	}
}

public class MyClass {
	private String s ="hello";
	public static void main (String [] args) {
		new MyClass();
		
	}
	public MyClass() {
		// TODO Auto-generated constructor stub
		
		MyInnerClass a = new MyInnerClass();
		System.out.println(a.intval); 
		a.innerMethod();
	}
	private class MyInnerClass{
		private int intval=3;
		
		private void innerMethod() {
			System.out.println(s);
		}
	}
}
