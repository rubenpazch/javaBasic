package inclasslecturedemo.demoinhe;

// Use extends to get Inheritance
public class Ebook extends Book{
	private String etype;

	public Ebook(String name, String authour, double price, String etype){
		// super helps to call Parent class constructor, methods, data member
		super(name,authour,price);
		this.etype = etype;
	}
	public boolean sharing(){
		System.out.println("Can Share ");
		return true;
	}
    @Override
	public void read(){
		System.out.println("Read Through your electronic device");
	}
    
    @Override
    public void turn(){
		System.out.println("Can turn electronically by swipe or click");
	}
}
