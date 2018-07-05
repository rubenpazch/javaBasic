package fpp.Day1;

import java.io.IOException;
import java.util.Scanner;

public class GetCharInput {

		public static void main(String[] args) throws IOException {
			Scanner reader = new Scanner(System.in);
			System.out.println("Enter Character Input : ");
			char c = reader.next().charAt(0);
			System.out.println("Char = " + c);
			System.out.println("Enter Another Character Input : "); // read next byte of data and convert into char by casting
			char ch = (char) System.in.read();
			System.out.println("You Entered= " + ch);
			char userInput;
			
		}

}
