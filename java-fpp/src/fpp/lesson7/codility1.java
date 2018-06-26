package lesson7;

public class codility1 {

	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr = new int[] {9, 3, 9, 3, 9, 7, 9};
		int result = solution(arr);
	}
	 public static int solution(int[] A) {
	        int result =0;
	        int lenA=A.length;
	        int temp []=new int[lenA-2];
	        int k=0;
	        
	        // write your code in Java SE 8
	        for (int i=0;  i<A.length;i++)    
	        {
	            for (int j=i+1;  j<A.length;j++)    
	            {
	                if(A[i]==A[j])
	                {
	                    System.arraycopy(A, j+1, temp, k, lenA-3);   
	                    A=temp;	                    
	                    lenA=lenA-2;
	                    temp=null;
	                    temp=new int[lenA-2];
	                    i=-1;
	                    break;
	                }
	                else
	                {
	                    temp[k]=A[j];
	                    k++;
	                }
	            }   
	            
	        }
	        
	        return result;
	    
	    }

}
