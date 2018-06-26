package fpp.class1;

import java.time.LocalDate;

public class Employee {

	private Account savingsAcct;
	private Account checkingAcct;
	private Account retirementAcct;

	private String name;
	private LocalDate hireDate;

	public Employee(String name, int yearOfHire,int monthOfHire, int dayOfHire){
	
		this.name = name;
		this.hireDate = LocalDate.of(yearOfHire, monthOfHire, dayOfHire);
		//Replace these lines with LocalDate references
		//GregorianCalendar cal =
		//new GregorianCalendar(yearOfHire,monthOfHire-1,dayOfHire);
		//hireDate = cal.getTime();
	}
		
	public void createNewChecking(double startAmount) {
		checkingAcct = new Account(this, AccountType.CHECKING,startAmount);
		
	}
	public void createNewSavings(double startAmount) {
		savingsAcct = new Account(this, AccountType.SAVINGS,startAmount);
	}
	public void createNewRetirement(double startAmount) {
		retirementAcct = new Account(this, AccountType.RETIREMENT,startAmount);
	}
	public void deposit(AccountType acctType, double amt){
		
		if(AccountType.CHECKING==acctType)
		{
			checkingAcct.makeDeposit(amt);
		}
		else if (AccountType.SAVINGS==acctType)
		{
			savingsAcct.makeDeposit(amt);
		}else
		{
			retirementAcct.makeDeposit(amt);
		}				
		
	}
	public boolean withdraw(AccountType acctType, double amt){
		
		switch (acctType) {
		case CHECKING:
			return checkingAcct.makeWithdrawal(amt);
		case SAVINGS:
			return savingsAcct.makeWithdrawal(amt);			
		case RETIREMENT:
			retirementAcct.makeWithdrawal(amt);
		default:
			return false;
		}
		
	}
	public String getFormattedAcctInfo() {
		if(retirementAcct==null)
		{
			return "ACCOUNT INFO FOR  " +this.name + " : \n" +  checkingAcct +"\n"+ savingsAcct +"\n";			
		}
		else if (savingsAcct==null)
		{
			return "ACCOUNT INFO FOR  " +this.name + " : \n\n" + checkingAcct +"\n"+ retirementAcct +"\n";
		}
		else if (checkingAcct==null)
		{
			return "ACCOUNT INFO FOR  " +this.name + " : \n\n" + savingsAcct +"\n"+ retirementAcct +"\n";
		}
		else
		{
			return "ACCOUNT INFO FOR  " +this.name + " : \n\n" + checkingAcct +"\n"+ savingsAcct+"\n"+ retirementAcct +"\n";
		}
	}
}