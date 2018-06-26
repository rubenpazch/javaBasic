package lesson4;

public class recursion1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int [] arr = new int[] {1,11,13,15,16,18,21,54,67,78};
		System.out.println(binarySearch(arr, 1, 10, 16));
	
		
	}

	public static String Merge(String A, String B)
	{
		if(A.length()==0 || A==null)
			return B;
		if(B.length()==0 || B==null)
			return A;
		if(A.charAt(0)>B.charAt(0))			
			return B.charAt(0) + Merge(A, B.substring(1));
		else 
			return A.charAt(0) + Merge(A.substring(1), B);
	}
	public String Min(String A)
	{
		if(A.length()==1 || A=="")
		{
			return A;			
		}
		else if(A.charAt(0)<A.charAt(1))
		{
			return Min( A.charAt(0)+A.substring(2));
		}
		else
		{
			return Min( A.substring(1));
		}
	}
	public static boolean IsPolidrom (String A)
	{
		int len=A.length();
		if(len<=1 || A==null)
			return true;
	
		if ((len%2==1)&&(A.charAt(0)==A.charAt(len-1)))
			return IsPolidrom(A.substring(1, len-1));
		else 
			return false;
	}
	public static int binarySearch(int Arr[],int low, int high, int value)
	{
		if(low>high)
			return -1;
		int mid=low+(high-low)/2;
		if(Arr[mid]==value)
			return mid;
		else if (Arr[mid]<value)
			return binarySearch(Arr, mid+1, high, value);
		else 
			return binarySearch(Arr, low, mid-1, value);
	}
}

/*	-------- 1 -----
 * 
 		String cadena1 = "ace";
		String cadena2 = "bdf";		
		System.out.println(Merge(cadena1,cadena2));	
 
 		String x="zkñl";
		System.out.println(Min(x));
		
 
 		
		
		String A = "pmacbabcamp";		
		System.out.println(IsPolidrom(A));
		
 * 
 * */
 