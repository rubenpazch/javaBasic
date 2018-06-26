package lesson2democode;

public class ForVariationSyntax {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		for(int num=1;; num++)
		{
			System.out.println(num);
			if(num==5)
			{
				break;
			}
			
		}
		for(int num=1;num<=5;System.out.println(num),num++);
		// Factorial 
		for(int i=1, f=1;i<=5;f=f*i,System.out.println(i + "! =" +f),i++);
		// Display 1-5 in ascending and descending order
		for(int num=1,num2=5;num<=5 && num2>=1;System.out.println(num+" "+num2),num++,num2--);
		for(int i=10,j=20;;);// ok
					
		//double d1=20.5;
		//for(int i=10,double d1=21.5;;);// different type does not allow in initialization;
		//indefinite loop
				
	}

}
