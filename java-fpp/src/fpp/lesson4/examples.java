package lesson4;

public class examples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//String a = "Hello";
		//System.out.println(reverse(a));
		
		//System.out.println(fac(3));
		//printLn1(23876);
		//printLn2(123,2);
		int num=3;
		System.out.println("moves in the tower of hanoi are ");
		towerofHanoi(num, 'A', 'C', 'B');
	}
	
	public static String reverse(String str) {
	    if ((null == str) || (str.length() <= 1)) {
	        return str;
	    }
	    return reverse(str.substring(1)) + str.charAt(0);
	    
	    //System.out.println();
	}
	public static double fac(double n)
	{
		if(n==1 || n==0)
		{
			return 1;
		}else
		{
			return  n*fac(n-1);
		}
	}
	public static void printLn1(int number)
	{
		char digit =(char) (number%10+'0');
		number=number/10;
		if(number!=0)
			printLn1(number/10);
		System.out.println(" "+digit);
	}
	public static void printLn2(int number, final int base)
	{
		String conversion = "0123456789ABCDEF";
		char digit =(char) (number%base);
		number=number/10;
		if(number!=0)
			printLn2(number,base);
		System.out.println(" "+conversion.charAt(digit));
	}
	public static void towerofHanoi ( int num, char src, char dst, char temp)
	{
		if(num<1)
			return;
		towerofHanoi(num-1, src,temp , dst);
		System.out.println("Move "+num+" Disk from peg "+src+ " to peg "+ dst);
		towerofHanoi(num-1, temp, dst, src);
	}
}
