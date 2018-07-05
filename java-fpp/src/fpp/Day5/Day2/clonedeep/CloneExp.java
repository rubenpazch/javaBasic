package fpp.Day5.Day2.clonedeep;

class Address implements Cloneable 
{
	String houseNo;
	String address1;
	String address2;
	int zipcode;

	public Address(String houseNo, String address1, String address2, int zipcode) {
		this.houseNo = houseNo;
		this.address1 = address1;
		this.address2 = address2;
		this.zipcode = zipcode;
	}
	public Object clone() throws CloneNotSupportedException {

		Address clone=(Address)super.clone();
		return clone;
	}
	public String getHouseNo() {
		return houseNo;
	}
	public void setHouseNo(String houseNo) {
		this.houseNo = houseNo;
	}
	public String getAddress1() {
		return address1;
	}
	public void setAddress1(String address1) {
		this.address1 = address1;
	}
	public String getAddress2() {
		return address2;
	}
	public void setAddress2(String address2) {
		this.address2 = address2;
	}
	public int getZipcode() {
		return zipcode;
	}
	public void setZipcode(int zipcode) {
		this.zipcode = zipcode;
	}

}
class CloneExp implements Cloneable 
{

	private String name;
	private Address address;

	public CloneExp(){

	}
	public CloneExp(String name, Address add)
	{
		this.name = name;
		this.address = add;

	}
	public String toString()
	{
		String ot = this.name + "\n I am Living in  " + address.houseNo + " " + address.address1 + " " + address.address2 + " " + address.zipcode;
		return ot; 
	}

	public Object clone() throws CloneNotSupportedException {

		CloneExp clone=(CloneExp)super.clone();

		// Need to clone the Address reference variable too
		clone.address = (Address)this.address.clone();

		return clone;

	}

	public static void main(String[] args) throws CloneNotSupportedException 
	{

		// Deep copy of Cloning copy the objects instance references too

		CloneExp addObj = new CloneExp("Renuka", new Address("Apt. 1", "Utopia Park","West Avenue",52556));

		System.out.println("Before Cloning");
		System.out.println(addObj);

		CloneExp cloAdd= (CloneExp) addObj.clone(); 
		System.out.println("After Cloning");
		System.out.println(cloAdd);

		addObj.address.setHouseNo("11A");
		System.out.println("After Modifing the House No.");
		System.out.println(cloAdd);

	}
}


