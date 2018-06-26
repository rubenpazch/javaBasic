package interfacedemo;

  interface First {
	int F = 20; 
    public void show_first();
   }

interface Second
 {
	int S = 10;
    public void show_second();
}
 
 class One {
     
    public void show_one()
    {
        System.out.println("Class One");
    }
 
}
class Two extends One implements First, Second {

//class Two extends One implements First, Second{
     
    public void show_first()
    {
        System.out.println("Interface first : " + F);
    }
    public void show_second()
    {   
    	//S = 30;
    	int x = F + S;
        System.out.println("Interface second : " + S);
    }
    public void show_two()
    {   
        System.out.println("Class two");
    }
 }
 public class InterfaceDemo {
	 public static void main(String[] args) {
		  	Two t=new Two();
		 	 t.show_first();
		     t.show_second();
		     t.show_one();
		     t.show_two();	
		      

		}

	}

