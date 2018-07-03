package fpp.class1;

public class RetirementAccount extends Account {

	public RetirementAccount(Employee emp, double balance) {
		super(emp, balance);
		// TODO Auto-generated constructor stub
	}

	public RetirementAccount(Employee emp) {
		super(emp);
		// TODO Auto-generated constructor stub
	}

	@Override
	public AccountType GetAcctType() {
		// TODO Auto-generated method stub
		return AccountType.RETIREMENT;
	}

}
