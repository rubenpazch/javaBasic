package lesson3;

public class prog3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee oEmployee1 = new Employee("Carlos", "pibe valderrama", 5000, 2018, 10, 27);		
		Employee oEmployee2 = new Employee("pedro", "pibe valderrama", 7000, 2017, 11, 14);
		Employee oEmployee3 = new Employee("ramon", "pibe valderrama", 2000, 2016, 9, 11);
		
		System.out.println(oEmployee1.toString());
		System.out.println(oEmployee2.toString());
		System.out.println(oEmployee3.toString());
		
		Account Account1 = new Account(oEmployee1, AccountType.CHECKING,300);		
		Account Account2 = new Account(oEmployee1, AccountType.SAVINGS,300);
		Account Account3 = new Account(oEmployee1, AccountType.RETIREMENT,300);
		
		Account Account4 = new Account(oEmployee2, AccountType.CHECKING,300);		
		Account Account5 = new Account(oEmployee2, AccountType.SAVINGS,300);
		Account Account6 = new Account(oEmployee2, AccountType.RETIREMENT,300);
		
		Account Account7 = new Account(oEmployee3, AccountType.CHECKING,300);		
		Account Account8 = new Account(oEmployee3, AccountType.SAVINGS,300);
		Account Account9 = new Account(oEmployee3, AccountType.RETIREMENT,300);
	
		Account1.makeDeposit(100);
		System.out.println(oEmployee1.toString() + ""+ Account1.toString());
		Account1.makeWithdrawal(30);
		System.out.println(oEmployee1.toString() + ""+ Account1.toString());
		Account2.makeDeposit(30);
		System.out.println(oEmployee1.toString() + ""+ Account2.toString());
		Account2.makeWithdrawal(60);
		System.out.println(oEmployee1.toString() + ""+ Account2.toString());
		
		/*
		Employee[] array1 = new Employee[1] ; 
		array1=oEmployee;
				
		for (Employee employ : array1) {
			//System.out.println("Nombre: "+employ.getName()+" NickName: "+employ.getNickName()+" Salario: "+employ.getSalary()+" Hire Day: "+employ.getHireDay());
		}
		*/
		
	}

}
