package lesson2;
import lesson2.RandomNumbers;
import java.util.Scanner;

public class prog5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i= 0;
		while(i<7)
		{
			System.out.println(" question number : "+(i+1) );
			System.out.println("");
			
			double a = RandomNumbers.getRandomInt(1,99);
			double b = RandomNumbers.getRandomInt(1,99);
			
			System.out.println("  "+a);
			System.out.println("+ "+b);
			System.out.println("______");
			
			
			Scanner in = new Scanner(System.in);
			System.out.print("= ");
			double c = in.nextDouble();
			
			Boolean result = (a+b==c)?true:false;
			
			if(result)
			{
				System.out.println(" correct ");
			}else
			{
				System.out.println(" false, corerct asnwer : "+(a+b));
			}
		i++;
		}
		System.out.println(" End of the test ");
	}

}
