package fpp.class5;

import java.util.Comparator;
import java.util.Date;

public class HireDateComparator implements Comparator<Employee>{
	
	public int compare(Employee e1, Employee e2) {
	
		Date hireDate1 = e1.getHireDate();
		Date hireDate2 = e2.getHireDate();	
		
		//now name1 equals name2
		if(hireDate1.compareTo(hireDate2) < 0) {
			return -1;
		}else if(hireDate1.compareTo(hireDate2) > 0) {
			return 1;
		}
		else {
			return 0;
		}
		
	}
}
