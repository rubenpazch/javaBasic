package lesson2democode;

public class StringBuilderDemo {
	public static void main(String[] args) {
		if(args == null || args.length == 0) {
		System.out.println("<no input>");
		}
		StringBuilder finalSentence = new StringBuilder(); 
		int len = args.length;
		for(int i = 0; i < len-1; ++i) {
			finalSentence.append(args[i]);
			finalSentence.append(" ");  //much more efficient
		}
		finalSentence.append(args[len-1]);
		finalSentence.append(".");
		// Convert the StringBuilder to a String at the end.
		String finalSentenceAsString = finalSentence.toString();
		System.out.println(finalSentenceAsString);
		}


}
