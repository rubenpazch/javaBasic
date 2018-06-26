package lesson2democode;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class UserInput {
	public static void main(String[] args) throws IOException{
		userInput1();
		userInput2();
		userInput3();
		
	}
	static void userInput1() {
		System.out.println("--------User Input using Swing--------");
		String input = JOptionPane.showInputDialog("Type your name");
		System.out.println("In dialog you wrote: " + input);
	}
	static void userInput2() {
		System.out.println("--------User Input using Scanner--------");
		Scanner sc = new Scanner(System.in);
		System.out.print("Type your name: ");
		System.out.println("you wrote: "+sc.next());
		System.out.print("Type your age: ");
		System.out.println("your age: "+sc.nextInt());

	}
	
	static void userInput3() throws IOException {
		System.out.println("--------User Input using BufferedReader--------");
		BufferedReader in = null;
		String input = null;
		in = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Type your name: ");
		input = in.readLine();
		System.out.println("Your wrote: " + input);
		in.close();

	}
	
	
}
