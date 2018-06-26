package lesson8;

public class Person {
	private String lastName;
	private String firstName;
	private int age;
	private int size;
	private Person[] personas;
	// --------------------------------------------------------------
	public Person(String last, String first, int a) { // constructor
		lastName = last;
		firstName = first;
		age = a;
	}
	public Person () {}
	// --------------------------------------------------------------
	public String getLast() // get last name
	{
		return lastName;
	}
	@Override
	public String toString() {
		return "Person [lastName=" + lastName + "\n FirstName=" + firstName + "\nAge=" + age + "]";
	}
	public void add (String LastName, String FirstName, int Age) {
		if(size == personas.length) 
			resize();
		size++;
		personas[size].lastName = LastName;
		personas[size].firstName = firstName;
		personas[size].age = age;
		
	}
	private void resize(){
		System.out.println("resizing");
		int len = personas.length;
		int newlen = 2*len;
		Person[] temp = new Person[newlen];
		System.arraycopy(personas,0,temp,0,len);
		personas = temp;
	}
	public int Size() {
		return size;
	}
	
	public static void main (String [] args) {
		Person P = new Person();
		P.add("Pedro", "Rosas", 13);
		/*P.add("Carmen", "Palacios", 15);
		P.add("Rosario", "Alvarez", 21);*/
		System.out.println(P.toString()); 
	}
} // end class Person
