package lesson5b;
import java.time.LocalDate;


public class DeptEmployee {
	private String name;
	protected double salary;
	private LocalDate hireDate;
	
	
	public DeptEmployee(String Name, double Salary,LocalDate HireDate)
	{
		this.name=Name;
		this.salary=Salary;
		this.hireDate=HireDate;
	}
	
	public void setName(String Name)
	{
		this.name=Name;
	}
	public void SetHireDate (LocalDate InLocalDate)
	{
		this.hireDate =InLocalDate;
	}
	
	public double computeSalary()
	{
		return this.salary;
	}
}
