package fpp.class4;

public class StringListTest {
	
	private final int INITIAL_LENGTH = 2;
	private String[] strArray;
	private int size;

	public StringListTest() {
		strArray = new String[INITIAL_LENGTH];
		size = 0;
	}

	public void add(String s) {
		
		if(size == strArray.length)
			resize();
		
		strArray[size] = s;
		size++;

	}

	public String get(int i) {
		
		if(i < 0 || i >= size)
			return "invalid index";
		
		return strArray[i];
	}

	public boolean find(String s) {
		
		for (int i = 0; i < size; i++) {
			if(strArray[i].equals(s))
				return true;
		}
		return false;
	}

	public void insert(String s, int pos) {
		
		if(pos == size)
			resize();
		for (int i = size - 1; i >=pos; i--) {
			strArray[i+1] =strArray[i];
		}
		strArray[pos]=s;
		size++;
	}

	public boolean remove(String s) {

		int index = -1;
		//find index 
		for (int i = 0; i < size; i++) {
			if(strArray[i].equals(s))
				index = i;
		}
		if (index != -1) {

			for (int i = index; i < size; i++) {

				strArray[i] = strArray[i + 1];

			}
			size--;

			return true;
		}
		
		return false;
	}

	private void resize() {

		String[] temp = new String[2 * strArray.length];

		System.arraycopy(strArray, 0, temp, 0, strArray.length);

		strArray = temp;

	}

	public String toString() {

		int iMax = strArray.length - 1;

		StringBuilder b = new StringBuilder();
		b.append('[');
		for (int i = 0;; i++) {
			b.append(strArray[i]);
			if (i == iMax)
				return b.append(']').toString();
			b.append(", ");
		}

	}

	public int size() {
		return size;
	}
	
	/**
     * Returns the index of the first occurrence of the specified element
     * in this list, or -1 if this list does not contain the element.
     */
	public int indexOf(String o) {
		//implement
		int index=-1;
		for (int i = 0; i < strArray.length; i++) {
			if(o.equals(strArray[i]))
				index= i;
			
		}
		
		return index;
	}

	/**
     * Returns true if this list contains the specified element.
     */
    public boolean contains(String o) {
    	//implement
    	boolean result = false;
    	for (int i = 0; i < strArray.length; i++) {
			if(o.equals(strArray[i]))
				return true;
			
		}
    	return result;
    }
	public static void main(String[] args) {

		StringListTest courses = new StringListTest();
		courses.add("FPP");
		courses.add("MPP");
		courses.add("WPP");

		System.out.println(courses.size() + " " + courses.toString());

		System.out.println(courses.get(0));
		System.out.println(courses.get(3));

		System.out.println(courses.find("FPP"));
		System.out.println(courses.find("ALGO"));

		courses.insert("ALGO", 1);
		System.out.println(courses.size() + " " + courses.toString());

		courses.insert("LOVE", 4);
		System.out.println(courses.size() + " " + courses.toString());

		courses.remove("FPP");
		System.out.println(courses.size() + " " + courses.toString());
		
		// Check if an ArrayList contains a given element
        System.out.println("Does courses array contain \"ALGO\"? : " + courses.contains("ALGO"));

        // Find the index of the first occurrence of an element in an ArrayList
        System.out.println("indexOf \"ALGO\": " + courses.indexOf("LOVE"));


	}

}
