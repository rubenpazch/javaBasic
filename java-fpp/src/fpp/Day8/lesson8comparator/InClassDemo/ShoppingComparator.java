package Day8.lesson8comparator.InClassDemo;

import java.util.Comparator;

// Comparator as a Raw type
public class ShoppingComparator implements Comparator{

	@Override
	public int compare(Object o1, Object o2) {
		Shopping s1= (Shopping) o1;
		Shopping s2= (Shopping) o2;
		if(s1.getIname().compareTo(s2.getIname())!=0)
		return s1.getIname().compareTo(s2.getIname());
		else
		return	Double.compare(s1.getPrice(), s2.getPrice());
	}

}
