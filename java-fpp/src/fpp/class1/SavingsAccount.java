package fpp.class1;

public class SavingsAccount extends Account {
	
	
	public SavingsAccount(Employee emp, double balance) {
		super(emp, balance);
		// TODO Auto-generated constructor stub
	}

	public SavingsAccount(Employee emp) {
		super(emp);
		// TODO Auto-generated constructor stub
	}

	@Override
	public AccountType GetAcctType() {
		// TODO Auto-generated method stub
		return AccountType.SAVINGS;
	}

}
