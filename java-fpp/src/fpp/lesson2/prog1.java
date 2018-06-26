package lesson2;
import lesson2.RandomNumbers;

public class prog1 {

	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		double resultA =  RandomNumbers.getRandomInt(1,9);
		resultA  = Math.pow(Math.PI,resultA);		
		System.out.println(resultA);
		
		double resultB =  RandomNumbers.getRandomInt(3,14);
		resultB  = Math.pow(resultB,Math.PI);		
		System.out.println(resultB);
		
	}

}
