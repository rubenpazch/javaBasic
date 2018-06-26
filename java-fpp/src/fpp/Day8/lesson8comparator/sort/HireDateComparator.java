package lesson8comparator.sort;


import java.util.Comparator;

public class HireDateComparator implements Comparator<Employee> {
	//compareTo in this case is not consistent with equals
	public int compare(Employee e1, Employee e2) {
		return e1.getHireDate().compareTo(e2.getHireDate());
	}
	
}
