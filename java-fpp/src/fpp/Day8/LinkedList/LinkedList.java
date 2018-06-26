package Day8.LinkedList;

public class LinkedList {

	Node header;
	LinkedList(){
		header = new Node(null,null, null);
	}
	public void add (String item) {
		if(header.next==null)
		{
			header.value=item;
		}else
		{
			
		}
	}
	/*public Node add(String item){
		Node n = new Node(header.next,header,item);
		if(header.next != null){
			header.next.previous = n;
		}		
		header.next = n;
		return n;
	}*/
	public static void main(String[]args){
		LinkedList l = new LinkedList();
		l.add("Bob");
		//l.add("Gerald");
		//l.add("Thomas");
		
	}
}


