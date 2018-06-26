package lesson8;

public class MyStringLinkedList {
	Node header;
	private int size;
	MyStringLinkedList() {
		header = null;
		//header.next = null;
		//header.previous= null;
	}
	public void addFront(String Value) {		    
		Node new_Node = new Node(Value);		    
		new_Node.next = header;
		new_Node.previous = null;		    

		if(header != null)
			header.previous = new_Node;		    	

		header = new_Node;	
		size++;
	}
	public void addSort(String Value){ 
		Node newnode = new Node(Value);
		// Implement
		Node Current;
		if(header==null || header.value.compareTo(newnode.value)>=0)
		{
			newnode.next=header;
			header=newnode;
			size++;
		}else {
			Current = header;
			while(Current.next!=null && Current.next.value.compareTo(newnode.value)<0) {
				Current = Current.next;
			}
			newnode.previous=Current;
			Current.next=newnode;
			size++;
		}

	}  // insert in a Sorted Order
	public int size(){ 
		// Implement
		return size;
	}
	public boolean isEmpty(){
		// Implement
		if (header==null) {
			return true;
		}
		if(header.next==null && header.previous==null && header.value==null) {
			return true;
		}
		else {
			return false;
		}
	}  
	public Node getFirst(){
		return header;
		// Implement
	}
	public Node getLast(){
	// Implement
		Node current = new Node();
		current=header;
		while(current.next!=null)
		{			
			current=current.next;		
		}
		return current;
	}
	public void removeFirst(){
		if(this.header!=null)
		{
			header=header.next;
			header.previous=null;
			size--;
		}
	}
	void removeLast(){
		// Implement
		Node current =header;				
		while(current.next!=null)
		{		
			current=current.next;			
		}
		current.previous.next=null;
		//current.previous=null;		
	}
	//Write a recursive print method to display the elements in the list.
	public void print(Node n) {		
		if(n.next==null)
			System.out.println("");
		else			
			print(n.next);
			System.out.println(n.value+" ");
	}	 
	public String toString() {
		String str =""; 
		Node temp = header;
		while (temp != null) {
			str = str + "-->[" + temp.value.toString() + "]";
			temp = temp.next;
		}
		str = str + "-->[" + "NULL" + "]";
		return str;
	}
	public class Node {
		String value;
		Node next;
		Node previous;

		Node(Node previous, String value, Node next) {
			this.previous = previous;
			this.value = value;
			this.next = next;
		}
		Node(String value){
			this.value=value;
			this.next=null;
			this.previous=null;
		}
		Node (){}
		public String toString() {
			return value;
		}
	}
	public static void main(String[] args) {
		MyStringLinkedList mySL = new MyStringLinkedList();
		// Make use of the implemented methods
		
		System.out.println("--> Existe : "+mySL.isEmpty());
		mySL.addFront("Leon");
		mySL.addFront("Dinosaurio");		
		mySL.addSort("Perro");  
		System.out.println("--> Existe : "+mySL.isEmpty());
		mySL.addFront("Rata");		
		mySL.addSort("Zvion");		
		mySL.addSort("Futbol");		
		System.out.println(mySL.size);
		System.out.println("--> Obtener primero : "+mySL.getFirst());
		System.out.println("--> Obtener ultimo : "+mySL.getLast());
		System.out.println(mySL.toString());
		mySL.removeFirst();		
		System.out.println(mySL.toString());
		System.out.println("--> Obtener primero : "+mySL.getFirst());		
		mySL.removeLast();
		System.out.println(mySL.toString());
		System.out.println("--> Obtener ultimo : "+mySL.getLast());
		mySL.print(mySL.header);
		//System.out.println(mySL.toStringg());
	}

}
