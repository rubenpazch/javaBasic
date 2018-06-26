package lesson9;

public class Node
{
	String data;
	Node next;
	Node prev;

	public Node(String data,Node next, Node prev){

		this.next=next;
		this.data=data;
		this.prev=prev;

	}
	public Node(){

	}
	public String getData(){

		return data;
	}
	public void setData(String data){

		this.data=data;
	}
	public Node getNext(){

		return next;
	}
	public void setNext(Node next){
		this.next=next;
	}
	public Node getPrev(){

		return prev;
	}
	public void setPrev(Node prev){
		this.prev=prev;
	}
}