package lesson8;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;


class sortMarketingByEmployeeName implements Comparator<Marketing>
{
    public int compare(Marketing a, Marketing b)
    {        
    	return a.productname.compareTo(b.productname); // Consistency with comparator
    }
}

public class Marketing implements Comparator<Marketing> {
	
	
	protected String employeename;
	protected String productname;
	protected double salesamount;
	
	public Marketing(String Employeename, String Productname, double Salesamount) {
		this.employeename=Employeename;
		this.productname=Productname;
		this.salesamount=Salesamount;
	}
	public Marketing() {}
	@Override
	public String toString() {
		return "Marketing [employeename=" + employeename + ", productname=" + productname + ", salesamount="+ salesamount + "]\n";
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
		{
			return true;
		}
		if (obj == null)
		{
			return false;
		}
		if (getClass() != obj.getClass())
		{
			return false;
		}		
		Marketing other = (Marketing) obj;
		return this.salesamount==other.salesamount ; 
	}
	@Override
	public int hashCode() {
		final int prime = 741;
		int result = 1;
		result = prime * result + ((this.employeename == null) ? 0 : this.employeename.hashCode());
		result = prime * result + ((this.productname == null) ? 0 : this.productname.hashCode());
		long  temp = Double.doubleToLongBits(salesamount);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}
	public int compare(Marketing a, Marketing b)
    {	
		Double value=a.salesamount-b.salesamount;
        return value.intValue();
    }
	public static List<Marketing>  listMoreThan1000( List<Marketing> list)	 {
		 	List<Marketing> lt = new ArrayList<>();
		 	for (Marketing element : list) {
		 		if(element.salesamount>1000) 
		 		{
		 			lt.add(element);
		 		}
		 	}
			return lt;
	}
	
	public static void main (String [] args) {
		List<Marketing>  database= new ArrayList<>();
		database.add(new Marketing("Pedro Rojas","Condorito",800.9));
		database.add(new Marketing("Ramon Rosales","Arroz",200.9));
		database.add(new Marketing("Ernesto Padilla","Camarones",1600.9));
		database.add(new Marketing("Jaime Cuadros","Pelotas",5300.9));
		database.add(new Marketing("Raul Cuadros","Leche",5300.9));
		database.add(new Marketing("Maria Cuadros","Yogurt",5300.9));
				
		System.out.println(database.toString());
		System.out.printf("Size before remove %s",database.size());
		database.remove(1);
		System.out.println("");
		System.out.printf("Size after remove %s",database.size());
		System.out.println("");
		database.forEach((v)->System.out.println(v.toString()));
		sortMarketingByEmployeeName comparator= new sortMarketingByEmployeeName();
		System.out.println("After Sort");
		database.sort(new Marketing(null,null,0));// using interfaces comparator
		database.forEach((v)->System.out.println(v.toString()));
		
		System.out.println("those greater than 1000");
		List< Marketing>  database_greater_that_1000=listMoreThan1000(database);
		database_greater_that_1000.sort(comparator);		
		database_greater_that_1000.forEach((v)->System.out.println(v.toString()));
		
	}
	
}
