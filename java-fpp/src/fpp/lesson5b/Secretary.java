package lesson5b;

import java.time.LocalDate;

public class Secretary extends DeptEmployee{
	
	private double overtimeHours;

	public Secretary(String Name,double Salary, LocalDate HireDate, double OvertimeHours)
	{
		super(Name,Salary,HireDate);
		this.overtimeHours=OvertimeHours;
	}
	/**
	 * @return the overtimeHours
	 */
	public double getOvertimeHours() {
		return overtimeHours;
	}

	/**
	 * @param overtimeHours the overtimeHours to set
	 */
	public void setOvertimeHours(double overtimeHours) {
		this.overtimeHours = overtimeHours;
	}
	
	@Override
	public double computeSalary()
	{
		return 12*getOvertimeHours()+salary;
	}
	

}
