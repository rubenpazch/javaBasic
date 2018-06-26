// Declare a Class with either default or public modifier
public class Course {
	 // instance fields
	private String cname;
	private String faculty;
	private int size;
	// Constructors - Default - Without argument
	// To initialize values to your data members
	 public  Course(){
		cname = null;
		faculty=null;
		size=0;
	}
	// Parameterized Constructor
	// this indicates the current object, invoke other constructors
	public Course(String cname, String faculty, int cap){
		this.cname=cname;
		this.faculty = faculty;
		size = cap;
	}
	
	public Course(String cname,String faculty){
		// Call constructor using this - that will be your first line of code
	//	System.out.println("Parameterized Constructor");
		this(cname,faculty,26);
	}
	
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public String getFaculty() {
		return faculty;
	}
	public void setFaculty(String faculty) {
		this.faculty = faculty;
	}
	public int getSize() {
		return size;
	}
	public void setSize(int size) {
		this.size = size;
	}
	// Behaviour
	public void display(){
		System.out.println("Course Name :" + cname);
		System.out.println("Faculty Name :" + faculty);
		System.out.println("Current Size :" + size);
	}
	
	

}
