package Day5.Day2;
abstract class staff 
{
	String firstName;
    String lastName;
    String securityNumber;
     staff(String first, String last, String ssn)
    {
                    firstName = first;
                    lastName = last;
                    securityNumber = ssn;
    } 
   public abstract void salary();
}
   
class parttime extends staff 
{
 	int h,w;
 		parttime( String f, String l, String s,int hours, int wages)
 	{
 		super(f,l,s);
		h=hours;
 		w=wages;
 	}
	public void salary()
	{
		System.out.println("Your Earning Today : $"+(h*w));
	}
	
  }

class permanent extends staff
{
 	int p;
	permanent( String f, String l, String s,int pay)
 	{
 		super(f,l,s);
		p=pay;
 		
 	}
	public void salary()
	{
		System.out.println("Your Earning : $"+p);
	}
	
	}
public class AbstractDemo {
	public static void main(String[] args) 
	{
		//staff ob = new staff();
		staff ob = new parttime("Amala","Singh","123-890",10,30); // up casting at work
		parttime p = new parttime("Sanjay","Khan","123-456",6,25);
		p.salary();
		permanent obj = new permanent("Kamal","Rav","456-789",3000);
		obj.salary();
		
	}
}
