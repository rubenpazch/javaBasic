package lesson12exceptionhandling;

import java.io.IOException;

public class CheckedExpDemo {
  // Method1 to handle checked Exception using throws clause
	public static char readChar() //throws IOException
	{
		char c = '\u0000';
		int input = System.in.read(); // read a byte from a standard input 0-255
		if (input !=-1){ // return -1 if end of input is reached
			c = (char) input;
		}
		return c;
	}
	// Method2 to handle checked Exception using try-catch block
	
	 /*public static char readChar() //throws IOException
	{
		 char c = '\u0000';
	   try
	   {
		
		int input = System.in.read(); // read a byte from a standard input 0-255
		if (input !=-1){ // return -1 if of input is reached
			c = (char) input;
		}
		}
		catch(IOException e)
		{
		 System.out.println("IOException occured while reading the input.");
		 }
		return c;
	} 
	*/
	
	public static void main(String[] args) //throws IOException 
	{
		System.out.println("Enter a character :");
		System.out.println("You entered : " +readChar());
	}

}
