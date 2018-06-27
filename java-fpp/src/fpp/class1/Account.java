package fpp.class1;

abstract public class Account {
	
	//public final static String CHECKING = "checking";
	//public final static String SAVINGS = "savings";
	//public final static String RETIREMENT = "retirement";
	
	public final static double DEFAULT_BALANCE = 0.0;
	
	public double balance;
	//private String acctType;
	public Employee employee;
	//private AccountType oAccountType;
	
	Account(Employee emp, double balance){
		this.employee = emp;
		this.balance = balance;		
	}
		
	Account(Employee emp){
		this.employee = emp;
	}
		
	public String toString() 
	{
		return "Account type = " + GetAcctType() + "\nCurrent bal = " + balance ;
	}
	public void makeDeposit(double deposit) {
		this.balance+=deposit;
	}
	public boolean makeWithdrawal(double amount) {
		if(amount>balance)
		{
			return false;
		}			
		else
		{
			this.balance-=amount;
			return true;
		}		
	}
	abstract public AccountType GetAcctType();
	/*abstract public AccountType GetAcctType()
	{
		return this.oAccountType;
	}*/
	public double GetBalance()
	{
		return this.balance;
	}
}
