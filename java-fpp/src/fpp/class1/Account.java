package fpp.class1;

public class Account {

	//public final static String CHECKING = "checking";
	//public final static String SAVINGS = "savings";
	//public final static String RETIREMENT = "retirement";

	private final static double DEFAULT_BALANCE = 0.0;

	private double balance;
	//private String acctType;
	private Employee employee;
	private AccountType oAccountType;

	Account(Employee emp, AccountType acctType, double balance){
		employee = emp;
		this.oAccountType =acctType;
		this.balance = balance;		
	}
	//ruben

	Account(Employee emp, AccountType acctType){
		this(emp,acctType,DEFAULT_BALANCE);
	}

	public String toString() 
	{
		return "Account type = " + oAccountType + "\nCurrent bal = " + balance ;
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

	public AccountType GetAcctType()
	{
		return this.oAccountType;
	}
	public double GetBalance()
	{
		return this.balance;
	}
}
