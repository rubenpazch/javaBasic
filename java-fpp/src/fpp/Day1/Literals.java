package lesson2democode;

public class Literals {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int x = Integer.MAX_VALUE;
		int y = Integer.SIZE;
		int b = Integer.compare(x, y);
		System.out.println("x = " + x);
		System.out.println("y = " + y);
		System.out.println("b = " + b);
		int x1 = 0b111; // Binary Representation
		int x2 = 1234; // Decimal representation
		int x3 = 03456; // Octal
		int x4 = 0x12ab;//Hexa
		char c1 = '\52'; // Octal representation \000 - \377 - unicode range from 0 - 255
		char c2 = 'A';
		char c3 = '\u0041'; // Unicode escape sequence
		
		int million = 1_000_000; 	// From Java7	
		System.out.println(5.5f/0.0f); //  Infinity
		System.out.println(5.5f%0.0f); //  NaN

		//System.out.println(5/0);     //  Run time error – divide by zero
		
		System.out.println((int)1.7); // 1
		System.out.println((double)1 / 2); // 0.5
		System.out.println(1 / 2); // 0
		char ch = (char)65.89; 
		System.out.println(ch); // A
		int i = (int)'A'; 
		System.out.println(i); // 65
		int xy = 4;
		int y1= xy++;
		System.out.println(xy + " " + y1);
		
			
	}

}
