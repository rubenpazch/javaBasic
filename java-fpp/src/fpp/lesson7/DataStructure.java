package lesson7;

public class DataStructure {
	//create an array
	private final static int SIZE = 15;
	private int[] arrayOfInts = new int[SIZE];

	public DataStructure() {
		//fill the array with ascending integer values
		for (int i = 0; i < SIZE; i++) {
			arrayOfInts[i] = i;
		}
	}
	public void printEven() {
		//print out even values of the array
		InnerEvenIterator iterator = this.new InnerEvenIterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.getNext() + " ");
		}
	}



	//inner class implements the Iterator pattern
	private class InnerEvenIterator {
		//start stepping through the array from the beginning
		private int next = 0;
		public boolean hasNext() {
			//check if a current element is the last in the array
			return (next <= SIZE);
		}
		public int getNext() {
			//record an even element of the array
			int retValue = arrayOfInts[next];
			//get the next even element
			next += 2;
			return retValue;
		}
	} // end of inner class
	public static void main(String s[]) {
		//fill the array with integer values and print out only even numbers
		DataStructure ds = new DataStructure();
		ds.printEven();
	}
} // end of DataStructure class 