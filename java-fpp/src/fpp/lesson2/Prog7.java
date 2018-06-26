package lesson2;

public class Prog7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int len = 0;
		int cont = 0;
		if(args != null) len = args.length;
		for(int i = 0; i < len; ++i) {
			if (args[i].charAt(0)=='A')
			{
				cont++;
			}
			System.out.println("total characters " + i + ": " + args[i].length());
		}
		System.out.println("Total with A : "+ cont);
	}

}
