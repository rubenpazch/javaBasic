package lesson8;

class Search {
	int[] anArray;

	//anArray is a sorted array
	Search(int[] anArray){
		this.anArray = anArray;
	}
	//search a sorted array
	boolean search(int val) {
		boolean b = recurse(0,anArray.length-1, val);
		return b;
	}


	boolean recurse(int a, int b, int val) {
		int mid = (a+b)/2;
		if(anArray[mid] == val) return true;
		if(a > b) return false;
		if(val > anArray[mid]) return recurse(mid+1, b, val);
		return recurse(a,mid-1,val);
	}
	public static void main (String [] args) {
		int [] A = new int[] {6,4,5,9,8,7};
		Search s = new Search(A);
		boolean b = s.search(1);
		System.out.println(b);
	}
	
}