package fpp.class2.nested;

import fpp.class2.*;

public class CallingClass {
	public String readVal() {
		MyClass cl = new MyClass();
		return cl.getVal(); //produces a compiler error -- how to fix?
		//return null;
	}
}
