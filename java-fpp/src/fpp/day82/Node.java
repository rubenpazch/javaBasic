package day82;

import java.awt.List;

public class Node {
	
	public	int data;
	public	Node pre;
	public	Node next;
	@Override 
	public String toString(){
		return data+"";
	}
	public Node()
	{}
	public Node  (Node Previous,int data, Node Next)
	{
		this.data= data;
		this.pre=Previous;
		this.next=Next;
	}
	/*public void add (Node In) {
		if(this.next == null)
		{
			this.data=In.data;
			this.next=null;
			this.pre=null;
		}else {
			Node temp = new Node();
			temp.data = this.data;		
			temp.pre=In;
			this.data=In.data;
			this.next=temp;
		}
	}*/
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Node n1 = new Node();
		//n1.add(10);
		
		
		/*Node n1 = new Node();
		n1.data=10;		
		n1.pre=null;
		n1.next=null;
		
		Node n2 = new Node();
		n2.data=20;	
		n2.pre=n1;
		n1.next=n2;
		n2.next=null;
		
		Node n3 = new Node();
		n3.data=30;
		n3.pre=n1;
		n3.next=n2;
		n1.next=n3;		
		n2.pre=n3;
		//n2.next=null;
				

		
		System.out.println(n1);		
		System.out.println(n1.next);
		System.out.println(n1.next.next);*/
		//System.out.println(n2.toString());
		
	}	

}
