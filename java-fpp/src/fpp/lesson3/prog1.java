package lesson3;

public class prog1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Address BillingAddress1= new Address("home1","cairo","Illinois","13213");
		Address BillingAddress2= new Address("home2","Moline","Illinois","12312");
		Address BillingAddress3= new Address("home3","chicago","Illinois","76545");
		Address BillingAddress4= new Address("home4","Springfield","Illinois","45344");
		Address BillingAddress5= new Address("home5","chicago","Illinois","43554");
		
		Address ShippingAddress1= new Address("home1","cairo","Illinois","13213");
		Address ShippingAddress2= new Address("home2","Moline","Illinois","12312");
		Address ShippingAddress3= new Address("home3","chicago","Illinois","76545");
		Address ShippingAddress4= new Address("home4","Springfield","Illinois","45344");
		Address ShippingAddress5= new Address("home5","chicago","Illinois","43554");
		
		Customer ocustomer1= new Customer("carlos", "paz", "324234234");
		ocustomer1.setBillingAddress(BillingAddress1);
		ocustomer1.setShippingAddress(ShippingAddress1);
		
		Customer ocustomer2= new Customer("raul", "apple", "324234234");
		ocustomer2.setBillingAddress(BillingAddress2);
		ocustomer2.setShippingAddress(ShippingAddress2);
		
		Customer ocustomer3= new Customer("pedro", "orange", "324234234");
		ocustomer3.setBillingAddress(BillingAddress3);
		ocustomer3.setShippingAddress(ShippingAddress3);
		
		Customer ocustomer4= new Customer("marco", "pear", "324234234");
		ocustomer4.setBillingAddress(BillingAddress4);
		ocustomer4.setShippingAddress(ShippingAddress4);
		
		Customer ocustomer5= new Customer("ronaldo", "lemon", "324234234");
		ocustomer5.setBillingAddress(BillingAddress5);
		ocustomer5.setShippingAddress(ShippingAddress5);
		
		
		Customer [] array = new Customer[5];
		array[0]=ocustomer1;
		array[1]=ocustomer2;
		array[2]=ocustomer3;
		array[3]=ocustomer4;
		array[4]=ocustomer5;
		
		for(Customer d : array)
		{
			if(d.billingAddress.getCity().equals("chicago"))
			{
				System.out.println(d+" City : "+d.billingAddress.getCity()+" state : "+d.billingAddress.getState()+" street :"+d.billingAddress.getStreet());
			}
		}
		
		
	}

}
