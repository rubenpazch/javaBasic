package Day8.LinkedList;

/********* end binary search methods *****/

public class Node  {
	String value;
	Node next;
	Node previous;
	Node(){}
	Node(Node next, Node previous, String value){
		this.next = next;
		this.previous = previous;
		this.value = value;
	}
	public String toString(){
		return value;
	}
}