package fpp.class1;

<<<<<<< HEAD
public class Account {

=======
abstract public class Account {
	
>>>>>>> branch 'master' of https://github.com/rubenpazch/javaBasic.git
	//public final static String CHECKING = "checking";
	//public final static String SAVINGS = "savings";
	//public final static String RETIREMENT = "retirement";
<<<<<<< HEAD

	private final static double DEFAULT_BALANCE = 0.0;

	private double balance;
=======
	
	public final static double DEFAULT_BALANCE = 0.0;
	
	public double balance;
>>>>>>> branch 'master' of https://github.com/rubenpazch/javaBasic.git
	//private String acctType;
<<<<<<< HEAD
	private Employee employee;
	private AccountType oAccountType;

	Account(Employee emp, AccountType acctType, double balance){
		employee = emp;
		this.oAccountType =acctType;
=======
	public Employee employee;
	//private AccountType oAccountType;
	
	Account(Employee emp, double balance){
		this.employee = emp;
>>>>>>> branch 'master' of https://github.com/rubenpazch/javaBasic.git
		this.balance = balance;		
	}
<<<<<<< HEAD
	//ruben

	Account(Employee emp, AccountType acctType){
		this(emp,acctType,DEFAULT_BALANCE);
=======
		
	Account(Employee emp){
		this.employee = emp;
>>>>>>> branch 'master' of https://github.com/rubenpazch/javaBasic.git
	}
<<<<<<< HEAD

=======
		
>>>>>>> branch 'master' of https://github.com/rubenpazch/javaBasic.git
	public String toString() 
	{
<<<<<<< HEAD
		return "Account type = " + oAccountType + "\nCurrent bal = " + balance ;
=======
		return "Account type = " + GetAcctType() + "\nCurrent bal = " + balance ;
>>>>>>> branch 'master' of https://github.com/rubenpazch/javaBasic.git
	}
<<<<<<< HEAD

=======
>>>>>>> branch 'master' of https://github.com/rubenpazch/javaBasic.git
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
<<<<<<< HEAD

	public AccountType GetAcctType()
=======
	abstract public AccountType GetAcctType();
	/*abstract public AccountType GetAcctType()
>>>>>>> branch 'master' of https://github.com/rubenpazch/javaBasic.git
	{
		return this.oAccountType;
	}*/
	public double GetBalance()
	{
		return this.balance;
	}
}
