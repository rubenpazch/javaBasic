package lesson5d;

public class HourlyEmployee extends Employee{
	private double wage;
	private double hours;
	
	public HourlyEmployee (double Wage, double Hours)
	{		
		this.hours=Hours;
		this.wage=Wage;
	}
	@Override
	double getPayment() {
		// TODO Auto-generated method stub
		return wage*hours;
	}
}
