package lesson2;

public class Prog6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] array = new String[] {"horse", "dog", "cat", "horse","dog"};
		String[] temp= new String [array.length]; 
		int total = array.length;
		
		int r = 0;
		while(r<=total)
		{
			int s =r+1;
			while(s<=total)
			{				
				if(array[r]==array[s])
				{				
					array[r]=array[total-1];
					total--;					
				}				
				s++;
			}
			r++;
		}		
		for(int i = 0; i<total;i++)
		{
			System.out.println("-->"+array[i]);
		}
		
	
		
	}

}
