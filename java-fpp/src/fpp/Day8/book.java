package Day8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class book {

	public static void main (String [] args) {
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		String s = br.readLine();
		
	}
	
	public static String getString() throws IOException
	{
	InputStreamReader isr = new InputStreamReader(System.in);
	BufferedReader br = new BufferedReader(isr);
	String s = br.readLine();
	return s;
	}
}
