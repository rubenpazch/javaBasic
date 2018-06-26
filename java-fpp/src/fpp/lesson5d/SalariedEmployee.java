package lesson5d;

public class SalariedEmployee extends Employee{
	private double weeklySalary;
	
	private  SalariedEmployee(double WeeklySalary) {
		// TODO Auto-generated method stub
		this.weeklySalary=WeeklySalary;
	}
	
	@Override
	double getPayment() {
		// TODO Auto-generated method stub
		return weeklySalary;
	}
	
}
