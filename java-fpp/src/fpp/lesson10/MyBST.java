package lesson10;
import java.util.Iterator;
import java.util.TreeMap;
import java.util.TreeSet;

import javax.swing.plaf.synth.SynthScrollBarUI;
// Demo code for the user implemenation of Binary search tree
public class MyBST {
	/** The tree root. */
	private BinaryNode root;
	public MyBST() {
		root = null;
	}
	/**
	 * Prints the values in the nodes of the tree
	 * in sorted order. Inorder Traversal
	 */
	public void printTree() {
		if( root == null )
			System.out.println( "Empty tree" );
		else
			printTree(root);
	}
	// Inorder Traversal to print the nodes in Ascending order
	private void printTree( BinaryNode t ){
		if( t != null ){
			printTree( t.left );
			System.out.print(t.element+",");
			printTree( t.right );
		} 
	}		 
	//Assume the data in the Node is an Integer.
	public void insert(Integer x) {
		if (root == null) {
			root = new BinaryNode(x);
			return;
		}
		else { 
			BinaryNode n = root;
			boolean inserted = false;

			while(!inserted)//true
			{
				if(x.compareTo(n.element)<0) {
					//space found on the left
					if(n.left == null){
						n.left = new BinaryNode(x,null,null);
						inserted = true;
					}
					//keep looking for a place to insert (a null)
					else {
						n = n.left;
					}
				}				
				else if(x.compareTo(n.element)>0){ 
					//space found on the right					
					if(n.right==null){
						n.right = new BinaryNode(x,null,null);
						inserted = true;
					}
					//keep looking for a place to insert (a null)
					else {
						n = n.right;
					}

				}
				// if a node already exists
				else {
					inserted = true;
				}

			}

		}
	}
	public void preOrder()
	{
		preOrder(root);
	}
	private void preOrder(BinaryNode t)
	{
		if (t == null)
			return; 

		System.out.print(t.element + " "); 

		preOrder(t.left);

		preOrder(t.right);
	}
	public void postOrder(){
		postOrder(root);
	}
	private void postOrder(BinaryNode t){ 
		if (t == null)
			return;

		postOrder(t.left);

		postOrder(t.right);

		System.out.print(t.element + " ");
	}
	private boolean containsNodeRecursive(BinaryNode current, int value) {
		if (current == null) {
			return false;
		} 
		if (value == current.element) {
			return true;
		} 
		return value < current.element
				? containsNodeRecursive(current.left, value)
						: containsNodeRecursive(current.right, value);
	}
	public boolean contains(int value) {
		return containsNodeRecursive(root, value);
	}
	public Integer getRoot()
	{
		//implement
		if(root!=null)
			return root.element;
		else 
			return 0;
	}
	
	public static void main(String[] args) {

		MyBST mybst = new MyBST();

		int [] a = {15, 12, 9, 56, 1, 16, 19, 22, 3, 100, 2, 25};

		for (int j = 0; j < a.length; j++ ) {
			mybst.insert(a[j]);

		}
		mybst.insert(12);
		mybst.printTree();
		
		
		
		/*

		TreeSet<Integer> ts = new TreeSet<Integer>();

		for (int j = 0; j < a.length; j++ ) {
			ts.add(a[j]);
			System.out.println("\nAfter inserting " + j + "th item " + a[j]);
			Iterator<Integer> it = ts.iterator();		
			Integer nextItem = null;
			while(it.hasNext()) {
				nextItem = it.next();
				System.out.print(nextItem + " ");
			} 
			System.out.println();
		}

		TreeMap<Integer, String> map = new TreeMap<Integer, String>();
		map.put(8, "Hello");
		map.put(10, "World!");
		map.put(11, "Welcome");
		map.remove(8);
		String str = map.get(11)+", "+ map.get(10);
		System.out.println(str);

		//pre-order
		System.out.println("Pre-order");
		mybst.preOrder();
		//pre-order
		System.out.println("");
		System.out.println("Post-order");
		mybst.postOrder();

		//contains
		System.out.println("");
		System.out.println(mybst.contains(9));
	*/

	}
}
