package lesson2democode;

import java.util.Arrays;

public class ArrayCopyTest {
	public static void main(String args[]){

		int[] smallPrimes = { 2, 3, 5, 7, 11};
		int[] copy = new int[5];
		int[] copy1 = new int[5];
		System.arraycopy(smallPrimes, 0, copy, 0, 4);
		System.out.println(Arrays.toString(copy));		
		int[] luckyNums = {350, 400, 150, 200, 250};
		//int[] luckyNums=null;
		//System.arraycopy(smallPrimes, 1, luckyNums, 2, 2);
		System.out.println(Arrays.toString(luckyNums));
		// Array Copy
		int[] temp = Arrays.copyOf(smallPrimes, 4); // pass original array and length
		System.out.println(Arrays.toString(temp));
		
		
}
}