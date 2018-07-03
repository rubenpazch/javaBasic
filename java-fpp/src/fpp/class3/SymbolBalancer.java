package fpp.class3;


import java.util.Stack;

import javax.swing.plaf.synth.SynthSeparatorUI;

public class SymbolBalancer {

	public static void main(String[] args) {
		SymbolBalancer sb = new SymbolBalancer();
		String result="(a+b[(x+y)+10])"; // true
		String result2="a+b + x+y)+10])"; // false
		String result3="((a+b[(x+y)+10])"; // false
		String result4="(a+b[(x+y)+10]))"; // false

		System.out.println(sb.symbolsBalanced(result));
		System.out.println(sb.symbolsBalanced(result2));
		System.out.println(sb.symbolsBalanced(result3));
		System.out.println(sb.symbolsBalanced(result4));

	}

	boolean symbolsBalanced(String delimiters) {
		Stack s = new Stack<>();
		boolean result = false;
		for (int i = 0; i < delimiters.length(); i++) {
			if(delimiters.charAt(i)=='(' || delimiters.charAt(i)=='[')
			{
				s.push(delimiters.charAt(i));
			}
		}
		if(!s.isEmpty()) 
		{
			for (int i = 0; i < delimiters.length(); i++) {		
				if(!s.isEmpty()) 
				{
					if(delimiters.charAt(i)==')'  && s.peek().equals('('))
					{	
						s.pop();
						result = true;
					}
					else if(delimiters.charAt(i)==']' && s.peek().equals('['))
					{
						s.pop();
						result = true;
					}					
					else {
						result = false;
					}
				}else {
					result = false;
				}
			}

			if(!s.empty()) {
				result = false;
			}

		}else {
			result = false;
		}
		return result;
	}


}
