package lesson3;

import java.util.Scanner;

import lesson2.RandomNumbers;

public class prog2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		
		System.out.println("***********************");
		System.out.println(" Enter C for circle " );
		System.out.println(" Enter R for rectangle " );
		System.out.println(" Enter T for triangle " );
		System.out.println("***********************");
				
		Scanner in = new Scanner(System.in);		
		String option = in.next();
		
		switch (option) {
		case "C":
			System.out.print(" Enter Radius : " );
			double varRadius = in.nextDouble();
			Circle circl = new Circle(varRadius);
			double areaCircle= circl.computeArea();
			System.out.println("Asnwer : "+areaCircle);
			break;
		case "R":
			System.out.print(" Enter Witdh : " );
			double varWidth = in.nextDouble();
			System.out.print(" Enter height : " );
			double varHeight = in.nextDouble();
			Rectangle rec = new Rectangle(varWidth,varHeight);
			double areaRec = rec.computeArea();		
			System.out.println("Asnwer : "+areaRec);
			break;	
		case "T":
			System.out.print(" Enter Base : " );
			double varBase = in.nextDouble();
			System.out.print(" Enter height : " );
			double varHeightT = in.nextDouble();
			Triangle triang = new Triangle(varBase,varHeightT);
			double areaTraigle = triang.computeArea();
			System.out.println("Asnwer : "+areaTraigle);
			break;
		default:
			break;
		}
	}

}
