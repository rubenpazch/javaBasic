package Day8.lesson8comparator.InClassDemo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestShopping 
{	public static void main(String[] args) {
	// TODO Auto-generated method stub

	List<Shopping> list = new ArrayList<>();

	Shopping i1 = new  Shopping("Ipad",499);

	Shopping i2 = new  Shopping("Ipad",599);

	// Compare two objects are equal or not using Equals() method

	boolean res =i1.equals(i2);
	System.out.println("Checking Equals : " + res);
	// Compare two objects using ShoppingComparator

	ShoppingComparator c1 = new ShoppingComparator();
	int x = c1.compare(i1, i2);
	System.out.println("Checking Equals using Comparator: " + x);



	list.add(new Shopping("Apple Iphone", 999.99));
	list.add(i1);
	list.add(new Shopping("Samsung Galaxy", 399.99));
	list.add(new Shopping("Mac Pro", 1899.99));

	boolean y = list.contains(i1);
	System.out.println("I1 is in the list : " + y);



	//	System.out.println(list);

	Shopping item0 = list.get(0);
	System.out.println("Intem in the position 1" + item0);
	System.out.println("Total Price :" + total(list));

	System.out.println("List has more than 500");
	List<Shopping> res1 = More500(list);
	System.out.println(res1);
	Collections.sort(list,new ShoppingComparator());
	System.out.println("Sorted Collection by Name" + "\n"+ list);

	ShoppingPriceCom com = new ShoppingPriceCom();
	Collections.sort(list,com);
	System.out.println("Sorted Collection by Price" + "\n"+ list);
}
public static List<Shopping> More500(List<Shopping> list){

	List<Shopping> temp = new ArrayList<>();
	for(Shopping item : list){
		if(item.getPrice()>500){
			temp.add(item);
		}
	}
	return temp;
}

public static double  total(List<Shopping> list){

	double sum = 0.0;
	for(Shopping item : list){
		sum+=item.getPrice();
	}
	return sum;
}
}
