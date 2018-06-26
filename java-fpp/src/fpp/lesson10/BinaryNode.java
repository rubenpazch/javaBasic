package lesson10;

//import lesson10.MyBST.BinaryNode;

public class BinaryNode {
	protected Integer element;// The data in the node
	protected BinaryNode left;      // Left child
	protected BinaryNode right;     // Right child	  
	// Constructors 

	BinaryNode( Integer theElement ){
		this( theElement, null, null );
	}	

	BinaryNode( Integer element, BinaryNode left, BinaryNode right ){
		this.element = element;
		this.left = left;
		this.right = right;
	}


}
