package fpp.class1;

public class CheckingAccount extends Account {
	
	public CheckingAccount(Employee emp, double balance) {
		super(emp, balance);
		// TODO Auto-generated constructor stub
	}

	public CheckingAccount(Employee emp) {
		super(emp);
		// TODO Auto-generated constructor stub
	}

	@Override
	public AccountType GetAcctType() {
		// TODO Auto-generated method stub		
		return AccountType.CHECKING;
	}

}
