package lesson5d;

public class CommissionEmployee extends Employee{
	protected double grossSales;
	protected double commissionRate;
	
	public CommissionEmployee(double GrossSales,double CommissionRate) {
		// TODO Auto-generated constructor stub
		this.grossSales=GrossSales;
		this.commissionRate=CommissionRate;
	}
	
	@Override
	double  getPayment()
	{
		return grossSales*commissionRate;
	}
}
