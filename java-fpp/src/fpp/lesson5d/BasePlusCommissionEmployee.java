package lesson5d;

public class BasePlusCommissionEmployee extends CommissionEmployee{
	private double baseSalary;
	
	public BasePlusCommissionEmployee(double GrossSales,double CommissionRate,double BaseSalary) {
		// TODO Auto-generated constructor stub
		super (GrossSales,CommissionRate);
		this.baseSalary=BaseSalary;
	}
	
	@Override
	double  getPayment()
	{
		return baseSalary*(this.grossSales*this.commissionRate);
	}
}
