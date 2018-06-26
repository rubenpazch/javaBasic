package day82;


public class LinkedList {
	Node header;
	
	public LinkedList ()
	{
		header=null;
	}
	public void Addfront (int Value)
	{
		if(header==null)
		{
			header = new Node(null,Value,null);
		}
		else
		{
			Node n = new Node(null,Value,header);
			header.next=this.header;
			header=n;			
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		linkedList ll = new linkedList();
		ll.Addfront(10);
		ll.Addfront(20);
		//ll.toString();
	}

}
