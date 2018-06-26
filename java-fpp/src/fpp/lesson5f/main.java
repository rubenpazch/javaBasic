package lesson5f;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Computer Cmp1 = new Computer("HP", "2,4GHz", 1024, 2048);
		Computer Cmp2 = new Computer("DELL", "2,4GHz", 3024, 4048);
		Computer Cmp3 = new Computer("LENOVO", "2,4GHz", 2024, 5048);
		Computer Cmp4 = new Computer("HP", "2,4GHz", 1024, 2048);
		
		System.out.println(Cmp1.toString());
		System.out.println(Cmp2.toString());
		System.out.println(Cmp3.toString());
		
		boolean result = Cmp1.equals(Cmp2);
		System.out.println(result);
		boolean result1 = Cmp1.equals(Cmp4);
		System.out.println(result1);
		
		
	}

}
