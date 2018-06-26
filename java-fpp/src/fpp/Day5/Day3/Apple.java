package inclasslecturedemo;

public class Apple {
	String color;
	double weight;
	public Apple(String color, double weight){
		this.color = color;
		this.weight = weight;
	}
	@Override
	public String toString(){
		return color + " " + weight;
	}
	@Override
	public boolean equals(Object ob){
		if(ob==null) return false;
	//	if(!(ob instanceof Apple)) return false;
		if(this.getClass() != ob.getClass())
		return false;
			Apple a = (Apple)ob;
		if(this.color.equals(a.color) && this.weight ==a.weight)
		return true;
		else
		return false;

	}
	
	@Override
	public int hashCode(){
		int hash = 13;
		hash += color.hashCode();
		hash+=Double.doubleToLongBits(weight);
		return hash;
		
	}
	
	
}
