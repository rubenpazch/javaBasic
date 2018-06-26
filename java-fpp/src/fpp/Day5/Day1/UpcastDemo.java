package lesson7democode.casting;


class Employee {
	private String name = "Unknown";

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}
}

class EmpUtil {
	public static void printName(Employee emp) {
		// Get the name of employee
		String name = emp.getName();
		// Print employee name
		System.out.println(emp.getClass().getSimpleName() +":"+ name);
	}
}

class Manager extends Employee {
	double bonus;

	public double getBonus() {
		return bonus;
	}

	public void setBonus(double bonus) {
		this.bonus = bonus;
	}
	
}

public class UpcastDemo {
	public static void main(String[] args) {
		Employee emp = new Employee();
		Employee emp1 = new Employee();
		emp.setName("Ken Wood");
		Manager mgr = new Manager();
		mgr.setName("Ken Furr"); // Inheritance of setName() at work
		mgr.setBonus(5000);
		System.out.println("Bonus :" + mgr.getBonus());
		
		// Print names
		EmpUtil.printName(emp);
		EmpUtil.printName(mgr); // Upcasting at work
		
		// Down casting
		
		Employee e1 = new Manager();
		e1.setName("Hari");
		e1.getName();
		((Manager)e1).setBonus(3500);
		((Manager)e1).getBonus();
		
	
	}
}
