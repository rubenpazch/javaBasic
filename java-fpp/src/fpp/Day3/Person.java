
public class Person {

	private String name;
	private String gender;
	private int age;
	
  public Person(){ // Default Constructor
		name = null;
		gender = null;
		age=0;
	}
 
  public Person(String name, String gender, int age){
	  this.name =name;
	  this.gender= gender;
	  this.age=age;
  }

  public void diplayPerson(){
	  System.out.println(name + " " + gender + " " + age);
  }

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public String getGender() {
	return gender;
}


public int getAge() {
	return age;
}

public void setAge(int age) {
	this.age = age;
}
  
 }
