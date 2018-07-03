package fpp.class4;


public class DemoLinkedList {

	Node header;
	int size;

	DemoLinkedList() {
		//implement
		header= new Node(null, null, null);
		size = 0 ;
	}

	// adds to the front of the list
	public void addFirst(String item) {
		//implement
		Node temp = header;
		
		if(isEmpty())
		{	
			Node newnode = new Node(header, item, null);
			header.next=newnode;
			size++;
		}else {
			Node newnode = new Node(header, item, header.next);
			temp.next.previous =newnode;
			temp.next=newnode;
			header=temp;
			size++;
		}		
	}

	// adds to the end of the list
	public void addLast(String item) {
		//implement
				Node newnode;	
				if(isEmpty())
				{	
					newnode = new Node(header, item, null);
					header.next=newnode;
					size++;
				}else {
					
					Node current = header.next;
					while(current.next!=null) {	
						
						current=current.next;						
					}
					newnode = new Node(current, item, null);
					current.next=newnode;
					size++;
				}
	}

	

	// Count the number of nodes in the list
	public int nodes() {
		//implement
		return size;
	}

	public boolean isEmpty() {
		//implement
		if(header.next==null)
			return true;
		else 
			return false;
	}

	public String toString() {
		//implement
		String s ="";
		Node temp = header;
		while (temp.next!=null) {
			s = s+temp.next.value+",";
			temp= temp.next;			
		}
		
		return s;
	}

	class Node {
		String value;
		Node previous;
		Node next;

		Node(Node previous, String value, Node next) {
			this.previous = previous;
			this.value = value;
			this.next = next;
		}
	}

	// attempts to remove the first Node that contains
	// data; if successful, returns true; otherwise, false.
	public boolean removeFirst(String data) {

		//implement
				Node temp = header;
				
				if(isEmpty())
				{	
					return false;
				}else {
					while (temp.next!=null) {
						if(temp.value==data) {
							break;
						}
						else {
							temp= temp.next;		
						}
					}
					
					if(temp.previous.previous==null) 
					{
						temp.next.previous=header;
						header.next = temp.next;
					}
					else if (temp.next==null) {						
						temp.previous.next=null;
						temp.previous=null;
					}
					else 
					{
					Node next = temp.next;
					next.previous=temp;
					temp.previous.next=next;
					}
					return true;
					
				}		
	}

	public static void main(String[] args) {

		DemoLinkedList listFirst = new DemoLinkedList();
		listFirst.addFirst("Bob");
		listFirst.addFirst("Harry");
		listFirst.addFirst("Steve");
		listFirst.addFirst("John");
		System.out.println(listFirst);
		// System.out.println(listFirst.nodes());

		DemoLinkedList listLast = new DemoLinkedList();
		listLast.addLast("Bob");
		listLast.addLast("Harry");
		listLast.addLast("Steve");
		listLast.addLast("ramon");
		listLast.addLast("teresa");
		listLast.removeFirst("teresa");
		System.out.println(listLast);
		System.out.println(listLast);
		// System.out.println(listLast.nodes());

		DemoLinkedList emptyList = new DemoLinkedList();
		// System.out.println(emptyList.isEmpty());

	}

}

