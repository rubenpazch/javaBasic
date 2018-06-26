package fpp.class1;
import java.util.Scanner;
import fpp.class1.*;

public class Main {
	
	
	public static void main(String[] args) {
		
		Employee e1 = new Employee("carlos", 2010, 12, 13);
		Employee e2 = new Employee("pedro", 2010, 12, 13);
		Employee e3 = new Employee("roberto", 2010, 12, 13);	
		
		e1.createNewChecking(100);
		e2.createNewChecking(500);
		e3.createNewChecking(600);
		
		System.out.println(e1.getFormattedAcctInfo());
		
		e1.createNewRetirement(30);
		e2.createNewRetirement(40);
		e3.createNewRetirement(50);
		
		System.out.println(e1.getFormattedAcctInfo());
		
		e1.createNewSavings(5);
		e2.createNewSavings(12);
		e3.createNewSavings(14);
		
		System.out.println(e1.getFormattedAcctInfo());
		
	}
	
}
