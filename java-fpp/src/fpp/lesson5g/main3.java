package lesson5g;

import Day4.CloneExp;

public class main2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Computer Cmp1 = new Computer("HP", "2,4GHz", 1024, 2048);
		
		Person p1 = new Person("Carlos",Cmp1);
		
		try
	    {
	        //Creating a clone of Person1 and assigning it to Person2	 
			Person p2= (Person) p1.clone(); 
			System.out.println(p2.getName());
			System.out.println(p2.getComputer());
	    }
	    catch (CloneNotSupportedException e)
	    {
	        e.printStackTrace();
	    }
		
		
		
	}

}
