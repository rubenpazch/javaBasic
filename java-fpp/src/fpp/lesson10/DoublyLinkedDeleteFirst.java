package fpp.lesson10;

public class DoublyLinkedDeleteFirst {
	
	Node header;

	public DoublyLinkedDeleteFirst() {
		header = new Node();
	}	
	//removes the node at position 1 and returns
	//the string contained in that node
	public String deleteFirst() {		
		//implement
		String 	removed="";
		if(isEmpty()){
			return "is mepty";	
		}else if(header.next.next==null){
			return "is mepty";	
		}
		else {
			if(header.next.next.next==null)
			{
				Node temp = header.next.next;
				removed=temp.value;
				header.next.next =null;
			}
			else {
				Node temp = header.next.next.next;
				removed=temp.value;
				temp.previous=header.next;
				header.next.next = temp;	
			}
		}
		return removed;
	}

	public boolean isEmpty() {
		if (header.next==null)
			return true;
		else 
			return false;	
	}	

	// adds to the end of the list
	public void addLast(String item) {
		Node current= header;
		while (current.next != null) {
			current = current.next;
		}
		Node n = new Node();
		n.value = item;
		current.next = n;
		n.previous = current;

	}

	@Override
	public String toString() {

		StringBuilder sb = new StringBuilder();
		toString(sb, header);
		return sb.toString();

	}

	private void toString(StringBuilder sb, Node n) {
		if (n == null)
			return;
		if (n.value != null)
			sb.append(" " + n.value);
		toString(sb, n.next);
	}

	class Node {
		String value;
		Node next;
		Node previous;

		public String toString() {
			return value == null ? "null" : value;
		}
	}

	public static void main(String[] args) {
		DoublyLinkedDeleteFirst list = new DoublyLinkedDeleteFirst();
		list.addLast("Bob");
		list.addLast("Harry");
		list.addLast("Steve");
		list.addLast("pedro");
		System.out.println(list);
		String deleted = list.deleteFirst();
		System.out.println("This item was deleted: " + deleted);
		
		System.out.println(list);
		String deleted1 = list.deleteFirst();
		System.out.println("This item was deleted: " + deleted1);
		
		System.out.println(list);
		String deleted2 = list.deleteFirst();
		System.out.println("This item was deleted: " + deleted2);
		
		System.out.println(list);
		String deleted3 = list.deleteFirst();
		System.out.println("This item was deleted: " + deleted3);
		
		System.out.println(list);

	}
}
