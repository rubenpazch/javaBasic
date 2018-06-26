package lesson5b;

import java.time.LocalDate;
import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DeptEmployee pro1 = new Professor("carlos ramon", 1000, LocalDate.of(2015, 12, 31),12);
		DeptEmployee pro2 = new Professor("maria carmen", 3000, LocalDate.of(2016, 12, 31),15);
		DeptEmployee pro3 = new Professor("eduar jose", 2000, LocalDate.of(2001, 01, 01),17);
		
		DeptEmployee sec1 = new Secretary("elena de troya", 2000, LocalDate.of(2002, 01, 01),2);
		DeptEmployee sec2 = new Secretary("pedro picapiedras", 1000, LocalDate.of(2003, 01, 01),3);
		
		DeptEmployee [] arr = new DeptEmployee[5];
		arr[0]=pro1;
		arr[1]=pro2;
		arr[2]=pro3;
		
		arr[3]=sec1;
		arr[4]=sec2;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("see the sum of all Professor salary, sum of all secretary salary and all salaries in the department? (y/n) ");
		String answer = sc.next();
		if(answer.equalsIgnoreCase("y")){
			double total=0;
			for (DeptEmployee deptEmployee : arr) {
				total+=deptEmployee.computeSalary();
				 
			}
		
			System.out.println("total salary  "+total);
		}
		else {
			//do nothing..the application ends here
		}	
		
		
	}

}
