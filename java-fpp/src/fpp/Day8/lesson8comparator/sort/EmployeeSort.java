package lesson8comparator.sort;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class EmployeeSort {

	public static void main(String[] args) {
		new EmployeeSort();

	}
	public EmployeeSort() {
		Employee[] empArray =
			{new Employee("George", 40000, 1996,11,5),
			 new Employee("Dave", 50000, 2000, 1, 3),
			 new Employee("Richard", 45000, 2001, 2, 7)};
		Employee e1 = new Employee("George", 40000, 1996,11,5);
		Employee e2 = new Employee("George", 50000, 1996,11,5);
		List<Employee> empList = Arrays.asList(empArray);
		//by name
		NameComparator nameComp = new NameComparator();
		Collections.sort(empList, nameComp);
		System.out.println(empList);
		int res = nameComp.compare(e1, e2);
		boolean re = e1.equals(e2);
		System.out.println("Name Comparator :" + re);
		System.out.println();
		//by salary
		SalaryComparator salaryComp = new SalaryComparator();
		Collections.sort(empList, salaryComp);
		System.out.println(empList);
		System.out.println();
		//by hire date
		HireDateComparator hireComp = new HireDateComparator();
		Collections.sort(empList, hireComp);
		System.out.println(empList);
		System.out.println();
		
	}

}
