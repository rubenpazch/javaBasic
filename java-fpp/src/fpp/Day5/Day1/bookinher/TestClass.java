package inclasslecturedemo.demoinhe;

public class TestClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book b1 = new Book("Java","Horstman",49.99);
		Book b2 = new Ebook("Java","Horstman",49.99,"kindle");
		Book b3 = new PaperBook("Java8","Kishori",54.66,true);
    
        
		Book[] books = {b1,b2,b3};
		
	/*	for(Book ob : books){
			System.out.println("Object is from : " + ob.getClass().getSimpleName());
			System.out.println(ob);
			ob.read();
			ob.turn();
		}*/
		double res = call(books);
		System.out.println("Total Sum : " + res);
	}
	public static double  call(Book[] ob){
	   double tot = 0.0;
		for(Book x : ob){
			tot+=x.getPrice();
		}
		return tot;
		
	}

}
