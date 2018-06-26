package inclasslecturedemo.demoinhe;

public class Book {
	private String title;
	String authour;
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthour() {
		return authour;
	}

	public void setAuthour(String authour) {
		this.authour = authour;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	protected double price;
   
	
	public Book(String title, String authour, double price){
		this.title = title;
		this.authour = authour;
		this.price =price;
	}
	// Common behaviour
	
	public void read(){
		System.out.println("Can read ebook and paperbook");
	}
	
	public void turn(){
		System.out.println("Can turn manually or electronically");
	}

	@Override
	public String toString() {
		return "Book [title=" + title + ", authour=" + authour + ", price=" + price + "]";
	}
	
	
}
