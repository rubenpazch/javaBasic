package Day8.lesson8comparator.InClassDemo;
import java.util.Comparator;

//Comparator as a Parameterized  type
public class ShoppingPriceCom implements Comparator<Shopping>{

	@Override
	public int compare(Shopping o1, Shopping o2) {
		
	/*	if(o1.getPrice()>o2.getPrice()) 
			return 1;
		else
			if(o1.getPrice()<o2.getPrice())
				return -1;
			else
		return 0;*/
		return Double.compare(o2.getPrice(), o1.getPrice());
	}

}
