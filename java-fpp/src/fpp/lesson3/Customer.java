package lesson3;

public class Customer {
	
	//properties
	public String firstName;
	public String lastName;
	public String socSecurityNum;
	public Address billingAddress;
	public Address shippingAddress;
	
	//set a get methos
	public String getSocSecurityNum() {
		return socSecurityNum;
	}
	public void setSocSecurityNum(String socSecurityNum) {
		this.socSecurityNum = socSecurityNum;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public void setBillingAddress(Address billingAddress) {
		this.billingAddress = billingAddress;
	}
	public Address getBillingAddress() {
		return billingAddress;
	}
	
	public void setShippingAddress(Address shippingAddress) {
		this.shippingAddress = shippingAddress;
	}
	
	
	//constructor
	public Customer (String firstName, String lastName, String socSecurityNum)
	{
		this.firstName=firstName;
		this.lastName=lastName;
		this.socSecurityNum=socSecurityNum;
	}
	
	public String toString() 
	{
		return "[" + firstName + ", " + lastName + ", " + "ssn: " + socSecurityNum + "]";
	}
	
}
