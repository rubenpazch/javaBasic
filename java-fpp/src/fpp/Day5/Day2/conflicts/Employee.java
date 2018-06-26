package interfacedemo.conflicts;

public class Employee implements Person, Identified{
	String Name;
	int Id;
	Employee(String Name)
	{
		this.Name = Name;
		
	}
	public String toString() {
		return getName() + " " + getId();
	}
	public String getName()
	{
		return Name;
	}
	// Rule 2 : The specific interface is inherited by the class 
	public int getId() { return Identified.super.getId(); 
	}
	
	public static void main(String args[]){
		Employee e1 = new Employee("Renuka");
		Employee e2 = new Employee("Tom");
		System.out.println(e1);
		System.out.println(e2);
	}
	
}

