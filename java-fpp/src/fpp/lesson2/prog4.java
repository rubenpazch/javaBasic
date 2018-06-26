package lesson2;

import java.util.Scanner;

public class prog4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.print("Type string: ");
		String name = in.nextLine();
		
		String[] splited = name.split("");
		 
		
		for(int i = splited.length-1; i>=0; i--)
		{
			System.out.print(splited[i]);
		}
		
		
	}

}
