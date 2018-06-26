package lesson7democode;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;

class Employee {
	// instance fields

	private String name;
	private double salary;
	private Date hireDay;

	// constructor
	Employee(String aName, double aSalary, int aYear, int aMonth, int aDay) {
		name = aName;
		salary = aSalary;
		GregorianCalendar cal = new GregorianCalendar(aYear, aMonth - 1, aDay);
		hireDay = cal.getTime();
		
	}

	// instance methods
	public String getName() {
		return name;
	}

	public double getSalary() {
		return salary;
	}

	public String getHireDay() {
		SimpleDateFormat fmt = new SimpleDateFormat("dd-MMM-yyyy");
        String dateFormatted = fmt.format(hireDay);
		return dateFormatted ;
	}

	public void raiseSalary(double byPercent) {
		double raise = salary * byPercent / 100;
		salary += raise;
	}

	public void setBonus(double i) {
		// TODO Auto-generated method stub

	}

}

class Manager extends Employee {
	private double bonus;

	public Manager(String name, double salary, int year, int month, int day) {
		super(name, salary, year, month, day);
		bonus = 0;
	}

	@Override
	public double getSalary() {
		// no direct access to private variables of superclass
		double baseSalary = super.getSalary();
		return baseSalary + bonus;
	}
    @Override 
	public void setBonus(double b) {
		bonus = b;
	}
}

public class ManagerTest1 {
	// Inheritance Example
	public static void main(String[] args) {
		Manager boss = new Manager("Boss Guy", 80000, 2009, 12, 15);
		Employee[] staff = new Employee[3];

		staff[0] = boss; // Manager Instance
		staff[1] = new Employee("Jimbo", 50000, 2012, 10, 1);
		staff[2] = new Employee("Tommy", 40000, 2013, 3, 15);

		if (staff[0] instanceof Manager)
			staff[0].setBonus(5000.0);
		else
			staff[0].setBonus(0);

		// print names and salaries
		for (Employee e : staff) {
			System.out.println("Name: " + e.getName() + "\nSalary: "
					+ e.getSalary() + "\nHire Day :" + e.getHireDay());
			
		}
	}

}

