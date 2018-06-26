package nestedclass;

class RealEstateListing
{
private int listingNumber;
private double price;

public RealEstateListing(int num, double price, String address,
int sqFt)
{
listingNumber = num;
this.price = price;
HouseData1 hobj = new HouseData1(address,sqFt);
hobj.display();
}
public void display()
{
System.out.println("Listing number #" + listingNumber +
" Selling for $" + price);
}
// Inner class can be declared as private
 private class HouseData1
{
private String address;
private int sqFt;
public HouseData1(String address, int sqFt)
{
this.address = address;
this.sqFt = sqFt;
}
void display()
{
	System.out.println("Address: " + address);
	System.out.println("Square feet :" + sqFt );
}
}
}
public class RealEstate {

	public static void main(String[] args) {
		RealEstateListing obj = new RealEstateListing(120,15000,"North Court",2000);
		 obj.display();  
	}

}
