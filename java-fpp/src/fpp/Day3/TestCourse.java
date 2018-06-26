
public class TestCourse {

	public static void main(String[] args) {
		// Create a Object using new Keyword
		Course c1 = new Course(); // Default Constructor
		// Invoke a method thru object
	//	c1.display();
		Course c2 = new Course("FPP","Renuka",24); // Parameterized Constructor
	//	c2.display();
		Course c3 = new Course("MPP","Paul");
	//	c3.display();
       // Array of objects
		
		Course[] courses = new Course[3];
		courses[0] = c1;
		c1.setCname("WAP");
		c1.setFaculty("Asaad");
		c1.setSize(25);
		courses[1] = c2;
		courses[2] = c3;
		c2.setSize(30);
		Course c4 = c1;
		int tot = 0;
		for(Course x : courses){
			tot+=x.getSize();
			x.display();
		}
		System.out.println("Total Students in this block: " + tot);
		
	}

}
