package lesson7;

public class mitern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a = "xyyaccckk";
		System.out.println(recursion(a));
	}
	public static String recursion (String word){
		if(word.length()==1)
			return word;
		if(word==null)
			return word;
		if(word.charAt(0)==word.charAt(1))
			return recursion(word.substring(1));
		else 
			return word.charAt(0)+recursion(word.substring(1));
	}
}
