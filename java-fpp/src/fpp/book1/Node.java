@@package book1;

public class Node {
	private int Value;
	private Node lChild;
	private Node rChild;
	public Node (int v, Node l, Node r) {
		Value = v;
		lChild=l;
		rChild=r;
	}
	public Node (int v) {
		Value = v;
		lChild=null;
		rChild=null;
	}
	
}
