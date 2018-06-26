package inclasslecturedemo.demoinhe;

public class PaperBook extends Book{
	boolean color;
	
	public PaperBook(String name, String authour, double price, boolean color){
		// super helps to call Parent class constructor, methods, data member
		super(name,authour,price);
		this.color = color;
		
	}
	public boolean exchange(){
		System.out.println("Exchangeable");
		return true;
	}
	
	@Override
	public void read(){
		System.out.println("Read Through your manually");
	}
    
    @Override
    public void turn(){
		System.out.println("Can turn thru manually");
	}

}
