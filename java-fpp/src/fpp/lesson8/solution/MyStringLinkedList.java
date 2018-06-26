package lesson8.solution;


public class MyStringLinkedList {
	Node header;

	MyStringLinkedList() {
		header = null;
	}	
	public void addSort(String item) {
		// If the list is empty
		if (header == null) {
			header = new Node(null, item, null);
		} else
		// Check if the item is less than the header
			if (header.value.compareTo(item) > 0) 
			{
				Node newNode = new Node(null, item, header);
				header = newNode;
			} else 
			{
				// Finding the correct position to insert a node
				Node current = header;
				Node previous = null;
				while (current != null && item.compareTo(current.value) > 0) {
					previous = current;
					current = current.next;
				}
				// Inserting node in the end
				if (current == null) {
					previous.next = new Node(previous, item, null);
				} else // Node to be insert in between previous and next
				{
					Node n = new Node(previous, item, current);
					previous.next = n;
					current.previous = n;
				}
			}
	}
	

	
	public int size() {
		int count = 0;
		if (header == null)
			return 0;
		else {
			Node temp = header;
			while (temp != null) {
				count++;
				temp = temp.next;
			}
		}
		return count;
	}

	public boolean isEmpty() {
		if (header == null)
			return true;
		else
			return false;
	}

	// implement code
	public Node getFirst() {
		return header;
	}

	// implement code
	public Node getLast() {
		return this.findLast();
	}

	// implement code
	public void removeFirst() {
	    if (header != null) {
			header.next.previous = null;
			header = header.next;
		}
	    else
	    	System.out.println("List is empty");
	}

	// implement code
	public void removeLast() {
		Node temp = this.findLast();
		if(temp==null){
			System.out.println("Can't delete");
		}
		else
		{
		temp.previous.next = null;
		temp.previous = null;
		}
	}

	// implement code
	public void printMin() {
		Node min = header;
		if (header != null) {
			Node temp = header;
			while (temp != null) {
				if (temp.toString().compareTo(min.toString()) <= 1) {
					min = temp;
				}
				temp = temp.next;
			}
		}
		System.out.println(min);
	}

	public Node findItem(String str) {
		if (header == null)
			return null;
		else {
			Node temp = header;
			while (temp != null)
				if (str.equals(temp.value))
					return temp;
				else
					temp = temp.next;
			return null;
		}
	}
	
	public boolean contains(String str) {
		if (header == null)
			return false;
		else {
			Node temp = header;
			while (temp != null)
				if (str.equals(temp.value))
					return true;
				else
					temp = temp.next;
			return false;
		}
	}
	

	public void deleteNode(Node n) {
		if (header != null && n != null) {
			if (n.next == null && n.previous == null) {
				// only one node
				header = null;
				n = null;
				System.out.println("Header Removed");

			} else if (n.previous == null) {
				// remove first node
				n.next.previous = n.previous;
				header = n.next;
				n = null;
				System.out.println("First node Removed");
			} else if (n.next == null) {
				// remove last node
				n.previous.next = n.next;
				n = null;
				System.out.println("Last Node Removed");
			} else {
				// general case
				n.next.previous = n.previous;
				n.previous.next = n.next;
				n = null;
				System.out.println("Given node is deleted");
			}
		}

	}

	public String toString() {
		String str = "";
		Node temp = header;
		while (temp != null) {
			str = str + "-->[" + temp.value.toString() + "]";
			temp = temp.next;
		}
		str = str + "-->[" + "NULL" + "]";
		return str;
	}

	public Node findLast() {
		if (header == null)
			return null;
		else {
			Node temp = header;
			while (temp.next != null)
				temp = temp.next;
			return temp;
		}
	}

	class Node {
		String value;
		Node next;
		Node previous;

		Node(Node previous, String value, Node next) {
			this.previous = previous;
			this.value = value;
			this.next = next;
		}

		public String toString() {
			return value;
		}
	}

	public static void main(String[] args) {
		MyStringLinkedList mySL = new MyStringLinkedList();
		System.out.println(mySL);
		mySL.addSort("Banana");
		mySL.addSort("Apple");
		mySL.addSort("Dates");
		mySL.addSort("Carrot");
		mySL.addSort("Tomato");
		
		
		/*
		System.out.println(mySL);
		System.out.println("Size of the List  " + mySL.size());
		System.out.println("IsEmpty : " + mySL.isEmpty());
		System.out.println("First Node : " + mySL.getFirst().value);
		System.out.println("Last Node : " + mySL.getLast().value);
		System.out.println("Check Apple is in the List  : " + mySL.contains("Apple"));
		System.out.println("Check Grapes is in the List  : " + mySL.contains("Grapes"));
		mySL.removeFirst();
		mySL.removeLast();
		System.out.println(mySL);
		//mySL.print();
*/
	}

}
